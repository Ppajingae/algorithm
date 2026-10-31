# 음양 더하기

**난이도:** Level 1  
**날짜:** 2026-10-29  
**언어:** Java / Python

## 1. 문제 설명

정수의 절댓값을 담은 배열 `absolutes`와 각 정수의 부호를 나타내는 불리언 배열 `signs`가 주어진다.

두 배열을 이용하여 실제 정수들의 합을 구하라.

- `signs[i] == true`이면 해당 정수는 양수이다.
- `signs[i] == false`이면 해당 정수는 음수이다.

## 2. 제한사항

- `1 ≤ absolutes.length ≤ 1,000`
- `1 ≤ absolutes[i] ≤ 1,000`
- `signs.length == absolutes.length`

## 3. 입출력 예시

| absolutes | signs | result |
|---|---|---|
| `[4, 7, 12]` | `[true, false, true]` | 9 |
| `[1, 2, 3]` | `[false, false, true]` | 0 |

### 예제 1

```java
int[] absolutes = {4, 7, 12};
boolean[] signs = {true, false, true};
int expected = 9;
```

실제 정수는 `4, -7, 12`이다.

따라서 결과는 `9`이다.

### 예제 2

```java
int[] absolutes = {1, 2, 3};
boolean[] signs = {false, false, true};
int expected = 0;
```

실제 정수는 `-1, -2, 3`이다.

따라서 결과는 `0`이다.

---

## 4. Java 풀이 스켈레톤

```java
public class Algorithm261029 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261029 algorithm = new Algorithm261029();

        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};

        int[] absolutes2 = {1, 2, 3};
        boolean[] signs2 = {false, false, true};

        System.out.println(algorithm.solution(absolutes1, signs1)); // 9
        System.out.println(algorithm.solution(absolutes2, signs2)); // 0
    }
}
```

---

## 5. Python 풀이 스켈레톤 및 테스트 코드

```python
def solution(absolutes, signs):
    answer = 0

    return answer


absolutes1 = [4, 7, 12]
signs1 = [True, False, True]

absolutes2 = [1, 2, 3]
signs2 = [False, False, True]

print(solution(absolutes1, signs1))  # 9
print(solution(absolutes2, signs2))  # 0
```

---

## 6. 구현 목표

1. `absolutes`와 `signs`의 각 원소를 확인한다.
2. 부호에 따라 실제 정수의 값을 판단한다.
3. 모든 정수의 합을 반환한다.