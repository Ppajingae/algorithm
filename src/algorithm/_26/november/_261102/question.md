# 두 개 뽑아서 더하기

**난이도:** Level 1  
**날짜:** 2026-11-02  
**언어:** Java / Python

## 1. 문제 설명

정수 배열 `numbers`가 주어진다.

배열에서 **서로 다른 인덱스에 위치한 두 수**를 선택하여 더한다.

이렇게 만들 수 있는 모든 합을 중복 없이 구한 뒤, 오름차순으로 정렬하여 반환하라.

---

## 2. 제한사항

- `2 ≤ numbers.length ≤ 100`
- `0 ≤ numbers[i] ≤ 100`
- 서로 다른 인덱스의 원소를 선택해야 한다.
- 반환 배열은 중복이 없어야 한다.
- 반환 배열은 오름차순으로 정렬되어야 한다.

---

## 3. 입출력 예시

| numbers | result |
|---|---|
| `[2, 1, 3, 4, 1]` | `[2, 3, 4, 5, 6, 7]` |
| `[5, 0, 2, 7]` | `[2, 5, 7, 9, 12]` |

### 예제 1

**입력**

```text
numbers = [2, 1, 3, 4, 1]
```

**출력**

```text
[2, 3, 4, 5, 6, 7]
```

### 예제 2

**입력**

```text
numbers = [5, 0, 2, 7]
```

**출력**

```text
[2, 5, 7, 9, 12]
```

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
import java.util.Arrays;

public class Algorithm261102 {

    public int[] solution(int[] numbers) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261102 algorithm = new Algorithm261102();

        int[][] numbers = {
            {2, 1, 3, 4, 1},
            {5, 0, 2, 7}
        };

        int[][] expected = {
            {2, 3, 4, 5, 6, 7},
            {2, 5, 7, 9, 12}
        };

        for (int i = 0; i < numbers.length; i++) {
            int[] result = algorithm.solution(numbers[i]);

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
def solution(numbers):
    answer = []

    return answer


numbers_list = [
    [2, 1, 3, 4, 1],
    [5, 0, 2, 7]
]

expected = [
    [2, 3, 4, 5, 6, 7],
    [2, 5, 7, 9, 12]
]

for index, (numbers, result) in enumerate(
    zip(numbers_list, expected), start=1
):
    actual = solution(numbers)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )
```

---

## 6. 구현 목표

1. 정수 배열에서 서로 다른 인덱스의 두 원소를 선택한다.
2. 선택한 두 원소의 합을 구한다.
3. 가능한 모든 합을 구한다.
4. 중복된 결과를 제거한다.
5. 결과를 오름차순으로 정렬하여 반환한다.