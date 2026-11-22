# 제일 작은 수 제거하기

**난이도:** Level 1  
**날짜:** 2026-11-20  
**Java 클래스명:** Algorithm261120

## 1. 문제 설명

정수를 저장한 배열 `arr`이 주어져.

배열에서 가장 작은 수를 제거한 뒤, 남은 원소를 배열로 반환하는 `solution` 함수를 작성해.

단, 가장 작은 수를 제거한 결과가 빈 배열이라면 `[-1]`을 반환해야 해.

### 예시

- `[4, 3, 2, 1]` → `[4, 3, 2]`
- `[10]` → `[-1]`

## 2. 제한 조건

- `arr`의 길이는 1 이상이야.
- 배열의 모든 원소는 서로 다른 정수야.
- 반환할 배열이 비어 있다면 `[-1]`을 반환해야 해.

## 3. 입출력 예제

| arr | 결과 |
|---|---|
| `[4, 3, 2, 1]` | `[4, 3, 2]` |
| `[10]` | `[-1]` |

---

## 4. Java 스켈레톤 + 테스트

```java
import java.util.Arrays;

public class Algorithm261120 {

    public int[] solution(int[] arr) {
        int[] answer = {};

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261120 algorithm = new Algorithm261120();

        int[][] testCases = {
            {4, 3, 2, 1},
            {10},
            {1, 2, 3, 4},
            {5, 1, 3, 2, 4},
            {-3, -1, -2},
            {0, -5, 10},
            {7, 3},
            {3, 7},
            {-1},
            {0}
        };

        int[][] expected = {
            {4, 3, 2},
            {-1},
            {2, 3, 4},
            {5, 3, 2, 4},
            {-1, -2},
            {0, 10},
            {7},
            {7},
            {-1},
            {-1}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 입력: " + Arrays.toString(testCases[i])
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
def solution(arr):
    answer = []

    # 여기에 구현

    return answer


test_cases = [
    ([4, 3, 2, 1], [4, 3, 2]),
    ([10], [-1]),
    ([1, 2, 3, 4], [2, 3, 4]),
    ([5, 1, 3, 2, 4], [5, 3, 2, 4]),
    ([-3, -1, -2], [-1, -2]),
    ([0, -5, 10], [0, 10]),
    ([7, 3], [7]),
    ([3, 7], [7]),
    ([-1], [-1]),
    ([0], [-1])
]

for index, (arr, expected) in enumerate(test_cases, start=1):
    actual = solution(arr.copy())

    print(
        f"테스트 {index}"
        f" | 입력: {arr}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 원소가 하나뿐인 배열
- 가장 작은 수가 맨 앞에 있는 경우
- 가장 작은 수가 맨 뒤에 있는 경우
- 가장 작은 수가 중간에 있는 경우
- 음수가 포함된 배열
- 0이 포함된 배열
- 원소가 두 개인 배열