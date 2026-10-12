# 명예의 전당 (1)

난이도: Level 1

## 문제 설명

매일 한 명의 가수가 출연하여 점수를 받는다.

명예의 전당에는 지금까지 출연한 가수 중 점수가 높은
최대 `k`명의 점수가 유지된다.

- 처음 `k`일까지는 모든 점수가 명예의 전당에 등록된다.
- 이후에는 기존 최하위 점수보다 높은 점수가 들어오면 교체된다.
- 매일 명예의 전당에 등록된 점수 중 최솟값을 발표한다.

매일 발표한 최하위 점수를 배열로 반환하라.

## 제한사항

- 3 ≤ k ≤ 100
- 7 ≤ score.length ≤ 1,000
- 0 ≤ score[i] ≤ 2,000

## 입출력 예시

### 예제 1

```java
int k = 3;
int[] score = {10, 100, 20, 150, 1, 100, 200};
int[] expected = {10, 10, 10, 20, 20, 100, 100};
```

### 예제 2

```java
int k = 4;
int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
int[] expected = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};
```

## Java 코드

```java
class Solution {
    public int[] solution(int k, int[] score) {

    }
}
```

## 테스트 코드

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result1 = solution.solution(
            3,
            new int[]{10, 100, 20, 150, 1, 100, 200}
        );

        int[] result2 = solution.solution(
            4,
            new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}
        );

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
```