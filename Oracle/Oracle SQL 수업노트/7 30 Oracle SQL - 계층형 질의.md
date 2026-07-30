# 7/30 계층형 질의

날짜: 2026년 7월 30일

# 📚 계층형 질의(Hierarchical Query)

---

# 1. 계층형 질의란?

계층형 질의는 **부모와 자식 관계를 가지는 데이터를 트리(Tree) 형태로 조회**하는 기능이다.

주로 조직도, 학과 구조, 게시판 답글 등을 조회할 때 사용한다.

### 주요 키워드

- `START WITH` : 계층의 시작(루트 노드)
- `CONNECT BY` : 부모-자식 관계 지정
- `PRIOR` : 부모 행을 지정

---

# 2. Top-Down 방식

루트(부모)에서 자식 방향으로 조회한다.

```sql
SELECT deptno, dname, college
FROM department
START WITH deptno = 10
CONNECT BY PRIOR deptno = college;
```

### 설명

- `deptno = 10`부터 시작
- 부모의 `deptno`와 자식의 `college`를 연결하여 하위 학과를 조회한다.

---

# 3. Bottom-Up 방식

자식에서 부모 방향으로 조회한다.

```sql
SELECT deptno, dname, college
FROM department
START WITH deptno = 102
CONNECT BY PRIOR college = deptno;
```

### 설명

- `102`번 학과부터 시작
- 부모를 따라 최상위 학과까지 조회한다.

---

# 4. LEVEL 사용

`LEVEL`은 현재 계층의 깊이를 나타낸다.

- 최상위 노드 : 1
- 자식 : 2
- 손자 : 3

예제

```sql
SELECT LEVEL,
       LPAD(' ',(LEVEL-1)*2)||dname 조직도
FROM department
START WITH dname='공과대학'
CONNECT BY PRIOR deptno = college;
```

### 설명

`LPAD()`를 이용하여 계층별 들여쓰기를 표현한다.

---

# 5. 들여쓰기 조정

```sql
SELECT LEVEL,
       LPAD(' ',(LEVEL-1)*4)||dname 조직도
FROM department
START WITH dname='공과대학'
CONNECT BY PRIOR deptno = college;
```

### 설명

LEVEL마다 공백 4칸씩 들여쓰기하여 조직도를 출력한다.

---

# 6. 특정 노드 제외(WHERE)

```sql
SELECT deptno, dname, college
FROM department
WHERE dname != '정보미디어학부'
START WITH college IS NULL
CONNECT BY PRIOR deptno = college;
```

### 설명

`WHERE`절은 **조회 결과에서 특정 행만 제외**한다.

> 자식 노드는 그대로 출력될 수 있다.
> 

---

# 7. 특정 노드와 하위 노드 모두 제외

```sql
SELECT deptno, college, dname, loc
FROM department
START WITH college IS NULL
CONNECT BY PRIOR deptno = college
AND dname != '정보미디어학부';
```

### 설명

`CONNECT BY` 조건에 넣으면 해당 노드뿐 아니라 **그 하위 계층까지 모두 제외**된다.

---

# 8. CONNECT_BY_ROOT

최상위 부모(루트)의 값을 반환한다.

```sql
SELECT LPAD(' ',4*(LEVEL-1))||ename 사원명,
       empno 사번,
       CONNECT_BY_ROOT empno 최상위사번,
       LEVEL
FROM emp
START WITH job='PRESIDENT'
CONNECT BY PRIOR empno = mgr;
```

### 설명

현재 행이 어떤 최상위 노드에 속하는지 확인할 수 있다.

---

# 9. CONNECT_BY_ISLEAF

최하위 노드(Leaf Node) 여부를 반환한다.

```sql
SELECT LPAD(' ',4*(LEVEL-1))||ename 사원명,
       empno 사번,
       CONNECT_BY_ISLEAF leaf_yn,
       LEVEL
FROM emp
START WITH job='PRESIDENT'
CONNECT BY NOCYCLE PRIOR empno = mgr;
```

### 설명

반환값

- 1 : 최하위 노드
- 0 : 부모 노드

### NOCYCLE

순환 참조가 발생할 경우 무한 반복을 방지한다.

---

# 10. SYS_CONNECT_BY_PATH

루트부터 현재 노드까지의 경로를 문자열로 반환한다.

```sql
SELECT LPAD(' ',4*(LEVEL-1))||ename 사원명,
       empno 사번,
       SYS_CONNECT_BY_PATH(ename,'/') path
FROM emp
START WITH job='PRESIDENT'
CONNECT BY NOCYCLE PRIOR empno = mgr;
```

### 설명

예시

```
/KING/JONES/SCOTT/ADAMS
```

---

# 11. Leaf Node만 PATH 출력

```sql
SELECT LEVEL,
       SYS_CONNECT_BY_PATH(ename,'/') path
FROM emp
WHERE CONNECT_BY_ISLEAF = 1
START WITH mgr IS NULL
CONNECT BY PRIOR empno = mgr;
```

### 설명

최하위 직원의 경로만 출력한다.

---

# 12. ORDER SIBLINGS BY

형제 노드끼리만 정렬한다.

```sql
SELECT LPAD(' ',4*(LEVEL-1))||ename 사원명,
       ename,
       empno,
       LEVEL
FROM emp
START WITH job='PRESIDENT'
CONNECT BY NOCYCLE PRIOR empno = mgr
ORDER SIBLINGS BY ename;
```

### 설명

일반 `ORDER BY`는 계층 구조를 깨뜨리지만,

`ORDER SIBLINGS BY`는 **계층 구조를 유지하면서 같은 부모의 자식들만 정렬**한다.

---

# 📚 계층형 질의 활용

---

# 13. 사원 조직도 및 PATH 출력

```sql
SELECT e.empno,
       e.ename,
       e.job,
       e.mgr,
       m.ename 매니저이름,
       LEVEL,
       SYS_CONNECT_BY_PATH(e.ename,'-') 사원PATH
FROM emp e
LEFT JOIN emp m
ON e.mgr = m.empno
START WITH e.mgr IS NULL
CONNECT BY PRIOR e.empno = e.mgr;
```

### 설명

- 사원 정보 조회
- 매니저 이름 출력
- 조직도 LEVEL 출력
- 최상위부터 현재 사원까지의 경로 출력

---

# 📚 인라인 뷰 활용

---

# 14. 학과별 최대 키 학생 조회

```sql
SELECT d.dname,
       m.max_height,
       s.name,
       s.height
FROM (
        SELECT MAX(height) max_height,
               deptno
        FROM student
        GROUP BY deptno
     ) m,
     department d,
     student s
WHERE s.deptno = d.deptno
AND m.max_height = s.height;
```

### 설명

인라인 뷰를 이용하여

1. 학과별 최대 키를 구하고
2. 해당 학생의 이름과 키, 학과명을 출력한다.

> **참고:** 이 쿼리는 `m.deptno = s.deptno` 조건이 없어 같은 키를 가진 다른 학과 학생이 함께 조회될 수 있다. 일반적으로 아래 조건을 추가하는 것이 정확하다.
> 

```sql
AND m.deptno = s.deptno
```

---

# 15. 데이터 수정

```sql
UPDATE student
SET height = 186
WHERE name = '서재진';
```

### 설명

학생 **서재진**의 키를 186으로 수정한다.

---

# 핵심 정리

| 구분 | 설명 |
| --- | --- |
| START WITH | 계층의 시작 노드 지정 |
| CONNECT BY | 부모-자식 관계 지정 |
| PRIOR | 부모 행 지정 |
| LEVEL | 계층 깊이 |
| CONNECT_BY_ROOT | 최상위 노드 정보 반환 |
| CONNECT_BY_ISLEAF | 최하위 노드 여부(1/0) |
| SYS_CONNECT_BY_PATH | 루트부터 현재 노드까지의 경로 반환 |
| NOCYCLE | 순환 참조 방지 |
| ORDER SIBLINGS BY | 계층 구조를 유지하며 형제 노드만 정렬 |
| Top-Down | 부모 → 자식 조회 |
| Bottom-Up | 자식 → 부모 조회 |