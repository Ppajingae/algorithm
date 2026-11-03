# 키패드 누르기

**난이도:** Level 1  
**날짜:** 2026-11-03  
**언어:** Java / Python

## 1. 문제 설명

스마트폰 전화 키패드에서 왼손과 오른손의 엄지손가락을 사용하여 주어진 숫자를 순서대로 입력한다.

각 숫자를 어느 손으로 눌렀는지 나타내는 문자열을 반환하라.

### 키패드 구조

```text
┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
├───┼───┼───┤
│ * │ 0 │ # │
└───┴───┴───┘
```

### 초기 위치

- 왼손 엄지손가락: `*`
- 오른손 엄지손가락: `#`

### 입력 규칙

**규칙 1 — 이동 거리**

- 엄지손가락은 상하좌우로만 이동할 수 있다.
- 키패드 한 칸의 이동 거리는 1이다.

**규칙 2 — 왼쪽 열**

`1`, `4`, `7`은 반드시 왼손으로 누른다.

**규칙 3 — 오른쪽 열**

`3`, `6`, `9`는 반드시 오른손으로 누른다.

**규칙 4 — 가운데 열**

`2`, `5`, `8`, `0`은 다음 기준으로 누른다.

1. 현재 위치에서 더 가까운 손을 사용한다.
2. 두 손의 이동 거리가 같다면 `hand`에 지정된 주로 사용하는 손을 사용한다.

### 반환 규칙

- 왼손으로 누른 경우: `"L"`
- 오른손으로 누른 경우: `"R"`

각 숫자를 누른 손을 순서대로 이어 붙인 문자열을 반환한다.

---

## 2. 제한사항

- `1 ≤ numbers.length ≤ 1,000`
- `0 ≤ numbers[i] ≤ 9`
- `hand`는 `"left"` 또는 `"right"`이다.
- 반환 문자열의 길이는 `numbers.length`와 같다.

---

## 3. 입출력 예시

| numbers | hand | result |
|---|---|---|
| `[1,3,4,5,8,2,1,4,5,9,5]` | `"right"` | `"LRLLLRLLRRL"` |
| `[7,0,8,2,8,3,1,5,7,6,2]` | `"left"` | `"LRLLRRLLLRR"` |
| `[1,2,3,4,5,6,7,8,9,0]` | `"right"` | `"LLRLLRLLRL"` |

### 예제 1

**입력**

```text
numbers = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
hand = "right"
```

**출력**

```text
LRLLLRLLRRL
```

### 예제 2

**입력**

```text
numbers = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]
hand = "left"
```

**출력**

```text
LRLLRRLLLRR
```

### 예제 3

**입력**

```text
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
hand = "right"
```

**출력**

```text
LLRLLRLLRL
```

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261103 {

    public String solution(int[] numbers, String hand) {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261103 algorithm = new Algorithm261103();

        int[][] numbers = {
            {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},
            {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
        };

        String[] hands = {
            "right",
            "left",
            "right"
        };

        String[] expected = {
            "LRLLLRLLRRL",
            "LRLLRRLLLRR",
            "LLRLLRLLRL"
        };

        for (int i = 0; i < numbers.length; i++) {
            String result = algorithm.solution(numbers[i], hands[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + result
                + " | 예상: " + expected[i]
                + " | 통과: " + result.equals(expected[i])
            );
        }
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(numbers, hand):
    answer = ""

    return answer


numbers_list = [
    [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],
    [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2],
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
]

hands = [
    "right",
    "left",
    "right"
]

expected = [
    "LRLLLRLLRRL",
    "LRLLRRLLLRR",
    "LLRLLRLLRL"
]

for index, (numbers, hand, result) in enumerate(
    zip(numbers_list, hands, expected), start=1
):
    actual = solution(numbers, hand)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )
```

---

## 6. 구현 목표

1. 왼손과 오른손의 초기 위치를 설정한다.
2. 주어진 숫자를 순서대로 처리한다.
3. 각 숫자를 누를 손을 결정한다.
4. 숫자를 누른 손의 위치를 갱신한다.
5. 사용한 손을 `"L"` 또는 `"R"`로 기록한다.
6. 모든 숫자를 처리한 뒤 결과 문자열을 반환한다.