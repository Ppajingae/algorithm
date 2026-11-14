# 실패율

**난이도:** Level 1  
**날짜:** 2026-11-05  
**언어:** Java / Python

## 1. 문제 설명

게임에는 총 `N`개의 스테이지가 존재한다.

각 사용자가 현재 도전 중인 스테이지 번호가 담긴 배열 `stages`가 주어진다.

각 스테이지의 실패율을 계산한 뒤, **실패율이 높은 스테이지부터 내림차순으로 정렬한 스테이지 번호 배열**을 반환하라.

### 실패율 정의

```text
실패율 = 해당 스테이지에 도달했지만 클리어하지 못한 사용자 수
       / 해당 스테이지에 도달한 전체 사용자 수
```

### 정렬 규칙

1. 실패율이 높은 스테이지가 먼저 온다.
2. 실패율이 같다면 스테이지 번호가 작은 순서대로 정렬한다.
3. 스테이지에 도달한 사용자가 없다면 실패율은 0이다.

### 스테이지 번호

- `1 ~ N`: 사용자가 현재 도전 중인 스테이지
- `N + 1`: 모든 스테이지를 클리어한 사용자

---

## 2. 제한사항

- `1 ≤ N ≤ 500`
- `1 ≤ stages.length ≤ 200,000`
- `1 ≤ stages[i] ≤ N + 1`
- 반환 배열에는 `1`부터 `N`까지 모든 스테이지 번호가 포함되어야 한다.

---

## 3. 입출력 예시

| N | stages | result |
|---|---|---|
| 5 | `[2,1,2,6,2,4,3,3]` | `[3,4,2,1,5]` |
| 4 | `[4,4,4,4,4]` | `[4,1,2,3]` |

### 예제 1

**입력**

```text
N = 5
stages = [2, 1, 2, 6, 2, 4, 3, 3]
```

**스테이지별 실패율**

| 스테이지 | 실패율 |
|---|---|
| 1 | 1/8 |
| 2 | 3/7 |
| 3 | 2/4 |
| 4 | 1/2 |
| 5 | 0/1 |

**출력**

```text
[3, 4, 2, 1, 5]
```

### 예제 2

**입력**

```text
N = 4
stages = [4, 4, 4, 4, 4]
```

**출력**

```text
[4, 1, 2, 3]
```

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
import java.util.Arrays;

public class Algorithm261105 {

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261105 algorithm = new Algorithm261105();

        int[] stageCounts = {5, 4};

        int[][] stages = {
            {2, 1, 2, 6, 2, 4, 3, 3},
            {4, 4, 4, 4, 4}
        };

        int[][] expected = {
            {3, 4, 2, 1, 5},
            {4, 1, 2, 3}
        };

        for (int i = 0; i < stageCounts.length; i++) {
            int[] result = algorithm.solution(stageCounts[i], stages[i]);

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
def solution(N, stages):
    answer = []

    return answer


stage_counts = [5, 4]

stages_list = [
    [2, 1, 2, 6, 2, 4, 3, 3],
    [4, 4, 4, 4, 4]
]

expected = [
    [3, 4, 2, 1, 5],
    [4, 1, 2, 3]
]

for index, (N, stages, result) in enumerate(
    zip(stage_counts, stages_list, expected), start=1
):
    actual = solution(N, stages)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )
```

---

## 6. 구현 목표

1. 전체 스테이지 수 `N`과 사용자별 현재 스테이지 `stages`를 입력받는다.
2. 각 스테이지의 실패율을 계산한다.
3. 도달한 사용자가 없는 스테이지도 처리한다.
4. 실패율이 높은 순서대로 정렬한다.
5. 실패율이 같다면 스테이지 번호가 작은 순서로 정렬한다.
6. 정렬된 스테이지 번호 배열을 반환한다.