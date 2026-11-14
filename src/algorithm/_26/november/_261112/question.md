# 예산

**난이도:** Level 1  
**날짜:** 2026-11-12  
**Java 클래스명:** Algorithm261112

## 1. 문제 설명

S사에서는 각 부서에 필요한 물품을 구매하기 위해 예산을 지원하려고 한다.

하지만 전체 예산이 정해져 있으므로 모든 부서를 지원할 수 있는 것은 아니다.

다음 조건을 만족하면서 **최대한 많은 부서를 지원할 수 있는 개수**를 반환해야 한다.

- 각 부서는 신청한 금액을 전부 지원받아야 한다.
- 신청 금액보다 적은 금액은 지원할 수 없다.
- 전체 지원 금액은 예산을 초과할 수 없다.
- 지원받는 부서의 수를 최대화해야 한다.

## 2. 제한 사항

| 항목 | 조건 |
|---|---|
| `d` 길이 | 1 이상 100 이하 |
| 부서별 신청 금액 | 1 이상 100,000 이하 |
| `budget` | 1 이상 10,000,000 이하 |
| 반환값 | 지원 가능한 최대 부서 수 |

## 3. 입출력 예제

| d | budget | result |
|---|---|---|
| `[1, 3, 2, 5, 4]` | 9 | 3 |
| `[2, 2, 3, 3]` | 10 | 4 |

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261112 {

    public int solution(int[] d, int budget) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261112 algorithm = new Algorithm261112();

        int[][] dCases = {
            {1, 3, 2, 5, 4},
            {2, 2, 3, 3},
            {1},
            {5},
            {1, 1, 1, 1},
            {100000, 100000, 100000},
            {3, 3, 3}
        };

        int[] budgets = {
            9, 10, 1, 1, 2, 200000, 5
        };

        int[] expected = {
            3, 4, 1, 0, 2, 2, 1
        };

        for (int i = 0; i < dCases.length; i++) {
            int actual = algorithm.solution(
                dCases[i],
                budgets[i]
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

## 5. Python 스켈레톤 + 테스트

```python
def solution(d, budget):
    answer = 0

    return answer


test_cases = [
    ([1, 3, 2, 5, 4], 9, 3),
    ([2, 2, 3, 3], 10, 4),
    ([1], 1, 1),
    ([5], 1, 0),
    ([1, 1, 1, 1], 2, 2),
    ([100000, 100000, 100000], 200000, 2),
    ([3, 3, 3], 5, 1)
]

for index, (d, budget, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(d, budget)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

## 6. 구현 목표

1. 부서별 신청 금액과 전체 예산을 입력받는다.
2. 각 부서는 신청 금액 전액을 지원받아야 한다.
3. 전체 예산을 초과하지 않아야 한다.
4. 지원 가능한 부서의 최대 개수를 반환한다.