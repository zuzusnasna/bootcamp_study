# 7/27 Oracle SQL-SubQuery,DML 데이터조작어

날짜: 2026년 7월 27일
내용: DML, SubQuery

# 📚 Oracle SQL 정리

# 1. 서브쿼리(SubQuery)

> SELECT문 안에 또 다른 SELECT문을 사용하는 것
> 

```sql
SELECT 컬럼
FROM 테이블
WHERE 컬럼 = (
    SELECT ...
);
```

---

## ① IN

### 의미

여러 개의 결과값 중 하나라도 일치하면 참

> 다중행 서브쿼리에서 가장 많이 사용
> 

```sql
SELECT name, grade, deptno
FROM student
WHERE deptno IN (
    SELECT deptno
    FROM department
    WHERE college = 100
);
```

### 핵심

- 여러 행 반환 가능
- = 대신 사용

---

## ② ANY

### 의미

조건을 하나라도 만족하면 TRUE

예)

```sql
height > ANY(...)
```

↓

> 가장 작은 값보다만 크면 된다.
> 

```sql
SELECT studno, name, height
FROM student
WHERE height >
ANY(
    SELECT height
    FROM student
    WHERE grade='4'
);
```

---

## ③ ALL

### 의미

모든 값을 만족해야 TRUE

```sql
height > ALL(...)
```

↓

> 가장 큰 값보다 커야 한다.
> 

```sql
SELECT studno,name,height
FROM student
WHERE height >
ALL(
    SELECT height
    FROM student
    WHERE grade='4'
);
```

---

## ④ EXISTS

### 의미

서브쿼리 결과가 **1건이라도 존재하면 TRUE**

```sql
SELECT profno,name
FROM professor
WHERE EXISTS(
    SELECT *
    FROM professor
    WHERE comm IS NOT NULL
);
```

### 특징

- TRUE / FALSE만 판단
- 데이터는 가져오지 않음

---

## ⑤ NOT EXISTS

### 의미

결과가 없을 때 TRUE

```sql
SELECT 1
FROM dual
WHERE NOT EXISTS(
    SELECT userid
    FROM student
    WHERE userid='goodstudent'
);
```

---

## ⑥ 다중 컬럼 서브쿼리

여러 컬럼을 동시에 비교

```sql
WHERE (deptno, sal)
IN(
    SELECT deptno,sal
    FROM emp
    WHERE comm IS NOT NULL
);
```

---

## ⑦ 상관 서브쿼리(Correlated SubQuery)

메인쿼리의 값을 서브쿼리가 사용

```sql
SELECT name
FROM student s1
WHERE height >
(
    SELECT AVG(height)
    FROM student s2
    WHERE s2.deptno=s1.deptno
);
```

### 특징

- 메인쿼리 한 행마다 실행
- 성능이 일반 서브쿼리보다 떨어질 수 있음

---

# 2. INSERT

## 기본 INSERT

```sql
INSERT INTO student
VALUES (...);
```

---

## 원하는 컬럼만 입력

```sql
INSERT INTO professor
(profno,name,position)
VALUES
(9920,'최윤식','조교수');
```

---

## INSERT + SELECT

다른 테이블 데이터를 복사

```sql
INSERT INTO t_student
SELECT *
FROM student;
```

---

## CREATE TABLE AS SELECT

### 구조만 복사

```sql
CREATE TABLE test
AS
SELECT *
FROM student
WHERE 1=0;
```

### 구조 + 데이터 복사

```sql
CREATE TABLE test
AS
SELECT *
FROM student;
```

---

# 3. INSERT ALL

여러 테이블에 동시에 입력

```sql
INSERT ALL
INTO height_info
VALUES(...)
INTO weight_info
VALUES(...)
SELECT ...
FROM student;
```

### 특징

- 모든 조건 실행

---

# 4. INSERT FIRST

```sql
INSERT FIRST
WHEN 조건1 THEN
...
WHEN 조건2 THEN
...
SELECT ...
```

### 특징

처음 만족하는 조건만 실행

---

# INSERT ALL vs FIRST

| INSERT ALL | INSERT FIRST |
| --- | --- |
| 모든 조건 실행 | 첫 번째 조건만 실행 |
| 여러 테이블 입력 가능 | 하나만 입력 |

---

# 5. UPDATE

기본 문법

```sql
UPDATE 테이블
SET 컬럼=값
WHERE 조건;
```

예제

```sql
UPDATE professor
SET position='부교수'
WHERE profno=9903;
```

---

## UPDATE + 서브쿼리

```sql
UPDATE student
SET (grade,deptno)=
(
    SELECT grade,deptno
    FROM student
    WHERE studno=10103
)
WHERE studno=10201;
```

---

# 6. DELETE

기본

```sql
DELETE
FROM student
WHERE studno=20103;
```

---

## DELETE + 서브쿼리

```sql
DELETE
FROM student
WHERE deptno=
(
    SELECT deptno
    FROM department
    WHERE dname='컴퓨터공학과'
);
```

---

# 7. MERGE

### 의미

UPDATE + INSERT를 동시에 수행

```sql
MERGE INTO 대상테이블
USING 원본테이블
ON (조건)

WHEN MATCHED THEN
UPDATE ...

WHEN NOT MATCHED THEN
INSERT ...;
```

예제

```sql
MERGE INTO professor p
USING professor_temp f
ON(p.profno=f.profno)

WHEN MATCHED THEN
UPDATE SET p.position=f.position

WHEN NOT MATCHED THEN
INSERT (...);
```

---

# 8. COMMIT / ROLLBACK

## COMMIT

영구 저장

```sql
COMMIT;
```

---

## ROLLBACK

마지막 COMMIT 이전으로 복구

```sql
ROLLBACK;
```

---

# ⭐ 시험 핵심 암기

- `IN` → 여러 값 중 하나와 일치
- `ANY` → 하나라도 만족
- `ALL` → 모두 만족
- `EXISTS` → 결과 존재 여부만 확인
- `NOT EXISTS` → 결과가 없을 때 TRUE
- `상관 서브쿼리` → 메인쿼리 값을 서브쿼리가 사용
- `INSERT ALL` → 모든 조건 실행
- `INSERT FIRST` → 첫 번째 조건만 실행
- `MERGE` → UPDATE + INSERT
- `WHERE 1=0` → 테이블 구조만 복사
- `COMMIT` → 저장
- `ROLLBACK` → 복구