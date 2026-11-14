# 두 정수 사이의 합

**난이도:** Level 1  
**날짜:** 2026-11-11  
**Java 클래스명:** Algorithm261111

## 문제 설명

두 정수 `a`, `b`가 주어졌을 때 두 수 사이에 속한 모든 정수의 합을 반환한다.

- `a == b`이면 해당 정수를 반환한다.
- `a`, `b`는 -10,000,000 이상 10,000,000 이하이다.
- 두 정수의 대소관계는 정해져 있지 않다.

## 입출력 예제

| a | b | 결과 |
|---|---|---|
| 3 | 5 | 12 |
| 3 | 3 | 3 |
| 5 | 3 | 12 |

## Java

```java
public class Algorithm261111 {

    public long solution2(int a, int b) {
        long answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261111 algorithm = new Algorithm261111();

        int[][] testCases = {
            {3, 5},
            {3, 3},
            {5, 3},
            {-3, 3},
            {-5, -3},
            {-10000000, 10000000}
        };

        long[] expected = {
            12L, 3L, 12L, 0L, -12L, 0L
        };

        for (int i = 0; i < testCases.length; i++) {
            long actual = algorithm.solution(
                testCases[i][0],
                testCases[i][1]
            );

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + actual
                + " | 예상: " + expected[i]
                + " | 통과: " + (actual == expected[i])
            );
        }
    }
}
```

## Python

```python
def solution(a, b):
    answer = 0

    return answer


test_cases = [
    (3, 5, 12),
    (3, 3, 3),
    (5, 3, 12),
    (-3, 3, 0),
    (-5, -3, -12),
    (-10000000, 10000000, 0)
]

for index, (a, b, expected) in enumerate(test_cases, start=1):
    actual = solution(a, b)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```