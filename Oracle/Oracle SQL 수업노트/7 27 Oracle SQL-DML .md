# 7/27 Oracle SQL-DML

날짜: 2026년 7월 27일
내용: DML

---

# 📌 DML(Data Manipulation Language)

## 1. INSERT

### 기본 INSERT

```sql
INSERT INTO student
VALUES(...);
```

> 테이블의 모든 컬럼에 값을 입력한다.
> 

---

### 특정 컬럼만 INSERT

```sql
INSERT INTO professor
(profno, name, position, hiredate, deptno)
VALUES
(9920, '최윤식', '조교수',
TO_DATE('2006/01/01','yyyy/mm/dd'),
102);
```

### 특징

- 원하는 컬럼만 입력 가능
- 생략한 컬럼은 NULL 또는 DEFAULT 값 저장

---

## 2. INSERT + SELECT

다른 테이블의 데이터를 그대로 복사

```sql
INSERT INTO t_student
SELECT *
FROM student;
```

---

# 📌 CREATE TABLE AS SELECT (CTAS)

## 구조만 복사

```sql
CREATE TABLE imsi_professor
AS
SELECT *
FROM professor
WHERE 1 = 0;
```

### 특징

- 컬럼명
- 데이터 타입
- 길이

만 복사된다.

데이터는 복사되지 않는다.

---

## 구조 + 데이터 복사

```sql
CREATE TABLE imsi_professor
AS
SELECT *
FROM professor;
```

> WHERE절을 제거하면 데이터까지 복사된다.
> 

---

# 📌 INSERT ALL

여러 테이블에 동시에 INSERT

```sql
INSERT ALL
INTO height_info VALUES(...)
INTO weight_info VALUES(...)
SELECT ...
FROM student;
```

### 특징

- 모든 INTO 실행

---

## 조건부 INSERT ALL

```sql
INSERT ALL
WHEN height > 170 THEN
    INTO height_info VALUES(...)
WHEN weight > 70 THEN
    INTO weight_info VALUES(...)
SELECT ...
FROM student;
```

### 특징

조건을 만족하는 모든 INTO 실행

---

# 📌 INSERT FIRST

```sql
INSERT FIRST
WHEN height > 170 THEN
    INTO height_info VALUES(...)
WHEN weight > 70 THEN
    INTO weight_info VALUES(...)
SELECT ...
FROM student;
```

### 특징

조건을 처음 만족하는 INTO 하나만 실행

---

# INSERT ALL vs INSERT FIRST

| INSERT ALL | INSERT FIRST |
| --- | --- |
| 모든 조건 실행 | 첫 번째 조건만 실행 |
| 여러 테이블에 입력 가능 | 하나의 테이블만 입력 |

---

# 📌 UPDATE

## 기본 UPDATE

```sql
UPDATE professor
SET position = '부교수'
WHERE profno = 9903;
```

---

## 서브쿼리 UPDATE

```sql
UPDATE student
SET (grade, deptno) =
(
    SELECT grade, deptno
    FROM student
    WHERE studno = 10103
)
WHERE studno = 10201;
```

### 특징

여러 컬럼을 한 번에 수정 가능

---

# 📌 DELETE

## 기본 DELETE

```sql
DELETE
FROM student
WHERE studno = 20103;
```

---

## 서브쿼리 DELETE

```sql
DELETE
FROM student
WHERE deptno =
(
    SELECT deptno
    FROM department
    WHERE dname='컴퓨터공학과'
);
```

---

# 📌 MERGE

두 테이블을 비교하여

- 있으면 UPDATE
- 없으면 INSERT

```sql
MERGE INTO professor p
USING professor_temp f
ON (p.profno = f.profno)

WHEN MATCHED THEN
UPDATE
SET p.position = f.position

WHEN NOT MATCHED THEN
INSERT (...);
```

---

# 📌 COMMIT / ROLLBACK

### COMMIT

```sql
COMMIT;
```

변경사항을 영구 저장

---

### ROLLBACK

```sql
ROLLBACK;
```

마지막 COMMIT 이전 상태로 복구

---

# ⭐ 시험 암기 포인트

- `INSERT INTO VALUES` → 직접 데이터 입력
- `INSERT INTO SELECT` → 다른 테이블 데이터 복사
- `CREATE TABLE ... AS SELECT ... WHERE 1=0` → **구조만 복사**
- `CREATE TABLE ... AS SELECT ...` → **구조 + 데이터 복사**
- `INSERT ALL` → 모든 조건 실행
- `INSERT FIRST` → 첫 번째 조건만 실행
- `UPDATE` → 데이터 수정
- `DELETE` → 데이터 삭제
- `MERGE` → UPDATE + INSERT 동시 수행
- `COMMIT` → 저장
- `ROLLBACK` → 마지막 COMMIT 이전으로 복구

이 정도만 정리해두면 현재 예제의 **중복을 대부분 제거하면서도 시험에 필요한 핵심 개념은 모두 포함**할 수 있어.