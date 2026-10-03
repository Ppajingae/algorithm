# 6. 재귀 (Recursion)

## 개념

함수가 자기 자신을 다시 호출한다.

중요한 것은:

```text
큰 문제를
같은 형태의 더 작은 문제로 표현
```

하는 것이다.

---

## 기본 구조

```java
void recursive(int n) {

    if (baseCondition) {
        return;
    }

    recursive(smallerProblem);
}
```

---

## 재귀에서 가장 중요한 것

```text
이 함수 하나가 정확히 무엇을 하는 함수인가?
```

를 먼저 정의한다.

---

## 지금까지 연결된 문제

### 하노이의 탑

함수의 의미:

```text
move(n, from, to, via)

= from에 있는 n개의 원판을
  via를 이용해서
  to로 이동시킨다.
```

그러면:

```text
1. n-1개를 from → via

2. 가장 큰 원판을 from → to

3. n-1개를 via → to
```

가 된다.

```java
move(n - 1, from, via, to);

moveDisk(from, to);

move(n - 1, via, to, from);
```

---