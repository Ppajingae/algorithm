# 나머지가 1이 되는 수 찾기

**난이도:** Level 1  
**언어:** Java / Python

## 문제 설명

자연수 `n`이 주어졌을 때 다음 조건을 만족하는 가장 작은 자연수 `x`를 구하라.

- `n`을 `x`로 나눈 나머지가 `1`이어야 한다.
- 조건을 만족하는 `x` 중 가장 작은 값을 반환한다.
- 정답은 항상 존재한다.

## 제한사항

- `3 ≤ n ≤ 1,000,000`

## 입출력 예시

| n | result |
|---|---|
| 10 | 3 |
| 12 | 11 |

### 예제 1

```java
int n = 10;
int expected = 3;
```

10을 3으로 나눈 나머지는 1이다.

### 예제 2

```java
int n = 12;
int expected = 11;
```

12를 11로 나눈 나머지는 1이다.

---

## Java 풀이 스켈레톤

```java
class Solution {
    public int solution(int n) {

    }
}
```

### Java 테스트

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(10)); // 3
        System.out.println(solution.solution(12)); // 11
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(n):
    pass
```

### Python 테스트

```python
print(solution(10))  # 3
print(solution(12))  # 11
```