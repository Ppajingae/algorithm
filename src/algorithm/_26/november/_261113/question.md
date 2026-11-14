# 소수 만들기

**난이도:** Level 1  
**날짜:** 2026-11-13  
**Java 클래스명:** Algorithm261113

## 1. 문제 설명

주어진 정수 배열 `nums`에서 서로 다른 위치에 있는 숫자 3개를 선택한다.

선택한 세 숫자의 합이 소수가 되는 경우의 개수를 반환하는 `solution` 함수를 작성하라.

### 조건

- 반드시 3개의 숫자를 선택해야 한다.
- 같은 위치의 숫자를 중복 선택할 수 없다.
- 선택한 숫자 3개의 합이 소수인 경우만 개수에 포함한다.

## 2. 제한 사항

| 항목 | 조건 |
|---|---|
| `nums` 길이 | 3 이상 50 이하 |
| 원소 범위 | 1 이상 1,000 이하 |
| 중복 원소 | 없음 |
| 반환값 | 조건을 만족하는 경우의 개수 |

## 3. 입출력 예제

| nums | result |
|---|---|
| `[1, 2, 3, 4]` | 1 |
| `[1, 2, 7, 6, 4]` | 4 |

### 예제 1

**입력**

```java
int[] nums = {1, 2, 3, 4};
```

**출력**

```text
1
```

설명: 1, 2, 4를 선택하면 합이 7이므로 소수 조건을 만족한다.

### 예제 2

**입력**

```java
int[] nums = {1, 2, 7, 6, 4};
```

**출력**

```text
4
```

조건을 만족하는 조합은 다음과 같다.

- 1 + 2 + 4 = 7
- 1 + 4 + 6 = 11
- 2 + 4 + 7 = 13
- 4 + 6 + 7 = 17

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261113 {

    public int solution(int[] nums) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261113 algorithm = new Algorithm261113();

        int[][] testCases = {
            {1, 2, 3, 4},
            {1, 2, 7, 6, 4},
            {1, 2, 4},
            {1, 2, 3},
            {2, 4, 6},
            {1, 3, 5},
            {2, 3, 5, 7}
        };

        int[] expected = {
            1, 4, 1, 0, 0, 0, 2
        };

        for (int i = 0; i < testCases.length; i++) {
            int actual = algorithm.solution(testCases[i]);

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

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(nums):
    answer = 0

    return answer


test_cases = [
    ([1, 2, 3, 4], 1),
    ([1, 2, 7, 6, 4], 4),
    ([1, 2, 4], 1),
    ([1, 2, 3], 0),
    ([2, 4, 6], 0),
    ([1, 3, 5], 0),
    ([2, 3, 5, 7], 2)
]

for index, (nums, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(nums)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 구현 목표

1. 정수 배열을 입력받는다.
2. 서로 다른 숫자 3개를 선택한다.
3. 선택한 숫자들의 합을 계산한다.
4. 합이 소수인지 확인한다.
5. 조건을 만족하는 경우의 개수를 반환한다.