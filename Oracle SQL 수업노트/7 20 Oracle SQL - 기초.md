# 7/20 Oracle SQL - 기초

날짜: 2026년 7월 20일
내용: SQL, alias

# 📘 SQL 기초

> 💡 데이터베이스 수업 정리
> 
> 
> 과목 : 데이터베이스(SQL)
> 작성일 :
> 학습 내용 : SELECT, DESC, DISTINCT, AS
> 

---

# 📑 목차

> 👉 여기에 **/목차(Table of Contents)** 블록을 추가하세요.
> 

---

# 📖 1. SELECT

## ✅ 개념

데이터를 조회할 때 사용하는 가장 기본적인 명령어이다.

---

## ✅ 기본 문법

```sql
SELECT 컬럼명
FROM 테이블명;
```

### 예제

```sql
SELECT studno, name, height, weight
FROM student;
```

### 결과

학생의

- 학번
- 이름
- 키
- 몸무게

를 출력한다.

---

## ✅ 모든 컬럼 조회

```sql
SELECT *
FROM department;
```

### 설명

* 는 모든 컬럼을 의미한다.

---

## ✅ 원하는 컬럼만 조회

```sql
SELECT deptno, dname, college, loc
FROM department;
```

출력

- 학과번호
- 학과명
- 단과대학
- 위치

---

# 📖 2. DESC

## ✅ 개념

테이블의 구조를 확인하는 명령어

## 문법

```sql
DESC 테이블명;
```

### 예제

```sql
DESC student;
DESC professor;
DESC department;
```

확인 가능한 정보

- 컬럼명
- 자료형(Data Type)
- NULL 허용 여부

---

# 📖 3. DISTINCT

## ✅ 개념

중복된 데이터를 제거한다.

## 문법

```sql
SELECT DISTINCT 컬럼명
FROM 테이블명;
```

### 예제

```sql
SELECT deptno
FROM student;
```

학생 수만큼 출력되므로 같은 학과번호가 여러 번 나온다.

↓

```sql
SELECT DISTINCT deptno
FROM student;
```

중복이 제거되어 하나씩만 출력된다.

---

# 📖 4. AS (별칭)

## ✅ 개념

출력되는 컬럼명을 원하는 이름으로 변경한다.

## 문법

```sql
SELECT 컬럼명 AS 별칭
FROM 테이블명;
```

### 예제

```sql
SELECT profno AS 교수NO,
       name AS 이름,
       position AS 직급,
       deptno AS 부서번호
FROM professor;
```

---

# 📖 5. 실습 문제

## ✅ 문제 1

department 테이블의 구조를 확인하세요.

```sql
DESC department;
```

✔ dname 자료형

```
VARCHAR2
```

---

## ✅ 문제 2

교수의 이름, 직급, 급여, 학과번호 출력

```sql
SELECT name,
       position,
       sal,
       deptno
FROM professor;
```

---

## ✅ 문제 3

학생의 학번, 이름, userid 출력

```sql
SELECT studno,
       name,
       userid
FROM student;
```

---

## ✅ 문제 4

교수의 직급을 중복 없이 출력

```sql
SELECT DISTINCT position
FROM professor;
```

결과

- 교수
- 부교수
- 조교수
- 전임강사

---

## ✅ 문제 5

별칭을 이용하여 출력

```sql
SELECT profno AS 교수NO,
       name AS 이름,
       position AS 직급,
       deptno AS 부서번호
FROM professor;
```

💡 기존에 작성한

```sql
WHERE profno IN (
SELECT profno
FROM professor
WHERE profno >= 9907
);
```

는 서브쿼리가 불필요하다.

아래처럼 작성하는 것이 더 간단하다.

```sql
SELECT profno AS 교수NO,
       name AS 이름,
       position AS 직급,
       deptno AS 부서번호
FROM professor
WHERE profno >= 9907;
```

---

# ⭐ 시험 포인트

| 명령어 | 설명 |
| --- | --- |
| SELECT | 데이터 조회 |
| FROM | 조회할 테이블 |
| * | 모든 컬럼 조회 |
| DESC | 테이블 구조 확인 |
| DISTINCT | 중복 제거 |
| AS | 별칭 지정 |
| WHERE | 조건 검색 |

---

# 📌 오늘 배운 SQL

- [x]  SELECT
- [x]  FROM
- [x]  DESC
- [x]  DISTINCT
- [x]  AS
- [ ]  WHERE
- [ ]  ORDER BY
- [ ]  GROUP BY
- [ ]  JOIN