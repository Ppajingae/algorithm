# 행렬의 덧셈

**난이도:** Level 1  
**날짜:** 2026-11-14  
**Java 클래스명:** Algorithm261114

## 1. 문제 설명

행렬의 덧셈은 행과 열의 크기가 같은 두 행렬에서 같은 위치의 값을 서로 더하는 연산이야.

두 행렬 `arr1`, `arr2`를 입력받아 행렬 덧셈의 결과를 반환하는 `solution` 함수를 작성해.

## 2. 제한 조건

- `arr1`, `arr2`의 행과 열의 길이는 각각 500을 넘지 않아.
- 두 행렬의 크기는 같아.

## 3. 입출력 예제

| arr1 | arr2 | 결과 |
|---|---|---|
| `[[1,2],[2,3]]` | `[[3,4],[5,6]]` | `[[4,6],[7,9]]` |
| `[[1],[2]]` | `[[3],[4]]` | `[[4],[6]]` |

---

## 4. Java 스켈레톤 + 테스트

```java
import java.util.Arrays;

public class Algorithm261114 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261114 algorithm = new Algorithm261114();

        int[][][] arr1Cases = {
            {{1, 2}, {2, 3}},
            {{1}, {2}},
            {{0}},
            {{-1, 2}, {3, -4}},
            {{1, 2, 3}},
            {{1}, {2}, {3}}
        };

        int[][][] arr2Cases = {
            {{3, 4}, {5, 6}},
            {{3}, {4}},
            {{0}},
            {{5, -2}, {-3, 4}},
            {{4, 5, 6}},
            {{4}, {5}, {6}}
        };

        int[][][] expected = {
            {{4, 6}, {7, 9}},
            {{4}, {6}},
            {{0}},
            {{4, 0}, {0, 0}},
            {{5, 7, 9}},
            {{5}, {7}, {9}}
        };

        for (int i = 0; i < arr1Cases.length; i++) {
            int[][] actual = algorithm.solution(arr1Cases[i], arr2Cases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + Arrays.deepToString(actual)
                + " | 예상: " + Arrays.deepToString(expected[i])
                + " | 통과: " + Arrays.deepEquals(actual, expected[i])
            );
        }
    }
}
```

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(arr1, arr2):
    answer = []

    # 여기에 구현

    return answer


test_cases = [
    (
        [[1, 2], [2, 3]],
        [[3, 4], [5, 6]],
        [[4, 6], [7, 9]]
    ),
    (
        [[1], [2]],
        [[3], [4]],
        [[4], [6]]
    ),
    (
        [[0]],
        [[0]],
        [[0]]
    ),
    (
        [[-1, 2], [3, -4]],
        [[5, -2], [-3, 4]],
        [[4, 0], [0, 0]]
    ),
    (
        [[1, 2, 3]],
        [[4, 5, 6]],
        [[5, 7, 9]]
    ),
    (
        [[1], [2], [3]],
        [[4], [5], [6]],
        [[5], [7], [9]]
    )
]

for index, (arr1, arr2, expected) in enumerate(test_cases, start=1):
    actual = solution(arr1, arr2)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 일반적인 2×2 행렬
- 열이 하나인 행렬
- 행이 하나인 행렬
- 음수와 0이 포함된 행렬
- 행과 열의 개수가 서로 다른 직사각형 행렬