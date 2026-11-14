# 완주하지 못한 선수

**난이도:** Level 1  
**날짜:** 2026-11-09  
**Java 클래스명:** Algorithm261109

## 1. 문제 설명

수많은 선수가 마라톤에 참가했다.

참가한 선수 중 단 한 명을 제외하고 모든 선수가 마라톤을 완주했다.

참가자 명단 `participant`와 완주자 명단 `completion`이 주어질 때, **완주하지 못한 선수의 이름**을 반환하라.

### 주의사항

- 완주하지 못한 선수는 정확히 한 명이다.
- 참가자 중에는 이름이 같은 선수가 있을 수 있다.
- 같은 이름의 선수가 여러 명이라도 각각 별개의 참가자로 취급한다.

---

## 2. 제한사항

- `1 ≤ participant.length ≤ 100,000`
- `completion.length = participant.length - 1`
- 선수 이름은 알파벳 소문자로만 이루어진다.
- `1 ≤ 선수 이름 길이 ≤ 20`
- 참가자 중 동명이인이 존재할 수 있다.

---

## 3. 입출력 예시

| participant | completion | result |
|---|---|---|
| `["leo", "kiki", "eden"]` | `["eden", "kiki"]` | `"leo"` |
| `["marina", "josipa", "nikola", "vinko", "filipa"]` | `["josipa", "filipa", "marina", "nikola"]` | `"vinko"` |
| `["mislav", "stanko", "mislav", "ana"]` | `["stanko", "ana", "mislav"]` | `"mislav"` |

### 예제 1

**입력**

```text
participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]
```

**출력**

```text
"leo"
```

`leo`는 참가자 명단에 있지만 완주자 명단에는 없다.

### 예제 2

**입력**

```text
participant = ["marina", "josipa", "nikola", "vinko", "filipa"]
completion = ["josipa", "filipa", "marina", "nikola"]
```

**출력**

```text
"vinko"
```

### 예제 3

**입력**

```text
participant = ["mislav", "stanko", "mislav", "ana"]
completion = ["stanko", "ana", "mislav"]
```

**출력**

```text
"mislav"
```

`mislav`라는 이름의 참가자가 두 명이지만 완주자는 한 명뿐이다.

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261109 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261109 algorithm = new Algorithm261109();

        String[][] participantCases = {
            {"leo", "kiki", "eden"},
            {"marina", "josipa", "nikola", "vinko", "filipa"},
            {"mislav", "stanko", "mislav", "ana"}
        };

        String[][] completionCases = {
            {"eden", "kiki"},
            {"josipa", "filipa", "marina", "nikola"},
            {"stanko", "ana", "mislav"}
        };

        String[] expected = {
            "leo",
            "vinko",
            "mislav"
        };

        for (int i = 0; i < participantCases.length; i++) {
            String actual = algorithm.solution(
                participantCases[i],
                completionCases[i]
            );

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + actual
                + " | 예상: " + expected[i]
                + " | 통과: " + expected[i].equals(actual)
            );
        }
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(participant, completion):
    answer = ""

    return answer


test_cases = [
    (
        ["leo", "kiki", "eden"],
        ["eden", "kiki"],
        "leo"
    ),
    (
        ["marina", "josipa", "nikola", "vinko", "filipa"],
        ["josipa", "filipa", "marina", "nikola"],
        "vinko"
    ),
    (
        ["mislav", "stanko", "mislav", "ana"],
        ["stanko", "ana", "mislav"],
        "mislav"
    )
]

for index, (participant, completion, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(participant, completion)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 구현 목표

1. 참가자 명단과 완주자 명단을 입력받는다.
2. 두 명단을 비교한다.
3. 동명이인이 존재하는 경우도 정확하게 처리한다.
4. 완주하지 못한 선수 한 명을 찾는다.
5. 해당 선수의 이름을 문자열로 반환한다.