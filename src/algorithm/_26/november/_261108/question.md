# K번째수

**난이도:** Level 1  
**날짜:** 2026-11-08  
**Java 클래스명:** Algorithm261108

## 1. 문제 설명

정수 배열 `array`와 여러 개의 명령이 담긴 2차원 배열 `commands`가 주어진다.

각 명령은 `[i, j, k]` 형태이며 다음 작업을 수행한다.

1. `array`의 i번째부터 j번째까지 자른다.
2. 잘라낸 배열을 오름차순으로 정렬한다.
3. 정렬된 배열의 k번째 숫자를 구한다.

모든 명령의 결과를 순서대로 배열에 담아 반환하라.

### 예시

```text
array = [1, 5, 2, 6, 3, 7, 4]

i = 2
j = 5
k = 3
```

**배열 자르기**

```text
[5, 2, 6, 3]
```

**정렬**

```text
[2, 3, 5, 6]
```

**3번째 숫자**

```text
5
```

---

## 2. 제한사항

- `1 ≤ array.length ≤ 100`
- `1 ≤ array[i] ≤ 100`
- `1 ≤ commands.length ≤ 50`
- 각 명령은 `[i, j, k]` 형태의 길이 3인 배열이다.
- 문제에서 사용하는 위치 번호는 1부터 시작한다.

---

## 3. 입출력 예시

### 입력

```text
array = [1, 5, 2, 6, 3, 7, 4]

commands = [
    [2, 5, 3],
    [4, 4, 1],
    [1, 7, 3]
]
```

### 출력

```text
[5, 6, 3]
```

### 명령별 결과

| 명령 | 자른 배열 | 정렬된 배열 | 결과 |
|---|---|---|---|
| `[2, 5, 3]` | `[5, 2, 6, 3]` | `[2, 3, 5, 6]` | 5 |
| `[4, 4, 1]` | `[6]` | `[6]` | 6 |
| `[1, 7, 3]` | `[1, 5, 2, 6, 3, 7, 4]` | `[1, 2, 3, 4, 5, 6, 7]` | 3 |

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
import java.util.Arrays;

public class Algorithm261108 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261108 algorithm = new Algorithm261108();

        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };

        int[] expected = {5, 6, 3};

        int[] actual = algorithm.solution(array, commands);

        System.out.println(
            "결과: " + Arrays.toString(actual)
            + " | 예상: " + Arrays.toString(expected)
            + " | 통과: " + Arrays.equals(actual, expected)
        );
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(array, commands):
    answer = []

    return answer


array = [1, 5, 2, 6, 3, 7, 4]

commands = [
    [2, 5, 3],
    [4, 4, 1],
    [1, 7, 3]
]

expected = [5, 6, 3]

actual = solution(array, commands)

print(
    f"결과: {actual}"
    f" | 예상: {expected}"
    f" | 통과: {actual == expected}"
)
```

---

## 6. 구현 목표

1. `array`와 `commands`를 입력받는다.
2. 각 명령에 따라 배열의 지정된 구간을 추출한다.
3. 추출한 배열을 오름차순으로 정렬한다.
4. 정렬 결과에서 지정된 위치의 값을 구한다.
5. 모든 명령의 결과를 배열로 반환한다.