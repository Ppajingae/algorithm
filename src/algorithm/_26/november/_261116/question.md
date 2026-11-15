# 평균 구하기

**난이도:** Level 1  
**날짜:** 2026-11-16  
**Java 클래스명:** Algorithm261116

## 1. 문제 설명

정수를 담고 있는 배열 `arr`의 평균값을 반환하는 함수 `solution`을 완성해.

## 2. 제한 조건

- `arr`의 길이는 1 이상 100 이하야.
- `arr`의 각 원소는 -10,000 이상 10,000 이하의 정수야.
- 반환값은 실수형 숫자야.

## 3. 입출력 예제

| arr | 결과 |
|---|---|
| `[1, 2, 3, 4]` | `2.5` |
| `[5, 5]` | `5.0` |

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261116 {

    public double solution(int[] arr) {
        double answer = 0;

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261116 algorithm = new Algorithm261116();

        int[][] testCases = {
            {1, 2, 3, 4},
            {5, 5},
            {1},
            {0, 0, 0},
            {-1, -2, -3},
            {-10, 10},
            {1, 2},
            {10000, -10000, 5000}
        };

        double[] expected = {
            2.5,
            5.0,
            1.0,
            0.0,
            -2.0,
            0.0,
            1.5,
            1666.6666666666667
        };

        for (int i = 0; i < testCases.length; i++) {
            double actual = algorithm.solution(testCases[i]);

            boolean passed = Math.abs(actual - expected[i]) < 1e-9;

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + actual
                + " | 예상: " + expected[i]
                + " | 통과: " + passed
            );
        }
    }
}
```

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(arr):
    answer = 0

    # 여기에 구현

    return answer


test_cases = [
    ([1, 2, 3, 4], 2.5),
    ([5, 5], 5.0),
    ([1], 1.0),
    ([0, 0, 0], 0.0),
    ([-1, -2, -3], -2.0),
    ([-10, 10], 0.0),
    ([1, 2], 1.5),
    ([10000, -10000, 5000], 1666.6666666666667)
]

for index, (arr, expected) in enumerate(test_cases, start=1):
    actual = solution(arr)

    passed = abs(actual - expected) < 1e-9

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {passed}"
    )
```

---

## 6. 확인할 테스트 유형

- 일반적인 정수 배열
- 원소가 하나인 배열
- 모든 원소가 0인 배열
- 음수만 포함된 배열
- 양수와 음수가 섞인 배열
- 평균이 소수로 나오는 배열
- 큰 정수가 포함된 배열