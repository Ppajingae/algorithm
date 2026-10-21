# 햄버거 만들기

**난이도:** Level 1

## 문제 설명

햄버거 가게에서 재료가 순서대로 쌓인다.

재료는 다음과 같이 구분한다.

- `1`: 빵
- `2`: 야채
- `3`: 고기

햄버거는 반드시 아래 순서로 쌓여야 포장할 수 있다.

```java
int[] hamburger = {1, 2, 3, 1};
```

재료가 쌓이는 도중 `1 → 2 → 3 → 1` 순서가 완성되면 해당 재료 4개를 제거하고 햄버거 하나를 포장한다.

재료가 제거되면 남아 있는 재료들이 이어지며, 새로운 햄버거가 만들어질 수도 있다.

주어진 재료 배열 `ingredient`에서 포장할 수 있는 햄버거의 총개수를 반환하라.

## 제한사항

- `1 ≤ ingredient.length ≤ 1,000,000`
- `ingredient[i]`는 `1`, `2`, `3` 중 하나이다.

## 입출력 예시

### 예제 1

```java
int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
int expected = 2;
```

첫 번째 햄버거를 포장한 뒤 남는 재료:

```java
int[] remaining = {2, 1, 2, 3, 1};
```

두 번째 햄버거를 포장한 뒤 남는 재료:

```java
int[] remaining = {2};
```

**결과: 2**

### 예제 2

```java
int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
int expected = 0;
```

햄버거를 만들 수 있는 재료 순서가 존재하지 않는다.

**결과: 0**

## Java 코드

```java
class Solution {
    public int solution(int[] ingredient) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.solution(
                new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}
        );

        int result2 = solution.solution(
                new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}
        );

        System.out.println(result1); // 2
        System.out.println(result2); // 0
    }
}
```