# 7/24 Oracle SQL -JOIN /Sub Query

날짜: 2026년 7월 24일
내용: JOIN, SubQuery

# 📌 1. Cartesian Product (CROSS JOIN)

> 두 테이블의 **모든 행을 서로 조합**하는 조인
> 

### ✔ 기본 문법

```sql
SELECT *
FROM table1
CROSS JOIN table2;
```

또는

```sql
SELECT *
FROM table1,
     table2;
```

(조인 조건이 없으면 Cartesian Product 발생)

---

## 특징

- 결과 행 수 = **A행 × B행**
- 조인 조건이 없을 때 발생
- 일반적으로 원하는 결과가 아니므로 주의

---

## 예제

```sql
SELECT studno,
       name,
       s.deptno,
       d.deptno,
       dname
FROM student s,
     department d;
```

또는

```sql
SELECT studno,
       name,
       s.deptno,
       d.deptno,
       dname
FROM student s
CROSS JOIN department d;
```

---

# 📌 2. INNER JOIN (Equi Join)

> 공통 컬럼의 값이 같은 행만 조회하는 가장 기본적인 조인
> 

### ✔ Oracle(구문)

```sql
SELECT 컬럼
FROM table1 t1,
     table2 t2
WHERE t1.컬럼=t2.컬럼;
```

---

### ✔ ANSI JOIN

```sql
SELECT 컬럼
FROM table1 t1
INNER JOIN table2 t2
ON t1.컬럼=t2.컬럼;
```

---

## 예제

```sql
SELECT s.studno,
       s.name,
       d.dname,
       d.loc
FROM student s
JOIN department d
ON s.deptno=d.deptno;
```

---

## 특징

- 공통 데이터만 출력
- NULL은 제외된다.

---

# 📌 3. NATURAL JOIN

> 같은 이름의 컬럼을 자동으로 찾아 JOIN한다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼
FROM table1
NATURAL JOIN table2;
```

---

## 예제

```sql
SELECT studno,
       name,
       deptno,
       dname
FROM student
NATURAL JOIN department;
```

---

## 특징

- ON 사용 불가
- USING 사용 불가
- 공통 컬럼 자동 연결
- 공통 컬럼은 한 번만 출력

---

# 📌 4. JOIN USING

> 같은 이름의 컬럼을 직접 지정하여 JOIN한다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼
FROM table1
JOIN table2
USING(컬럼명);
```

---

## 예제

```sql
SELECT studno,
       name,
       deptno,
       dname
FROM student
JOIN department
USING(deptno);
```

---

## 특징

- 같은 이름의 컬럼만 가능
- 공통 컬럼은 한 번만 출력

---

# 📌 NATURAL JOIN vs USING

| NATURAL JOIN | USING |
| --- | --- |
| 공통 컬럼 자동 사용 | 컬럼 직접 지정 |
| ON 사용 불가 | ON 사용 불가 |
| 공통 컬럼 모두 사용 | 원하는 컬럼만 사용 |

---

# 📌 5. LEFT OUTER JOIN

> 왼쪽 테이블의 모든 데이터를 출력하고, 오른쪽은 일치하는 데이터만 출력한다.
> 

### ✔ ANSI 문법

```sql
SELECT 컬럼
FROM table1
LEFT OUTER JOIN table2
ON 조건;
```

---

## Oracle 구문

```sql
WHERE table1.col = table2.col(+)
```

(+)

→ 오른쪽 테이블 NULL 허용

---

## 예제

```sql
SELECT s.name,
       p.name
FROM student s
LEFT OUTER JOIN professor p
ON s.profno=p.profno;
```

---

## 특징

- 왼쪽 테이블 모두 출력
- 오른쪽 값이 없으면 NULL 출력

---

# 📌 6. RIGHT OUTER JOIN

> 오른쪽 테이블의 모든 데이터를 출력한다.
> 

### ✔ ANSI 문법

```sql
SELECT 컬럼
FROM table1
RIGHT OUTER JOIN table2
ON 조건;
```

---

## Oracle 구문

```sql
WHERE table1.col(+)=table2.col
```

(+)

→ 왼쪽 NULL 허용

---

## 예제

```sql
SELECT s.name,
       p.name
FROM student s
RIGHT OUTER JOIN professor p
ON s.profno=p.profno;
```

---

## 특징

- 오른쪽 테이블 모두 출력
- 왼쪽 데이터가 없으면 NULL

---

# 📌 7. FULL OUTER JOIN

> 양쪽 테이블의 모든 데이터를 출력한다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼
FROM table1
FULL OUTER JOIN table2
ON 조건;
```

---

## 예제

```sql
SELECT s.name,
       p.name
FROM student s
FULL OUTER JOIN professor p
ON s.profno=p.profno;
```

---

## 특징

- LEFT + RIGHT 결과
- 어느 한쪽에만 있는 데이터도 모두 출력

---

# 📌 (+) 위치 암기

### LEFT OUTER JOIN

```sql
WHERE s.profno = p.profno(+)
```

→ 오른쪽 NULL 허용

→ LEFT OUTER JOIN

---

### RIGHT OUTER JOIN

```sql
WHERE s.profno(+) = p.profno
```

→ 왼쪽 NULL 허용

→ RIGHT OUTER JOIN

---

# 📌 8. SELF JOIN

> 하나의 테이블을 두 번 사용하는 조인
> 

### ✔ 기본 문법

```sql
SELECT 컬럼
FROM table t1,
     table t2
WHERE t1.컬럼=t2.컬럼;
```

---

## 예제(부서)

```sql
SELECT dept.dname,
       org.dname
FROM department dept
JOIN department org
ON dept.college=org.deptno;
```

---

## 예제(EMP)

```sql
SELECT e.ename,
       m.ename
FROM emp e,
     emp m
WHERE e.mgr=m.empno;
```

---

## 특징

- 같은 테이블에 별칭을 두 개 사용
- 조직도, 상위부서, 관리자 조회 등에 사용

---

# 📌 9. 서브쿼리(Subquery)

> SQL문 안에 또 다른 SELECT문을 사용하는 방식
> 

### ✔ 기본 문법

```sql
SELECT 컬럼
FROM 테이블
WHERE 컬럼=
(
SELECT 컬럼
FROM 테이블
);
```

---

## 실행 순서

```
서브쿼리 실행

↓

결과 반환

↓

메인쿼리 실행
```

---

# 📌 10. 단일행 서브쿼리

> 결과가 반드시 1행만 반환되는 서브쿼리
> 

### 사용 연산자

```
=

>

<

>=

<=

<>
```

---

## 예제

```sql
SELECT name,
       position
FROM professor
WHERE position=
(
SELECT position
FROM professor
WHERE name='전은지'
);
```

---

## 실행 순서

```
① 전은지 직급 조회

↓

② 같은 직급 조회
```

---

# 📌 11. 평균값을 이용한 서브쿼리

```sql
SELECT name,
       deptno,
       weight
FROM student
WHERE weight<
(
SELECT AVG(weight)
FROM student
WHERE deptno=101
);
```

---

## 실행 순서

```
101학과 평균 몸무게 계산

↓

평균보다 작은 학생 조회
```

---

# 📌 12. JOIN + 서브쿼리

```sql
SELECT s.name,
       d.dname
FROM student s
JOIN department d
ON s.deptno=d.deptno
WHERE s.weight<
(
SELECT AVG(weight)
FROM student
)
AND d.deptno=101;
```

---

# 📌 13. HAVING + 서브쿼리

> 그룹 함수의 결과와 비교할 때 자주 사용한다.
> 

### 예제

```sql
SELECT deptno,
       COUNT(*)
FROM student
GROUP BY deptno
HAVING COUNT(*)=
(
SELECT MAX(COUNT(*))
FROM student
GROUP BY deptno
);
```

---

## 실행 순서

```
학과별 학생수 계산

↓

최대 학생수 계산

↓

같은 학과 출력
```

---

# 📌 14. 여러 개의 서브쿼리

```sql
SELECT name,
       grade,
       height
FROM student
WHERE grade=
(
SELECT grade
FROM student
WHERE studno='20101'
)
AND height>
(
SELECT height
FROM student
WHERE studno='20201'
);
```

---

## 실행 순서

```
① 20101 학년 조회

↓

② 20201 키 조회

↓

③ 조건 비교
```

---

# 📌 시험 암기

### ⭐ JOIN 종류

- **CROSS JOIN** → 모든 행 조합
- **INNER JOIN** → 조건이 일치하는 행만 출력
- **LEFT OUTER JOIN** → 왼쪽 테이블 모두 출력
- **RIGHT OUTER JOIN** → 오른쪽 테이블 모두 출력
- **FULL OUTER JOIN** → 양쪽 테이블 모두 출력
- **SELF JOIN** → 같은 테이블을 두 번 사용
- **NATURAL JOIN** → 같은 이름 컬럼 자동 조인
- **JOIN USING** → 지정한 컬럼으로 조인

---

### ⭐ Oracle OUTER JOIN (+)

- `A = B(+)` → **LEFT OUTER JOIN**
- `A(+) = B` → **RIGHT OUTER JOIN**
- `(+)`가 붙은 쪽이 **NULL을 허용하는 테이블**이다.

---

### ⭐ NATURAL JOIN

- 같은 이름 컬럼 자동 연결
- `ON` 사용 불가
- `USING` 사용 불가

---

### ⭐ USING

- 같은 이름의 컬럼 지정
- 공통 컬럼은 한 번만 출력

---

### ⭐ SELF JOIN

- 하나의 테이블에 별칭을 두 개 이상 사용
- 관리자, 상위부서, 조직도 조회 등에 사용

---

### ⭐ 서브쿼리

- SQL 안의 SQL
- **안쪽 SELECT가 먼저 실행**된다.

---

### ⭐ 단일행 서브쿼리

- 결과가 **1행**
- `=`, `<`, `>`, `<=`, `>=`, `<>` 등을 사용한다.

---

### ⭐ HAVING + 서브쿼리

- 그룹 함수 결과를 다른 그룹 함수 결과와 비교할 때 자주 사용한다.