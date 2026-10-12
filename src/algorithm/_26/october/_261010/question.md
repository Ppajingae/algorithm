# 문자열 나누기

- 플랫폼: 프로그래머스
- 난이도: Level 1
- 날짜: 2026-10-10

## 1. 문제 설명

문자열 `s`가 주어졌을 때, 다음 규칙에 따라 문자열을 여러 개로 분리합니다.

### 문자열 분리 규칙

1. 문자열의 첫 번째 글자를 읽고, 이 글자를 `x`라고 정합니다.
2. 문자열을 왼쪽부터 오른쪽으로 읽으면서 다음 두 가지 횟수를 계산합니다.
    - `x`와 같은 글자가 등장한 횟수
    - `x`와 다른 글자가 등장한 횟수
3. 두 횟수가 처음으로 같아지는 순간, 지금까지 읽은 문자열을 분리합니다.
4. 남은 문자열이 있다면 다시 첫 번째 글자를 `x`로 정하고 같은 과정을 반복합니다.
5. 문자열 끝까지 읽었는데 두 횟수가 같아지지 않더라도 남은 문자열을 하나로 분리합니다.

## 2. 목표

주어진 문자열 `s`를 규칙에 따라 분리했을 때,
**분리된 문자열의 개수**를 반환합니다.

## 3. 제한사항

- 1 ≤ s.length() ≤ 10,000
- 문자열 `s`는 영어 소문자로만 구성됩니다.

## 4. 입출력 예

### 예제 1

```java
String s = "banana";
int expected = 3;
```

분리 결과:

```text
ba | na | na
```

### 예제 2

```java
String s = "abracadabra";
int expected = 6;
```

분리 결과:

```text
ab | ra | ca | da | br | a
```

### 예제 3

```java
String s = "aaabbaccccabba";
int expected = 3;
```

분리 결과:

```text
aaabbacc | ccab | ba
```

## 5. Java 기본 코드

```java
class Solution {

    public int solution(String s) {
        int answer = 0;

        return answer;
    }
}
```

## 6. 테스트 코드

```java
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "banana";
        String s2 = "abracadabra";
        String s3 = "aaabbaccccabba";

        System.out.println(solution.solution(s1)); // 3
        System.out.println(solution.solution(s2)); // 6
        System.out.println(solution.solution(s3)); // 3
    }
}
```

## 7. 문제 분석 노트

### ① 무엇을 구해야 하는가?



### ② 어떤 데이터가 주어졌는가?



### ③ 핵심 조건은 무엇인가?



### ④ 어떤 정보를 기억해야 하는가?



### ⑤ 언제 정답을 갱신하는가?



### ⑥ 예상 알고리즘 / 자료구조



### ⑦ 예상 시간 복잡도



## 8. 풀이 후 복기

### 처음 생각했던 접근법



### 실제 해결한 접근법



### 두 접근법의 차이


