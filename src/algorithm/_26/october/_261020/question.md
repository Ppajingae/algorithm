# 성격 유형 검사하기

**난이도:** Level 1  
**언어:** Java / Python

## 문제 설명

카카오 성격 유형 검사는 총 4개의 지표로 구성된다.

각 지표에는 서로 반대되는 두 가지 성격 유형이 존재한다.

| 지표 | 첫 번째 유형 | 두 번째 유형 |
|---|---|---|
| 1번 | R (라이언) | T (튜브) |
| 2번 | C (콘) | F (프로도) |
| 3번 | J (제이지) | M (무지) |
| 4번 | A (어피치) | N (네오) |

검사 결과는 각 지표에서 점수가 높은 성격 유형을 선택하여 4글자 문자열로 반환한다.

점수가 같다면 **사전순으로 빠른 성격 유형**을 선택한다.

## 선택지와 점수

각 질문에는 7개의 선택지가 존재한다.

| 선택지 | 의미 | 점수 |
|---|---|---|
| 1 | 매우 비동의 | 첫 번째 유형 +3 |
| 2 | 비동의 | 첫 번째 유형 +2 |
| 3 | 약간 비동의 | 첫 번째 유형 +1 |
| 4 | 모르겠음 | 점수 없음 |
| 5 | 약간 동의 | 두 번째 유형 +1 |
| 6 | 동의 | 두 번째 유형 +2 |
| 7 | 매우 동의 | 두 번째 유형 +3 |

각 질문의 `survey[i]`는 두 글자로 구성된다.

- 첫 번째 문자: 비동의 선택 시 점수를 받는 유형
- 두 번째 문자: 동의 선택 시 점수를 받는 유형

예를 들어 `"AN"`이라면 비동의는 A, 동의는 N에 점수를 부여한다.

반대로 `"NA"`라면 비동의는 N, 동의는 A에 점수를 부여한다.

## 제한사항

- `1 ≤ survey.length ≤ 1,000`
- `survey[i]`는 다음 중 하나이다.

```java
String[] types = {
    "RT", "TR", "FC", "CF",
    "MJ", "JM", "AN", "NA"
};
```

- `choices.length == survey.length`
- `1 ≤ choices[i] ≤ 7`

## 입출력 예시

### 예제 1

```java
String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
int[] choices = {5, 3, 2, 7, 5};

String expected = "TCMA";
```

### 예제 2

```java
String[] survey = {"TR", "RT", "TR"};
int[] choices = {7, 1, 3};

String expected = "RCJA";
```

## Java 풀이 스켈레톤

```java
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        return answer;
    }
}
```

### Java 테스트 코드

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String result1 = solution.solution(
            new String[]{"AN", "CF", "MJ", "RT", "NA"},
            new int[]{5, 3, 2, 7, 5}
        );

        String result2 = solution.solution(
            new String[]{"TR", "RT", "TR"},
            new int[]{7, 1, 3}
        );

        System.out.println(result1); // TCMA
        System.out.println(result2); // RCJA
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(survey, choices):
    answer = ""

    return answer
```

### Python 테스트 코드

```python
survey1 = ["AN", "CF", "MJ", "RT", "NA"]
choices1 = [5, 3, 2, 7, 5]

survey2 = ["TR", "RT", "TR"]
choices2 = [7, 1, 3]

print(solution(survey1, choices1))  # TCMA
print(solution(survey2, choices2))  # RCJA
```

## 목표

각 질문의 응답을 반영하여 8개 성격 유형의 점수를 계산하고, 4개 지표별 최종 유형을 결정한다.

**반환값:** 길이가 4인 문자열