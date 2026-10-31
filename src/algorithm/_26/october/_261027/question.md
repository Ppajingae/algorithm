# 약수의 개수와 덧셈

**난이도:** Level 1  
**언어:** Java / Python  
**날짜:** 2026-10-28

## 문제 설명

두 정수 `left`와 `right`가 주어진다.

`left`부터 `right`까지의 모든 정수를 확인하여 다음 규칙에 따라 계산한 결과를 반환하라.

- 약수의 개수가 짝수인 경우 해당 숫자를 더한다.
- 약수의 개수가 홀수인 경우 해당 숫자를 뺀다.

## 제한사항

- `1 ≤ left ≤ right ≤ 1,000`

## 입출력 예시

| left | right | result |
|---|---|---|
| 13 | 17 | 43 |
| 24 | 27 | 52 |

### 예제 1

| 숫자 | 약수 | 약수 개수 | 연산 |
|---|---|---|---|
| 13 | 1, 13 | 2 | +13 |
| 14 | 1, 2, 7, 14 | 4 | +14 |
| 15 | 1, 3, 5, 15 | 4 | +15 |
| 16 | 1, 2, 4, 8, 16 | 5 | -16 |
| 17 | 1, 17 | 2 | +17 |

결과: `13 + 14 + 15 - 16 + 17 = 43`

### 예제 2

| 숫자 | 약수 | 약수 개수 | 연산 |
|---|---|---|---|
| 24 | 1, 2, 3, 4, 6, 8, 12, 24 | 8 | +24 |
| 25 | 1, 5, 25 | 3 | -25 |
| 26 | 1, 2, 13, 26 | 4 | +26 |
| 27 | 1, 3, 9, 27 | 4 | +27 |

결과: `24 - 25 + 26 + 27 = 52`

---

## Java 풀이 스켈레톤

```java
public class Algorithm261027 {

    public int solution(int left, int right) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261028 algorithm = new Algorithm261028();

        System.out.println(algorithm.solution(13, 17)); // 43
        System.out.println(algorithm.solution(24, 27)); // 52
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(left, right):
    answer = 0

    return answer
```

### Python 테스트 코드

```python
print(solution(13, 17))  # 43
print(solution(24, 27))  # 52
```

---

## 구현 목표

- `left`부터 `right`까지의 모든 정수를 처리한다.
- 각 정수의 약수 개수를 판단한다.
- 약수 개수의 홀짝 여부에 따라 덧셈 또는 뺄셈을 수행한다.
- 최종 계산 결과를 정수로 반환한다.