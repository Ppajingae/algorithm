# 삼총사

**난이도:** Level 1

## 문제 설명

한국중학교의 학생들은 각각 정수 번호를 가지고 있다.

서로 다른 학생 3명의 번호를 더했을 때 합이 `0`이면 해당 학생들을 **삼총사**라고 한다.

학생들의 번호가 담긴 배열 `number`가 주어졌을 때, 삼총사를 만들 수 있는 경우의 수를 반환하라.

### 조건

- 반드시 서로 다른 학생 3명을 선택해야 한다.
- 선택한 학생 3명의 번호 합은 `0`이어야 한다.
- 같은 번호를 가진 학생이 여러 명 존재할 수 있다.
- 번호가 같더라도 서로 다른 학생이라면 별개의 경우로 계산한다.
- 학생을 선택하는 순서는 구분하지 않는다.

## 제한사항

- `3 ≤ number.length ≤ 13`
- `-1,000 ≤ number[i] ≤ 1,000`

## 입출력 예시

### 예제 1

```java
int[] number = {-2, 3, 0, 2, -5};
int expected = 2;
```

삼총사가 되는 조합:

```java
int[][] combinations = {
    {-2, 0, 2},
    {3, 2, -5}
};
```

**결과: 2**

### 예제 2

```java
int[] number = {-3, -2, -1, 0, 1, 2, 3};
int expected = 5;
```

삼총사가 되는 조합:

```java
int[][] combinations = {
    {-3, 0, 3},
    {-2, 0, 2},
    {-1, 0, 1},
    {-2, -1, 3},
    {-3, 1, 2}
};
```

**결과: 5**

### 예제 3

```java
int[] number = {-1, 1, -1, 1};
int expected = 0;
```

**결과: 0**

## Java 코드

```java
class Solution {
    public int solution(int[] number) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.solution(
            new int[]{-2, 3, 0, 2, -5}
        );

        int result2 = solution.solution(
            new int[]{-3, -2, -1, 0, 1, 2, 3}
        );

        int result3 = solution.solution(
            new int[]{-1, 1, -1, 1}
        );

        System.out.println(result1); // 2
        System.out.println(result2); // 5
        System.out.println(result3); // 0
    }
}
```