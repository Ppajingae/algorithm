# 로또의 최고 순위와 최저 순위

**난이도:** Level 1  
**날짜:** 2026-10-28  
**언어:** Java / Python

## 1. 문제 설명

로또는 1부터 45까지의 숫자 중 6개를 선택하는 복권이다.

구매한 로또 번호 중 일부가 지워져 확인할 수 없는 상황이다.

확인할 수 없는 번호는 `0`으로 표시한다.

구매한 로또 번호 `lottos`와 당첨 번호 `win_nums`가 주어질 때, 가능한 최고 순위와 최저 순위를 계산하라.

반환값은 다음과 같다.

```java
int[] answer = {최고순위, 최저순위};
```

### 로또 순위

| 일치하는 번호 개수 | 순위 |
|---|---|
| 6개 | 1등 |
| 5개 | 2등 |
| 4개 | 3등 |
| 3개 | 4등 |
| 2개 | 5등 |
| 0~1개 | 6등 |

## 2. 제한사항

- `lottos.length == 6`
- `win_nums.length == 6`
- `0 ≤ lottos[i] ≤ 45`
- `1 ≤ win_nums[i] ≤ 45`
- `0`은 확인할 수 없는 번호를 의미한다.
- `lottos`에서 0을 제외한 숫자는 중복되지 않는다.
- `win_nums`의 숫자는 중복되지 않는다.
- 두 배열 모두 정렬되어 있지 않을 수 있다.

## 3. 입출력 예시

| lottos | win_nums | result |
|---|---|---|
| `[44,1,0,0,31,25]` | `[31,10,45,1,6,19]` | `[3,5]` |
| `[0,0,0,0,0,0]` | `[38,19,20,40,15,25]` | `[1,6]` |
| `[45,4,35,20,3,9]` | `[20,9,3,45,4,35]` | `[1,1]` |

### 예제 1

```java
int[] lottos = {44, 1, 0, 0, 31, 25};
int[] winNums = {31, 10, 45, 1, 6, 19};
int[] expected = {3, 5};
```

- 최고 순위: 3등
- 최저 순위: 5등

### 예제 2

```java
int[] lottos = {0, 0, 0, 0, 0, 0};
int[] winNums = {38, 19, 20, 40, 15, 25};
int[] expected = {1, 6};
```

- 최고 순위: 1등
- 최저 순위: 6등

### 예제 3

```java
int[] lottos = {45, 4, 35, 20, 3, 9};
int[] winNums = {20, 9, 3, 45, 4, 35};
int[] expected = {1, 1};
```

- 최고 순위: 1등
- 최저 순위: 1등

---

## 4. Java 풀이 스켈레톤

```java
import java.util.Arrays;

public class Algorithm261028 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261028 algorithm = new Algorithm261028();

        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] winNums1 = {31, 10, 45, 1, 6, 19};

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] winNums2 = {38, 19, 20, 40, 15, 25};

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] winNums3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(
            algorithm.solution(lottos1, winNums1)
        )); // [3, 5]

        System.out.println(Arrays.toString(
            algorithm.solution(lottos2, winNums2)
        )); // [1, 6]

        System.out.println(Arrays.toString(
            algorithm.solution(lottos3, winNums3)
        )); // [1, 1]
    }
}
```

---

## 5. Python 풀이 스켈레톤

```python
def solution(lottos, win_nums):
    answer = []

    return answer

lottos1 = [44, 1, 0, 0, 31, 25]
win_nums1 = [31, 10, 45, 1, 6, 19]

lottos2 = [0, 0, 0, 0, 0, 0]
win_nums2 = [38, 19, 20, 40, 15, 25]

lottos3 = [45, 4, 35, 20, 3, 9]
win_nums3 = [20, 9, 3, 45, 4, 35]

print(solution(lottos1, win_nums1))  # [3, 5]
print(solution(lottos2, win_nums2))  # [1, 6]
print(solution(lottos3, win_nums3))  # [1, 1]
```

---

## 6. 구현 목표

1. 구매한 로또 번호와 당첨 번호를 비교한다.
2. 확인할 수 없는 번호 `0`을 고려한다.
3. 가능한 최고 순위를 계산한다.
4. 가능한 최저 순위를 계산한다.
5. `[최고순위, 최저순위]` 형태로 반환한다.