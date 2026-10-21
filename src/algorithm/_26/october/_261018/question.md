# 콜라 문제

**난이도:** Level 1

## 문제 설명

빈 병을 마트에 가져가면 새로운 콜라를 받을 수 있다.

교환 규칙은 다음과 같다.

- 빈 병 `a`개를 가져가면 콜라 `b`병을 받는다.
- 받은 콜라를 마시면 다시 빈 병으로 사용할 수 있다.
- 빈 병이 `a`개 미만이면 더 이상 교환할 수 없다.
- 한 번에 여러 묶음의 빈 병을 교환할 수 있다.
- 교환하고 남은 빈 병은 다음 교환에 사용할 수 있다.

초기에 빈 병 `n`개를 가지고 있을 때, 교환을 통해 받을 수 있는 **콜라의 총개수**를 반환하라.

## 제한사항

- `1 ≤ b < a ≤ n ≤ 1,000,000`
- 정답은 항상 `int` 범위를 넘지 않는다.

## 입출력 예시

### 예제 1

```java
int a = 2;
int b = 1;
int n = 20;

int expected = 19;
```

교환 과정:

| 교환 | 보유한 빈 병 | 받은 콜라 | 교환 후 빈 병 |
|---|---:|---:|---:|
| 1 | 20 | 10 | 10 |
| 2 | 10 | 5 | 5 |
| 3 | 5 | 2 | 3 |
| 4 | 3 | 1 | 2 |
| 5 | 2 | 1 | 1 |

**결과: 19**

### 예제 2

```java
int a = 3;
int b = 1;
int n = 20;

int expected = 9;
```

교환 과정:

| 교환 | 보유한 빈 병 | 받은 콜라 | 교환 후 빈 병 |
|---|---:|---:|---:|
| 1 | 20 | 6 | 8 |
| 2 | 8 | 2 | 4 |
| 3 | 4 | 1 | 2 |

**결과: 9**

## Java 코드

```java
class Solution {
    public int solution(int a, int b, int n) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.solution(2, 1, 20);
        int result2 = solution.solution(3, 1, 20);

        System.out.println(result1); // 19
        System.out.println(result2); // 9
    }
}
```