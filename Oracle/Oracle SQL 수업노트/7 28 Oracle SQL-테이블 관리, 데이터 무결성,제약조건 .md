# 7/28 Oracle SQL-테이블 관리, 데이터 무결성,제약조건

날짜: 2026년 7월 28일
내용: 데이터 무결성, 제약조건

---

# 📚 제약조건(CONSTRAINT) 실습 정리

---

# 1. 제약조건 조회

```sql
SELECT constraint_name, constraint_type
FROM user_constraints;
```

### 설명

현재 사용자가 가지고 있는 **모든 제약조건**을 조회한다.

### 주요 제약조건 타입

| 코드 | 의미 |
| --- | --- |
| P | PRIMARY KEY |
| R | FOREIGN KEY |
| U | UNIQUE |
| C | CHECK / NOT NULL |
| V | VIEW CHECK OPTION |
| O | READ ONLY |

---

# 2. SUBJECT 데이터 입력

```sql
INSERT INTO subject VALUES (1,'sql','1','필수');
INSERT INTO subject VALUES (2,'','2','필수');
INSERT INTO subject VALUES (3,'java','3','선택');

COMMIT;
```

### 설명

SUBJECT 테이블에 데이터를 입력한다.

> `''`(빈 문자열)은 Oracle에서 **NULL**로 처리된다.
> 

만약 해당 컬럼이 **NOT NULL**이라면 오류가 발생한다.

---

# 3. 데이터 조회

```sql
SELECT *
FROM subject;
```

### 설명

입력된 데이터를 확인한다.

---

# 4. PRIMARY KEY 확인

```sql
INSERT INTO subject VALUES (4,'데이터베이스','1','필수');
INSERT INTO subject VALUES (4,'데이터모델링','2','선택');
```

### 결과

```
ORA-00001
unique constraint violated
```

### 이유

PRIMARY KEY 값이 **4로 중복**되었기 때문이다.

PRIMARY KEY는

- 중복 불가
- NULL 불가

---

# 5. SUBJECT의 제약조건 조회

```sql
SELECT constraint_name,
       constraint_type
FROM user_constraints
WHERE table_name='SUBJECT';
```

### 설명

SUBJECT 테이블에 설정되어 있는 제약조건만 조회한다.

---

# 6. CHECK 제약조건 삭제

```sql
ALTER TABLE subject
DROP CONSTRAINT subject_term_ck;
```

### 설명

`subject_term_ck` CHECK 제약조건을 삭제한다.

삭제 후에는 CHECK 조건 검사를 하지 않는다.

---

# 7. 다시 확인

```sql
SELECT constraint_name,
       constraint_type
FROM user_constraints
WHERE table_name='SUBJECT';
```

삭제된 제약조건이 목록에서 사라진다.

---

# 8. PRIMARY KEY 비활성화

```sql
ALTER TABLE sugang
DISABLE CONSTRAINT sugang_pk;
```

### 설명

PRIMARY KEY 제약조건을 잠시 사용하지 않는다.

- 중복 허용
- PK 검사 안 함

---

# 9. FOREIGN KEY 비활성화

```sql
ALTER TABLE sugang
DISABLE CONSTRAINT sugang_studno_fk;
```

### 설명

외래키 검사를 하지 않는다.

즉,

부모 테이블(STUDENT)에 없는 학번도 입력 가능하다.

---

# 10. 제약조건 상태 조회

```sql
SELECT constraint_name,
       status
FROM user_constraints
WHERE table_name IN ('SUGANG','SUBJECT');
```

### STATUS

| 상태 | 의미 |
| --- | --- |
| ENABLED | 활성화 |
| DISABLED | 비활성화 |

---

# 11. 다시 활성화

```sql
ALTER TABLE sugang
ENABLE CONSTRAINT sugang_pk;

ALTER TABLE sugang
ENABLE CONSTRAINT sugang_studno_fk;
```

### 설명

비활성화했던 제약조건을 다시 적용한다.

---

# 12. 활성화 여부 확인

```sql
SELECT constraint_name,
       status
FROM user_constraints
WHERE table_name='SUGANG';
```

---

# 13. 여러 테이블의 제약조건 조회

```sql
SELECT table_name,
       constraint_name,
       constraint_type,
       status
FROM user_constraints
WHERE table_name IN
('STUDENT','PROFESSOR','DEPARTMENT');
```

### 설명

세 개의 테이블에 존재하는 모든 제약조건을 조회한다.

---

# 14. 컬럼별 제약조건 확인

```sql
SELECT table_name,
       column_name,
       constraint_name
FROM user_cons_columns
WHERE table_name IN
('STUDENT','PROFESSOR','DEPARTMENT');
```

### 설명

어떤 컬럼에 어떤 제약조건이 적용되어 있는지 확인한다.

---

# 15. EMPLOYEE 테이블 생성

```sql
CREATE TABLE employee
(
    employee_id NUMBER(7)
        GENERATED ALWAYS AS IDENTITY
        CONSTRAINT employee_id_no_pk PRIMARY KEY
        DEFERRABLE INITIALLY DEFERRED
        USING INDEX TABLESPACE indxx,

    name VARCHAR2(25)
        CONSTRAINT employee_name_nn NOT NULL,

    address VARCHAR2(25),
    deptno NUMBER(2),
    phone_number VARCHAR2(20)
);
```

## 각 옵션 설명

### ① GENERATED ALWAYS AS IDENTITY

자동 번호 증가(AUTO_INCREMENT).

```
1
2
3
4
...
```

직접 employee_id를 입력하지 않아도 된다.

---

### ② PRIMARY KEY

기본키

- 중복 불가
- NULL 불가

---

### ③ DEFERRABLE INITIALLY DEFERRED

제약조건 검사를 **즉시 하지 않고 COMMIT 시점에 수행**한다.

기본은 `NOT DEFERRABLE`이며, 이 경우 SQL 실행 즉시 제약조건을 검사한다.

---

### ④ USING INDEX TABLESPACE indxx

PRIMARY KEY를 위한 인덱스를 `indxx` 테이블스페이스에 생성한다.

---

### ⑤ NOT NULL

```sql
name VARCHAR2(25)
CONSTRAINT employee_name_nn NOT NULL
```

이름에는 반드시 값이 있어야 한다.

NULL 입력 시 오류가 발생한다.

---

# 16. 테이블 구조 확인

```sql
DESC employee;
```

### 설명

EMPLOYEE 테이블의 컬럼과 자료형을 확인한다.

---

# 17. 데이터 입력

```sql
INSERT INTO employee
(name,address,deptno,phone_number)
VALUES
('가나다','서울',10,'010-1234-5678');
```

동일한 방식으로 여러 행을 입력한다.

### 특징

`employee_id`는 입력하지 않아도 자동 생성된다.

예를 들어:

| employee_id | name |
| --- | --- |
| 1 | 가나다 |
| 2 | 라마바 |
| 3 | 사아자 |
| 4 | 차카타 |

---

# 18. FOREIGN KEY 추가

```sql
ALTER TABLE employee
ADD CONSTRAINT employee_deptno_fk
FOREIGN KEY (deptno)
REFERENCES dept(deptno);
```

### 설명

EMPLOYEE의 `deptno`는 반드시 DEPT 테이블에 존재하는 학과 번호만 사용할 수 있다.

---

# 19. 없는 학과번호 입력

예를 들어

```sql
deptno = 50
```

을 입력하면

```
ORA-02291
integrity constraint violated
```

오류가 발생한다.

### 이유

DEPT 테이블에 **50번 부서가 존재하지 않기 때문**이다.

FOREIGN KEY는 부모 테이블의 값을 반드시 참조해야 한다.

---

# 20. 테이블 삭제

```sql
DROP TABLE employee;
```

### 설명

EMPLOYEE 테이블과 그 안의 데이터를 모두 삭제한다.

---

# ⭐ 핵심 정리

| 명령어 | 기능 |
| --- | --- |
| `USER_CONSTRAINTS` | 제약조건 조회 |
| `USER_CONS_COLUMNS` | 제약조건이 적용된 컬럼 조회 |
| `DROP CONSTRAINT` | 제약조건 삭제 |
| `DISABLE CONSTRAINT` | 제약조건 비활성화 |
| `ENABLE CONSTRAINT` | 제약조건 활성화 |
| `PRIMARY KEY` | 중복·NULL 금지 |
| `FOREIGN KEY` | 부모 테이블 참조 |
| `CHECK` | 입력 가능한 값 제한 |
| `NOT NULL` | NULL 입력 금지 |
| `IDENTITY` | 자동 증가 번호 생성 |
| `DEFERRABLE INITIALLY DEFERRED` | COMMIT 시점에 제약조건 검사 |
| `USING INDEX TABLESPACE` | PK 인덱스를 특정 테이블스페이스에 생성 |