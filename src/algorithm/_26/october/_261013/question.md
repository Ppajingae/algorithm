# 기사단원의 무기

**난이도:** Level 1

## 문제 설명

숫자나라 기사단에는 1번부터 `number`번까지 기사가 있다.

각 기사는 자신의 번호에 해당하는 **약수의 개수**만큼 공격력을 가진 무기를 구매한다.

단, 공격력이 `limit`를 초과하면 해당 기사는 공격력이 `power`인 무기를 구매해야 한다.

무기의 공격력 1당 철 1kg이 필요하다.

모든 기사의 무기를 제작하는 데 필요한 **철의 총무게**를 반환하라.

## 제한사항

- 1 ≤ `number` ≤ 100,000
- 2 ≤ `limit` ≤ 100
- 1 ≤ `power` ≤ `limit`

## 입출력 예시

### 예제 1

```java
int number = 5;
int limit = 3;
int power = 2;

int expected = 10;
```

각 기사 번호의 약수 개수:

```java
int[] divisorCounts = {1, 2, 2, 3, 2};
```

모든 기사가 제한 공격력 이하의 무기를 구매한다.

**결과: 10**

### 예제 2

```java
int number = 10;
int limit = 3;
int power = 2;

int expected = 21;
```

각 기사 번호의 약수 개수:

```java
int[] divisorCounts = {1, 2, 2, 3, 2, 4, 2, 4, 3, 4};
```

6번, 8번, 10번 기사는 공격력이 제한수치 3을 초과하므로 공격력 2인 무기를 구매한다.

실제 구매하는 무기의 공격력:

```java
int[] attackPowers = {1, 2, 2, 3, 2, 2, 2, 2, 3, 2};
```

**결과: 21**

## Java 코드

```java
class Solution {
    public int solution(int number, int limit, int power) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.solution(5, 3, 2);
        int result2 = solution.solution(10, 3, 2);

        System.out.println(result1); // 10
        System.out.println(result2); // 21
    }
}
```