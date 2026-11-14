# x만큼 간격이 있는 n개의 숫자

**난이도:** Level 1  
**날짜:** 2026-11-14  
**Java 클래스명:** Algorithm261114

## 1. 문제 설명

정수 `x`와 자연수 `n`이 주어진다.

`x`부터 시작해서 `x`씩 증가하는 숫자를 `n`개 담은 배열을 반환하는 `solution` 함수를 작성하라.

## 2. 제한 조건

| 항목 | 조건 |
|---|---|
| `x` | -10,000,000 이상 10,000,000 이하 |
| `n` | 1 이상 1,000 이하 |
| 반환값 | 길이가 `n`인 숫자 배열 |

## 3. 입출력 예제

| x | n | 결과 |
|---|---|---|
| 2 | 5 | `[2, 4, 6, 8, 10]` |
| 4 | 3 | `[4, 8, 12]` |
| -4 | 2 | `[-4, -8]` |

---

## 4. Java 스켈레톤 + 테스트

```java
import java.util.Arrays;

public class Algorithm261114 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261114 algorithm = new Algorithm261114();

        int[][] testCases = {
            {2, 5},
            {4, 3},
            {-4, 2},
            {0, 5},
            {5, 1},
            {-3, 4},
            {10000000, 3}
        };

        long[][] expected = {
            {2L, 4L, 6L, 8L, 10L},
            {4L, 8L, 12L},
            {-4L, -8L},
            {0L, 0L, 0L, 0L, 0L},
            {5L},
            {-3L, -6L, -9L, -12L},
            {10000000L, 20000000L, 30000000L}
        };

        for (int i = 0; i < testCases.length; i++) {
            long[] actual = algorithm.solution(
                testCases[i][0],
                testCases[i][1]
            );

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + Arrays.toString(actual)
                + " | 예상: " + Arrays.toString(expected[i])
                + " | 통과: " + Arrays.equals(actual, expected[i])
            );
        }
    }
}
```

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(x, n):
    answer = []

    return answer


test_cases = [
    (2, 5, [2, 4, 6, 8, 10]),
    (4, 3, [4, 8, 12]),
    (-4, 2, [-4, -8]),
    (0, 5, [0, 0, 0, 0, 0]),
    (5, 1, [5]),
    (-3, 4, [-3, -6, -9, -12]),
    (10000000, 3, [10000000, 20000000, 30000000])
]

for index, (x, n, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(x, n)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 구현 목표

1. 정수 `x`와 자연수 `n`을 입력받는다.
2. `x`부터 시작하는 숫자 배열을 생성한다.
3. 각 숫자의 간격은 `x`로 유지한다.
4. 배열의 길이는 정확히 `n`이어야 한다.
5. 생성한 배열을 반환한다.