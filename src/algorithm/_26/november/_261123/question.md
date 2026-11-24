# 자연수 뒤집어 배열로 만들기

**난이도:** Level 1  
**날짜:** 2026-11-23  
**Java 클래스명:** Algorithm261123

## 1. 문제 설명

자연수 `n`이 주어진다.

`n`의 각 자릿수를 역순으로 배치하여, 각 숫자를 원소로 가지는 배열을 반환하는 `solution` 함수를 완성한다.

예를 들어 `n`이 `12345`라면 `[5, 4, 3, 2, 1]`을 반환한다.

## 2. 제한 조건

- `n`은 10,000,000,000 이하인 자연수이다.

## 3. 입출력 예제

| n | 반환값 |
|---|---|
| 12345 | [5, 4, 3, 2, 1] |

---

## 4. Java 스켈레톤 + 테스트

```java
import java.util.Arrays;

public class Algorithm261123 {

    public int[] solution(long n) {
        int[] answer = {};

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261123 algorithm = new Algorithm261123();

        long[] testCases = {
            12345L,
            1L,
            9L,
            10L,
            100L,
            1200L,
            987654321L,
            11111L,
            909090L,
            10000000000L,
            1234567890L
        };

        int[][] expected = {
            {5, 4, 3, 2, 1},
            {1},
            {9},
            {0, 1},
            {0, 0, 1},
            {0, 0, 2, 1},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 1, 1, 1, 1},
            {0, 9, 0, 9, 0, 9},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 9, 8, 7, 6, 5, 4, 3, 2, 1}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 입력: " + testCases[i]
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
def solution(n):
    answer = []

    # 여기에 구현

    return answer


test_cases = [
    (12345, [5, 4, 3, 2, 1]),
    (1, [1]),
    (9, [9]),
    (10, [0, 1]),
    (100, [0, 0, 1]),
    (1200, [0, 0, 2, 1]),
    (987654321, [1, 2, 3, 4, 5, 6, 7, 8, 9]),
    (11111, [1, 1, 1, 1, 1]),
    (909090, [0, 9, 0, 9, 0, 9]),
    (10000000000, [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]),
    (1234567890, [0, 9, 8, 7, 6, 5, 4, 3, 2, 1])
]

for index, (n, expected) in enumerate(test_cases, start=1):
    actual = solution(n)

    print(
        f"테스트 {index}"
        f" | 입력: {n}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 한 자리 자연수
- 여러 자릿수로 구성된 자연수
- 끝자리가 0인 자연수
- 0이 연속으로 포함된 자연수
- 동일한 숫자가 반복되는 자연수
- 입력 범위의 최댓값