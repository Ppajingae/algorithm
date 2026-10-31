# 내적

**난이도:** Level 1  
**날짜:** 2026-10-31  
**언어:** Java / Python

## 1. 문제 설명

길이가 같은 두 정수 배열 `a`, `b`가 주어진다.

두 배열의 내적을 계산하여 반환하는 `solution` 함수를 작성하라.

내적은 다음과 같이 정의된다.

```text
a[0] * b[0] + a[1] * b[1] + ... + a[n-1] * b[n-1]
```

여기서 `n`은 배열의 길이이다.

---

## 2. 제한사항

- `1 ≤ a.length ≤ 1,000`
- `1 ≤ b.length ≤ 1,000`
- `a.length == b.length`
- `-1,000 ≤ a[i] ≤ 1,000`
- `-1,000 ≤ b[i] ≤ 1,000`

---

## 3. 입출력 예시

| a | b | result |
|---|---|---|
| `[1, 2, 3, 4]` | `[-3, -1, 0, 2]` | `3` |
| `[-1, 0, 1]` | `[1, 0, -1]` | `-2` |

### 예제 1

```text
a = [1, 2, 3, 4]
b = [-3, -1, 0, 2]

1 * (-3) + 2 * (-1) + 3 * 0 + 4 * 2 = 3
```

**결과:** `3`

### 예제 2

```text
a = [-1, 0, 1]
b = [1, 0, -1]

(-1) * 1 + 0 * 0 + 1 * (-1) = -2
```

**결과:** `-2`

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261031 {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261031 algorithm = new Algorithm261031();

        int[][] a = {
            {1, 2, 3, 4},
            {-1, 0, 1}
        };

        int[][] b = {
            {-3, -1, 0, 2},
            {1, 0, -1}
        };

        int[] expected = {3, -2};

        for (int i = 0; i < a.length; i++) {
            int result = algorithm.solution(a[i], b[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + result
                + " | 예상: " + expected[i]
                + " | 통과: " + (result == expected[i])
            );
        }
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(a, b):
    answer = 0

    return answer


a_list = [
    [1, 2, 3, 4],
    [-1, 0, 1]
]

b_list = [
    [-3, -1, 0, 2],
    [1, 0, -1]
]

expected = [3, -2]

for index, (a, b, result) in enumerate(
    zip(a_list, b_list, expected), start=1
):
    actual = solution(a, b)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )
```

---

## 6. 구현 목표

1. 두 정수 배열을 입력받는다.
2. 배열의 내적을 계산한다.
3. 계산 결과를 정수로 반환한다.
4. 주어진 테스트 케이스를 모두 통과한다.