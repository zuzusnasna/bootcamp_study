# 7/22 Oracle SQL 함수 및 ORDER BY 정리

날짜: 2026년 7월 22일
내용: ORDER BY, 함수

# 📌 1. ORDER BY

> 조회 결과를 원하는 기준으로 정렬할 때 사용한다.
> 

### ✔ 기본 문법

```sql
SELECT 컬럼명
FROM 테이블명
ORDER BY 컬럼명;
```

---

## 오름차순(기본)

```sql
SELECT name,
       grade,
       tel
FROM student
ORDER BY name;
```

> 이름 가나다순으로 정렬
> 

---

## 내림차순

```sql
SELECT name,
       grade,
       tel
FROM student
ORDER BY grade DESC;
```

> 학년을 높은 순으로 정렬
> 

---

## 여러 컬럼 정렬

```sql
SELECT ename,
       job,
       deptno,
       sal
FROM emp
ORDER BY deptno,
         sal DESC;
```

> 부서번호 오름차순 → 같은 부서에서는 급여 내림차순
> 

---

## 문자 정렬 순서

오름차순

```
숫자
↓
영문 대문자
↓
영문 소문자
↓
한글
↓
NULL
```

내림차순은 반대이다.

> ORDER BY에는 SELECT절에 없는 컬럼도 사용할 수 있다.
> 

---

# 📌 2. UPPER

> 모든 문자를 대문자로 변환한다.
> 

### 기본 문법

```sql
UPPER(문자열)
```

---

## 예제

```sql
SELECT userid,
       UPPER(userid)
FROM student
WHERE studno='20101';
```

---

# 📌 3. LOWER

> 모든 문자를 소문자로 변환한다.
> 

### 기본 문법

```sql
LOWER(문자열)
```

---

## 예제

```sql
SELECT ename
FROM emp
WHERE LOWER(ename)='scott';
```

> 대소문자 구분 없이 검색 가능
> 

---

# 📌 4. INITCAP

> 첫 글자는 대문자, 나머지는 소문자로 변환한다.
> 

### 기본 문법

```sql
INITCAP(문자열)
```

---

## 예제

```sql
SELECT name,
       userid,
       INITCAP(userid)
FROM student
WHERE name='김영균';
```

---

# 📌 5. LENGTH / LENGTHB

> 문자열의 길이를 반환한다.
> 

| 함수 | 의미 |
| --- | --- |
| LENGTH | 문자 수 |
| LENGTHB | 바이트 수 |

---

## 예제

```sql
SELECT dname,
       LENGTH(dname),
       LENGTHB(dname)
FROM department;
```

---

# 📌 6. CONCAT

> 문자열을 연결한다.
> 

### 기본 문법

```sql
CONCAT(문자열1, 문자열2)
```

---

## 예제

```sql
SELECT CONCAT(CONCAT(name,'의 직책은 '),
              position)
FROM professor;
```

> 실무에서는 `||` 연산자를 더 많이 사용한다.
> 

```sql
name || '의 직책은 ' || position
```

---

# 📌 7. SUBSTR

> 문자열의 일부를 추출한다.
> 

### 기본 문법

```sql
SUBSTR(문자열, 시작위치, 길이)
```

---

## 주민번호 생년월일 추출

```sql
SELECT name,
       idnum,
       SUBSTR(idnum,1,6)
FROM student;
```

---

## 태어난 달 추출

```sql
SELECT name,
       SUBSTR(idnum,3,2)
FROM student;
```

---

## 여학생만 조회

```sql
SELECT name,
       idnum
FROM student
WHERE SUBSTR(idnum,7,1)=2;
```

---

# 📌 8. INSTR

> 특정 문자의 위치를 반환한다.
> 

### 기본 문법

```sql
INSTR(문자열,'찾을문자')
```

---

## 예제

```sql
SELECT dname,
       INSTR(dname,'과')
FROM department;
```

> 문자가 없으면 **0**을 반환한다.
> 

---

# 📌 9. LPAD / RPAD

> 문자열을 지정한 길이가 되도록 왼쪽 또는 오른쪽에 문자를 채운다.
> 

### 기본 문법

```sql
LPAD(문자열, 길이, 문자)

RPAD(문자열, 길이, 문자)
```

---

## 예제

```sql
SELECT position,
       LPAD(position,10,'*'),
       RPAD(userid,12,'+')
FROM professor;
```

---

# 📌 10. LTRIM / RTRIM

> 문자열의 왼쪽 또는 오른쪽의 특정 문자를 제거한다.
> 

### 기본 문법

```sql
LTRIM(문자열,'문자')

RTRIM(문자열,'문자')
```

---

## 예제

```sql
SELECT dname,
       RTRIM(dname,'과')
FROM department;
```

---

# 📌 11. ROUND

> 지정한 자리에서 반올림한다.
> 

### 기본 문법

```sql
ROUND(숫자, 자리수)
```

---

## 예제

```sql
SELECT sal,
       sal/22,
       ROUND(sal/22,1),
       ROUND(sal/22,2),
       ROUND(sal/22,-1)
FROM professor;
```

| 자리수 | 의미 |
| --- | --- |
| 2 | 소수 둘째 자리 |
| 1 | 소수 첫째 자리 |
| 0 | 정수 |
| -1 | 10의 자리 |
| -2 | 100의 자리 |

---

# 📌 12. TRUNC

> 지정한 자리 이하를 버린다.
> 

### 기본 문법

```sql
TRUNC(숫자, 자리수)
```

---

## 예제

```sql
SELECT sal,
       TRUNC(sal/22,1),
       TRUNC(sal/22,2),
       TRUNC(sal/22,-1)
FROM professor;
```

---

# 📌 13. MOD

> 나눗셈의 나머지를 반환한다.
> 

### 기본 문법

```sql
MOD(숫자1, 숫자2)
```

---

## 예제

```sql
SELECT name,
       sal,
       comm,
       MOD(sal,comm)
FROM professor;
```

> NULL과 연산하면 결과도 NULL이다.
> 

---

# 📌 14. CEIL / FLOOR

| 함수 | 의미 |
| --- | --- |
| CEIL | 올림 |
| FLOOR | 내림 |

---

## 예제

```sql
SELECT CEIL(19.7),
       FLOOR(12.345)
FROM dual;
```

---

# 📌 15. SYSDATE

> 현재 시스템 날짜와 시간을 반환한다.
> 

```sql
SELECT SYSDATE
FROM dual;
```

---

# 📌 16. MONTHS_BETWEEN

> 두 날짜 사이의 개월 수를 반환한다.
> 

### 기본 문법

```sql
MONTHS_BETWEEN(큰날짜, 작은날짜)
```

---

## 예제

```sql
SELECT ROUND(MONTHS_BETWEEN(SYSDATE,
                            hiredate))
FROM professor;
```

---

# 📌 17. ADD_MONTHS

> 지정한 개월 수를 더한다.
> 

### 기본 문법

```sql
ADD_MONTHS(날짜, 개월수)
```

---

## 예제

```sql
SELECT ADD_MONTHS(hiredate,6)
FROM professor;
```

---

# 📌 18. LAST_DAY

> 해당 월의 마지막 날짜를 반환한다.
> 

```sql
SELECT LAST_DAY(SYSDATE)
FROM dual;
```

---

# 📌 19. NEXT_DAY

> 지정한 요일의 다음 날짜를 반환한다.
> 

```sql
SELECT NEXT_DAY(SYSDATE,'일')
FROM dual;
```

요일 번호

| 번호 | 요일 |
| --- | --- |
| 1 | 일 |
| 2 | 월 |
| 3 | 화 |
| 4 | 수 |
| 5 | 목 |
| 6 | 금 |
| 7 | 토 |

---

# 📌 20. 날짜 ROUND / TRUNC

## ROUND

> 정오(12시)를 기준으로 날짜를 반올림한다.
> 

```sql
ROUND(SYSDATE)
```

---

## TRUNC

> 시간을 제거하고 00:00:00으로 만든다.
> 

```sql
TRUNC(SYSDATE)
```

---

# 📌 21. TO_CHAR

> 날짜나 숫자를 문자로 변환한다.
> 

### 날짜 출력

```sql
SELECT TO_CHAR(birthdate,'YY-MM')
FROM student;
```

---

### 영어 날짜 출력

```sql
SELECT TO_CHAR(
hiredate,
'Month DD, YYYY',
'NLS_DATE_LANGUAGE=ENGLISH')
FROM professor;
```

---

### 숫자 포맷

```sql
SELECT TO_CHAR((sal+comm)*12,
               '9,999')
FROM professor;
```

---

# 📌 22. TO_DATE

> 문자열을 날짜 형식으로 변환한다.
> 

### 기본 문법

```sql
TO_DATE(문자열,
        날짜형식)
```

---

## 예제

```sql
SELECT name,
       hiredate
FROM professor
WHERE hiredate=
TO_DATE('June 01,01',
'Month DD,YY',
'NLS_DATE_LANGUAGE=ENGLISH');
```

---

# 📌 시험 암기

### ⭐ ORDER BY

- ASC : 오름차순(기본)
- DESC : 내림차순
- 여러 컬럼 정렬 가능

---

### ⭐ 문자열 함수

- UPPER → 대문자
- LOWER → 소문자
- INITCAP → 첫 글자만 대문자
- LENGTH → 문자 수
- LENGTHB → 바이트 수
- CONCAT → 문자열 연결
- SUBSTR → 문자열 추출
- INSTR → 문자 위치
- LPAD / RPAD → 문자 채우기
- LTRIM / RTRIM → 문자 제거

---

### ⭐ 숫자 함수

- ROUND → 반올림
- TRUNC → 버림
- MOD → 나머지
- CEIL → 올림
- FLOOR → 내림

---

### ⭐ 날짜 함수

- SYSDATE → 현재 날짜
- MONTHS_BETWEEN → 개월 수 계산
- ADD_MONTHS → 개월 더하기
- LAST_DAY → 해당 월 마지막 날짜
- NEXT_DAY → 다음 요일 날짜
- ROUND → 날짜 반올림
- TRUNC → 시간 제거

---

### ⭐ 형변환 함수

- TO_CHAR → 날짜/숫자 → 문자
- TO_DATE → 문자 → 날짜

---

> 💡 **시험 핵심 포인트**
> 
> - `ORDER BY`의 기본 정렬은 **ASC(오름차순)**이며 `DESC`를 사용하면 내림차순으로 정렬된다.
> - `SUBSTR`은 문자열의 일부를 추출하고, `INSTR`은 특정 문자의 위치를 반환하며 없으면 **0**을 반환한다.
> - `ROUND`는 반올림, `TRUNC`는 버림, `CEIL`은 올림, `FLOOR`는 내림을 수행한다.
> - `MONTHS_BETWEEN`은 **(큰 날짜, 작은 날짜)** 순서로 사용하는 것이 일반적이다.
> - `TO_CHAR`는 날짜·숫자를 문자로, `TO_DATE`는 문자를 날짜로 변환한다.