# 최대공약수와 최소공배수

**난이도:** Level 1  
**날짜:** 2026-11-18  
**Java 클래스명:** Algorithm261118

## 1. 문제 설명

두 자연수 `n`, `m`이 주어져.

두 수의 최대공약수와 최소공배수를 구해서 배열로 반환하는 `solution` 함수를 작성해.

반환 배열의 순서는 다음과 같아.

- 첫 번째 원소: 최대공약수
- 두 번째 원소: 최소공배수

예를 들어 `n = 3`, `m = 12`라면 결과는 `[3, 12]`야.

## 2. 제한 조건

- `n`은 1 이상 1,000,000 이하의 자연수야.
- `m`은 1 이상 1,000,000 이하의 자연수야.
- 반환값은 길이가 2인 정수 배열이야.

## 3. 입출력 예제

| n | m | 결과 |
|---|---|---|
| 3 | 12 | `[3, 12]` |
| 2 | 5 | `[1, 10]` |

---

## 4. Java 스켈레톤 + 테스트

```java
import java.util.Arrays;

public class Algorithm261118 {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261118 algorithm = new Algorithm261118();

        int[][] testCases = {
            {3, 12},
            {2, 5},
            {1, 1},
            {1, 10},
            {6, 8},
            {12, 18},
            {7, 7},
            {15, 25},
            {100, 200},
            {999999, 1000000},
            {1000000, 1000000}
        };

        int[][] expected = {
            {3, 12},
            {1, 10},
            {1, 1},
            {1, 10},
            {2, 24},
            {6, 36},
            {7, 7},
            {5, 75},
            {100, 200},
            {1, 999999000000L}, // int 범위를 초과하는 값
            {1000000, 1000000}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] actual = algorithm.solution(
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

## 5. Python 스켈레톤 + 테스트

```python
def solution(n, m):
    answer = [0, 0]

    # 여기에 구현

    return answer


test_cases = [
    (3, 12, [3, 12]),
    (2, 5, [1, 10]),
    (1, 1, [1, 1]),
    (1, 10, [1, 10]),
    (6, 8, [2, 24]),
    (12, 18, [6, 36]),
    (7, 7, [7, 7]),
    (15, 25, [5, 75]),
    (100, 200, [100, 200]),
    (999999, 1000000, [1, 999999000000]),
    (1000000, 1000000, [1000000, 1000000])
]

for index, (n, m, expected) in enumerate(test_cases, start=1):
    actual = solution(n, m)

    print(
        f"테스트 {index}"
        f" | 입력: ({n}, {m})"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

## 6. 확인할 테스트 유형

- 두 수가 같은 경우
- 한쪽이 1인 경우
- 두 수가 서로소인 경우
- 한쪽이 다른 쪽의 배수인 경우
- 두 수가 공약수를 여러 개 갖는 경우
- 입력값이 최댓값에 가까운 경우