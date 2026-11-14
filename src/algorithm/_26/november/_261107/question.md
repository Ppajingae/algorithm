# 모의고사

**난이도:** Level 1  
**날짜:** 2026-11-07  
**Java 클래스명:** Algorithm261107

## 1. 문제 설명

수학 문제를 전부 찍는 수포자 3명이 있다.

각 수포자는 서로 다른 규칙으로 정답을 선택하며, 해당 규칙을 시험이 끝날 때까지 반복한다.

### 수포자별 정답 선택 규칙

**1번 수포자**

```text
1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
```

**2번 수포자**

```text
2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
```

**3번 수포자**

```text
3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
```

시험 문제의 정답이 순서대로 담긴 배열 `answers`가 주어진다.

**가장 많은 문제를 맞힌 수포자의 번호를 배열로 반환하라.**

가장 높은 점수를 받은 수포자가 여러 명이라면 모든 해당 번호를 오름차순으로 반환해야 한다.

---

## 2. 제한사항

- 시험 문제 수는 최대 10,000개다.
- 각 문제의 정답은 1부터 5까지의 정수다.
- 수포자의 번호는 1, 2, 3이다.
- 최고 점수를 받은 사람이 여러 명이면 번호를 오름차순으로 정렬한다.

---

## 3. 입출력 예시

| answers | result |
|---|---|
| `[1, 2, 3, 4, 5]` | `[1]` |
| `[1, 3, 2, 4, 2]` | `[1, 2, 3]` |

### 예제 1

**입력**

```text
answers = [1, 2, 3, 4, 5]
```

**출력**

```text
[1]
```

1번 수포자가 모든 문제를 맞혔으므로 1번을 반환한다.

### 예제 2

**입력**

```text
answers = [1, 3, 2, 4, 2]
```

**출력**

```text
[1, 2, 3]
```

세 수포자가 각각 2문제씩 맞혔으므로 모든 번호를 반환한다.

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
import java.util.Arrays;

public class Algorithm261107 {

    public int[] solution(int[] answers) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261107 algorithm = new Algorithm261107();

        int[][] testCases = {
            {1, 2, 3, 4, 5},
            {1, 3, 2, 4, 2}
        };

        int[][] expected = {
            {1},
            {1, 2, 3}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] result = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + Arrays.toString(result)
                + " | 예상: " + Arrays.toString(expected[i])
                + " | 통과: " + Arrays.equals(result, expected[i])
            );
        }
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(answers):
    answer = []

    return answer


test_cases = [
    ([1, 2, 3, 4, 5], [1]),
    ([1, 3, 2, 4, 2], [1, 2, 3])
]

for index, (answers, expected) in enumerate(test_cases, start=1):
    actual = solution(answers)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 구현 목표

1. 각 수포자의 정답 선택 규칙을 적용한다.
2. 실제 정답 배열과 비교한다.
3. 각 수포자가 맞힌 문제 수를 계산한다.
4. 가장 높은 점수를 받은 수포자를 찾는다.
5. 최고 점수가 같은 사람이 여러 명이면 모두 포함한다.
6. 수포자 번호를 오름차순으로 반환한다.