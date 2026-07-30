# 7/23 Oracle SQL-함수 및 그룹 함수 정리/조인

날짜: 2026년 7월 23일
내용: GROUP BY, JOIN, 함수

---

# 📌 1. NVL()

> NULL 값을 다른 값으로 변경하는 함수
> 

### ✔ 기본 문법

```sql
NVL(값, 대체값)
```

- 값이 NULL → 대체값 반환
- 값이 NULL이 아님 → 원래 값 반환

---

## 예제

```sql
SELECT name,
       sal,
       comm,
       sal + NVL(comm,0) total
FROM professor;
```

> 보직수당(comm)이 NULL이면 0으로 계산하여 급여와 합산한다.
> 

---

## 같은 결과

```sql
sal + NVL(comm,0)
```

↓

```sql
NVL(sal+comm,sal)
```

---

# 📌 2. NVL2()

> 첫 번째 값이 NULL인지 여부에 따라 다른 값을 반환한다.
> 

### ✔ 기본 문법

```sql
NVL2(값,
     NULL이 아닐 때 반환값,
     NULL일 때 반환값)
```

---

## 예제

```sql
SELECT name,
       sal,
       comm,
       NVL2(comm,sal+comm,sal) total
FROM professor;
```

---

## 결과

| comm | total |
| --- | --- |
| 100 | sal+100 |
| NULL | sal |

---

# 📌 3. NULLIF()

> 두 값을 비교하여 같으면 NULL, 다르면 첫 번째 값을 반환한다.
> 

### ✔ 기본 문법

```sql
NULLIF(값1, 값2)
```

---

## 예제

```sql
SELECT name,
       userid,
       NULLIF(LENGTH(name)*2,
              LENGTHB(userid)) result
FROM professor;
```

---

# 📌 4. COALESCE()

> 여러 값 중 NULL이 아닌 첫 번째 값을 반환한다.
> 

### ✔ 기본 문법

```sql
COALESCE(값1, 값2, 값3...)
```

---

## 예제

```sql
SELECT name,
       sal,
       comm,
       COALESCE(comm,sal,0)
FROM professor;
```

---

## 동작 순서

```
comm 존재 → comm 반환

↓

comm NULL → sal 반환

↓

둘 다 NULL → 0 반환
```

---

# 📌 5. DECODE()

> Oracle 전용 조건 함수 (switch문과 유사)
> 

### ✔ 기본 문법

```sql
DECODE(비교값,
       값1, 결과1,
       값2, 결과2,
       ...
       기본값)
```

---

## 예제

```sql
SELECT name,
       DECODE(deptno,
              101,'컴퓨터공학과',
              102,'멀티미디어학과',
              201,'전자공학과',
              '기계공학과') dname
FROM professor;
```

---

## 특징

- "=" 비교만 가능
- Oracle 전용 함수

---

# 📌 6. CASE

> DECODE를 확장한 표준 SQL 조건문
> 

### ✔ 기본 문법

```sql
CASE
    WHEN 조건 THEN 결과
    WHEN 조건 THEN 결과
    ELSE 결과
END
```

---

## 예제

```sql
SELECT name,
       deptno,
       sal,
       CASE
            WHEN deptno=101 THEN sal*0.1
            WHEN deptno=102 THEN sal*0.2
            WHEN deptno=201 THEN sal*0.3
            ELSE 0
       END bonus
FROM professor;
```

---

## CASE에서 사용할 수 있는 조건

```
=

>

<

>=

<=

BETWEEN

LIKE

IN

IS NULL

AND

OR
```

---

# 📌 7. COUNT()

> 조건을 만족하는 행의 개수를 반환한다.
> 

### ✔ COUNT(*)

NULL 포함

```sql
COUNT(*)
```

---

### ✔ COUNT(컬럼)

NULL 제외

```sql
COUNT(comm)
```

---

## 예제

```sql
SELECT COUNT(comm)
FROM professor
WHERE deptno=101;
```

---

# 📌 8. AVG()

> 평균을 구한다.
> 

### ✔ 기본 문법

```sql
AVG(컬럼)
```

---

## 예제

```sql
SELECT AVG(weight),
       SUM(weight)
FROM student
WHERE deptno=101;
```

---

# 📌 9. SUM()

> 합계를 구한다.
> 

```sql
SUM(sal)
```

---

# 📌 10. MAX(), MIN()

> 최대값과 최소값을 구한다.
> 

```sql
MAX(sal)

MIN(sal)
```

---

# 📌 11. STDDEV(), VARIANCE()

### STDDEV()

표준편차

```sql
STDDEV(sal)
```

---

### VARIANCE()

분산

```sql
VARIANCE(sal)
```

---

# 📌 12. GROUP BY

> 같은 값을 하나의 그룹으로 묶는다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼,
       그룹함수
FROM 테이블
GROUP BY 컬럼;
```

---

## 예제

```sql
SELECT deptno,
       COUNT(*)
FROM professor
GROUP BY deptno;
```

---

# 📌 13. HAVING

> GROUP BY로 묶은 결과에 조건을 적용한다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼,
       COUNT(*)
FROM 테이블
GROUP BY 컬럼
HAVING 조건;
```

---

## 예제

```sql
SELECT grade,
       COUNT(*)
FROM student
GROUP BY grade
HAVING COUNT(*)>=4;
```

---

## WHERE와 HAVING 차이

| WHERE | HAVING |
| --- | --- |
| 그룹화 이전 조건 | 그룹화 이후 조건 |

---

# 📌 14. ROLLUP()

> 소계와 총계를 자동으로 생성한다.
> 

### ✔ 기본 문법

```sql
GROUP BY ROLLUP(컬럼1, 컬럼2)
```

---

## 생성 순서

```
(컬럼1, 컬럼2)

↓

(컬럼1)

↓

()
```

---

## 예제

```sql
SELECT deptno,
       SUM(sal)
FROM professor
GROUP BY ROLLUP(deptno);
```

---

# 📌 15. CUBE()

> 가능한 모든 그룹 조합을 생성한다.
> 

### ✔ 기본 문법

```sql
GROUP BY CUBE(컬럼1,컬럼2)
```

---

## 생성

```
(컬럼1, 컬럼2)

(컬럼1)

(컬럼2)

()
```

---

# 📌 16. GROUPING()

> ROLLUP 또는 CUBE가 만든 총계 행인지 확인한다.
> 

### ✔ 기본 문법

```sql
GROUPING(컬럼)
```

---

## 반환값

| 반환값 | 의미 |
| --- | --- |
| 0 | 실제 데이터 |
| 1 | 총계(ROLLUP/CUBE) |

---

# 📌 17. GROUPING SETS()

> 원하는 그룹만 선택하여 생성한다.
> 

### ✔ 기본 문법

```sql
GROUP BY GROUPING SETS
(
(컬럼1),
(컬럼2),
(컬럼1,컬럼2)
)
```

---

## 예제

```sql
SELECT deptno,
       grade,
       COUNT(*)
FROM student
GROUP BY GROUPING SETS
(
(deptno,grade),
(deptno,TO_CHAR(birthdate,'YYYY'))
);
```

> UNION ALL을 사용하는 것과 같은 효과를 낸다.
> 

---

# 📌 18. Oracle 조인(Oracle Join)

> 여러 테이블을 연결하여 조회한다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼
FROM 테이블1 t1,
     테이블2 t2
WHERE t1.공통컬럼=t2.공통컬럼;
```

---

## 예제

```sql
SELECT s.name,
       d.dname
FROM student s,
     department d
WHERE s.deptno=d.deptno;
```

---

# 📌 19. 테이블 별칭(Alias)

> 테이블 이름을 짧게 줄여 사용하는 기능
> 

### ✔ 기본 문법

```sql
FROM student s,
     department d
```

---

## 사용 예

```sql
SELECT s.name,
       d.dname
FROM student s,
     department d
WHERE s.deptno=d.deptno;
```

> 별칭을 지정한 후에는 `SELECT`, `WHERE`, `GROUP BY`, `ORDER BY` 등에서 원래 테이블명이 아닌 **별칭**을 사용해야 한다.
> 

---

# 📌 시험 암기

### ⭐ NULL 관련 함수

- **NVL** → NULL이면 대체값
- **NVL2** → NULL 여부에 따라 두 값 중 하나 선택
- **NULLIF** → 같으면 NULL
- **COALESCE** → NULL이 아닌 첫 번째 값 반환

---

### ⭐ 조건 함수

- **DECODE** → `=` 비교만 가능 (Oracle 전용)
- **CASE** → 모든 조건 사용 가능 (표준 SQL)

---

### ⭐ 그룹 함수

- **COUNT** → 개수
- **SUM** → 합계
- **AVG** → 평균
- **MAX** → 최대값
- **MIN** → 최소값
- **STDDEV** → 표준편차
- **VARIANCE** → 분산

---

### ⭐ GROUP BY

- 같은 값을 그룹으로 묶는다.

---

### ⭐ HAVING

- 그룹화 이후 조건

---

### ⭐ ROLLUP

- 소계 + 총계 생성

```
(부서, 직급)

↓

(부서)

↓

전체
```

---

### ⭐ CUBE

- 가능한 모든 그룹 조합 생성

---

### ⭐ GROUPING

- **0** → 실제 데이터
- **1** → 총계

---

### ⭐ GROUPING SETS

- 원하는 그룹만 선택적으로 생성
- `UNION ALL`을 대체할 수 있다.

---

### ⭐ Oracle 조인

- `FROM` 절에서 여러 테이블을 나열하고 `WHERE` 절에서 공통 컬럼을 연결한다.

---

### ⭐ 테이블 별칭

- `student s`, `department d`처럼 지정하여 SQL을 간결하게 작성한다.
- 별칭을 사용하면 이후에는 **원래 테이블명이 아닌 별칭만 사용**해야 한다.