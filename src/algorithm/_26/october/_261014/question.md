# 과일 장수

**난이도:** Level 1

## 문제 설명

과일 장수가 사과를 상자 단위로 판매하려고 한다.

각 사과에는 `1`부터 `k`까지의 품질 점수가 부여된다.

사과를 판매하는 규칙은 다음과 같다.

- 한 상자에는 사과를 정확히 `m`개 담아야 한다.
- 상자의 가격은 **상자에 담긴 사과의 최저 점수 × m**이다.
- 사과는 상자 단위로만 판매할 수 있다.
- 상자에 담지 못한 사과는 버린다.

사과들의 점수가 주어졌을 때, 얻을 수 있는 **최대 이익**을 반환하라.

## 제한사항

- `3 ≤ k ≤ 9`
- `3 ≤ m ≤ 10`
- `7 ≤ score.length ≤ 1,000,000`
- `1 ≤ score[i] ≤ k`
- 이익이 발생하지 않으면 `0`을 반환한다.

## 입출력 예시

### 예제 1

```java
int k = 3;
int m = 4;
int[] score = {1, 2, 3, 1, 2, 3, 1};

int expected = 8;
```

판매 가능한 상자:

```java
int[] box = {2, 2, 3, 3};
```

상자의 최저 점수가 `2`이므로 판매 가격은 `2 × 4 = 8`이다.

### 예제 2

```java
int k = 4;
int m = 3;
int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

int expected = 33;
```

판매 가능한 상자:

```java
int[][] boxes = {
    {1, 1, 2},
    {2, 2, 2},
    {4, 4, 4},
    {4, 4, 4}
};
```

각 상자의 가격:

```java
int[] prices = {3, 6, 12, 12};
```

총이익은 `33`이다.

## Java 코드

```java
class Solution {
    public int solution(int k, int m, int[] score) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.solution(
            3,
            4,
            new int[]{1, 2, 3, 1, 2, 3, 1}
        );

        int result2 = solution.solution(
            4,
            3,
            new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}
        );

        System.out.println(result1); // 8
        System.out.println(result2); // 33
    }
}
```