# 푸드 파이트 대회

**난이도:** Level 1

## 문제 설명

두 선수가 양쪽 끝에서 음식을 먹으며 중앙에 있는 물에 먼저 도달하는 대회를 진행한다.

음식은 다음 조건에 맞게 배치해야 한다.

- 두 선수가 먹는 음식의 종류와 양이 같아야 한다.
- 두 선수가 먹는 음식의 순서도 같아야 한다.
- 칼로리가 낮은 음식부터 먹도록 배치한다.
- 중앙에는 물(`0`)을 배치한다.
- 조건에 맞지 않아 남는 음식은 사용하지 않는다.

음식의 종류별 수량을 나타내는 배열 `food`가 주어질 때, 대회를 위한 음식 배치를 문자열로 반환하라.

## 제한사항

- `2 ≤ food.length ≤ 9`
- `1 ≤ food[i] ≤ 1,000`
- `food[0] = 1`
- `food[i]`는 i번 음식의 수량이다.
- 음식은 칼로리가 낮은 순서대로 주어진다.
- 정답의 길이가 3 이상인 경우만 입력된다.

## 입출력 예시

### 예제 1

```java
int[] food = {1, 3, 4, 6};
String expected = "1223330333221";
```

각 선수가 먹는 음식:

```java
int[] portions = {1, 2, 3};
```

최종 배치:

```text
122333 | 0 | 333221
```

### 예제 2

```java
int[] food = {1, 7, 1, 2};
String expected = "111303111";
```

각 선수가 먹는 음식:

```java
int[] portions = {3, 0, 1};
```

최종 배치:

```text
1113 | 0 | 3111
```

## Java 코드

```java
class Solution {
    public String solution(int[] food) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String result1 = solution.solution(
                new int[]{1, 3, 4, 6}
        );

        String result2 = solution.solution(
                new int[]{1, 7, 1, 2}
        );

        System.out.println(result1); // 1223330333221
        System.out.println(result2); // 111303111
    }
}
```