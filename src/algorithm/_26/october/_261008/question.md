# 단어 변환

## 문제 설명

두 개의 단어 `begin`, `target`과 단어의 집합 `words`가 주어집니다.

다음 규칙에 따라 `begin`을 `target`으로 변환하는 **가장 짧은 변환 과정**을 찾아야 합니다.

### 변환 규칙

1. 한 번에 **한 개의 알파벳만** 바꿀 수 있습니다.
2. 변환한 단어는 반드시 `words`에 포함되어 있어야 합니다.

최소 몇 단계의 변환을 거쳐 `target`에 도달할 수 있는지 반환하세요.

변환할 수 없다면 `0`을 반환합니다.

---

## 예시

```java
String begin = "hit";
String target = "cog";

String[] words = {
    "hot", "dot", "dog", "lot", "log", "cog"
};
```

가능한 변환 과정:

```text
hit
 ↓
hot
 ↓
dot
 ↓
dog
 ↓
cog
```

각 단계에서 정확히 한 글자만 변경됩니다.

```text
hit → hot : i → o
hot → dot : h → d
dot → dog : t → g
dog → cog : d → c
```

총 4번 변환했으므로 정답은:

```java
return 4;
```

### 다른 변환 경로

```text
hit
 ↓
hot
 ↓
lot
 ↓
log
 ↓
cog
```

이 경로 역시 4단계입니다.

**여러 변환 경로가 존재한다면 가장 적은 단계의 경로를 선택해야 합니다.**

---

## 제한사항

| 항목 | 제한 |
|---|---|
| 단어 구성 | 알파벳 소문자 |
| 단어 길이 | 3 이상 10 이하 |
| 단어 길이 관계 | 모든 단어의 길이가 같음 |
| `words` 길이 | 3 이상 50 이하 |
| `words` 중복 | 없음 |
| `begin`, `target` | 서로 다른 단어 |
| 변환 불가능 | 0 반환 |

---

## 입출력 예

### 예제 1

```java
String begin = "hit";
String target = "cog";

String[] words = {
    "hot", "dot", "dog", "lot", "log", "cog"
};

int expected = 4;
```

결과:

```java
4
```

### 예제 2

```java
String begin = "hit";
String target = "cog";

String[] words = {
    "hot", "dot", "dog", "lot", "log"
};

int expected = 0;
```

결과:

```java
0
```

`target`인 `"cog"`가 `words`에 없으므로 변환할 수 없습니다.

---

## Java 메서드

```java
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        return answer;
    }
}
```

---

## 구현 전 확인할 사항

### 1. 두 단어가 변환 가능한 관계인지 판단하기

예를 들어:

```text
hit → hot : 가능 (1글자 차이)
hit → dot : 불가능 (2글자 차이)
hot → dot : 가능 (1글자 차이)
```

두 단어를 비교했을 때 **서로 다른 문자의 개수가 정확히 1개**여야 합니다.

### 2. 여러 변환 경로가 존재할 수 있음

```text
         dot → dog
        /         \
hit → hot          cog
        \         /
         lot → log
```

한 가지 경로만 확인해서는 최소 변환 횟수를 보장할 수 없습니다.

### 3. 같은 단어를 반복 방문할 수 있음

```text
hit → hot → dot → hot → dot → ...
```

이미 방문한 단어를 다시 방문하면 불필요한 탐색이 발생할 수 있습니다.

### 4. 입력 크기

```text
words.length ≤ 50
word.length ≤ 10
```

단어 개수가 최대 50개이므로, 단어 사이의 변환 가능 여부를 직접 비교하는 작업 자체는 크게 부담되지 않습니다.

---

## 생각해볼 질문

1. 두 단어가 한 글자만 다른지 어떻게 판별할까?
2. 현재 단어에서 다음으로 이동할 수 있는 단어들을 어떻게 찾을까?
3. 여러 경로 중 최소 변환 횟수를 어떻게 보장할까?
4. 이미 확인한 단어를 다시 탐색하지 않으려면 무엇이 필요할까?
5. `target`에 도달할 수 없다면 언제 `0`을 반환해야 할까?

**핵심은 단어를 변환하는 것보다 최소 변환 횟수를 구하는 방법에 있습니다.**