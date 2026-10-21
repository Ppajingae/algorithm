# 옹알이 (2)

**난이도:** Level 1

## 문제 설명

머쓱이의 조카는 다음 네 가지 발음만 할 수 있다.

```java
String[] sounds = {"aya", "ye", "woo", "ma"};
```

이 네 가지 발음을 조합한 단어도 발음할 수 있다.

단, 다음 조건을 만족해야 한다.

- 네 가지 발음만 사용해야 한다.
- 여러 발음을 조합하는 것은 가능하다.
- **같은 발음을 연속해서 사용할 수 없다.**
- 발음할 수 없는 문자열이 포함되어 있으면 해당 단어는 발음할 수 없다.

문자열 배열 `babbling`이 주어졌을 때, 발음할 수 있는 단어의 개수를 반환하라.

## 제한사항

- `1 ≤ babbling.length ≤ 100`
- `1 ≤ babbling[i].length ≤ 30`
- 모든 문자열은 알파벳 소문자로 구성된다.

## 입출력 예시

### 예제 1

```java
String[] babbling = {"aya", "yee", "u", "maa"};
int expected = 1;
```

발음 가능한 단어:

```java
String[] valid = {"aya"};
```

**결과: 1**

### 예제 2

```java
String[] babbling = {
    "ayaye",
    "uuu",
    "yeye",
    "yemawoo",
    "ayaayaa"
};

int expected = 2;
```

발음 가능한 단어:

```java
String[] valid = {"ayaye", "yemawoo"};
```

발음할 수 없는 단어:

```java
String[] invalid = {"uuu", "yeye", "ayaayaa"};
```

- `"uuu"`: 허용된 발음으로 구성할 수 없음
- `"yeye"`: `"ye"`가 연속으로 등장함
- `"ayaayaa"`: 허용된 발음으로 완전히 구성할 수 없음

**결과: 2**

## 추가 확인 예시

```java
String[] babbling = {
    "aya",
    "ayaye",
    "yeaya",
    "woo",
    "mama",
    "woowo",
    "yeye"
};

int expected = 4;
```

## Java 코드

```java
class Solution {
    public int solution(String[] babbling) {

    }
}
```

## 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] test1 = {"aya", "yee", "u", "maa"};

        String[] test2 = {
            "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"
        };

        String[] test3 = {
            "aya", "ayaye", "yeaya", "woo",
            "mama", "woowo", "yeye"
        };

        System.out.println(solution.solution(test1)); // 1
        System.out.println(solution.solution(test2)); // 2
        System.out.println(solution.solution(test3)); // 4
    }
}
```