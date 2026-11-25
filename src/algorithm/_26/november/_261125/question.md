# 이상한 문자 만들기

**난이도:** Level 1
**날짜:** 2026-11-25
**Java 클래스명:** Algorithm261125

## 1. 문제 설명

문자열 s는 한 개 이상의 단어로 구성되어 있다.
각 단어는 하나 이상의 공백 문자로 구분되어 있다.

각 단어의 짝수 번째 알파벳은 대문자로, 홀수 번째
알파벳은 소문자로 변환한 문자열을 반환하는
solution 함수를 완성한다.

## 2. 제한 조건

- 문자열 전체의 인덱스가 아닌 단어별 인덱스를 기준으로
  짝수와 홀수를 판단한다.
- 각 단어의 첫 번째 글자는 0번째 인덱스로 처리한다.

## 3. 입출력 예제

| s | 반환값 |
|---|---|
| "try hello world" | "TrY HeLlO WoRlD" |

### 입출력 예제 설명

"try hello world"는 "try", "hello", "world"라는
세 개의 단어로 구성되어 있다.

각 단어의 짝수 번째 문자를 대문자로, 홀수 번째 문자를
소문자로 변환하면 "TrY", "HeLlO", "WoRlD"가 된다.

따라서 "TrY HeLlO WoRlD"를 반환한다.

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261125 {

    public String solution(String s) {
        String answer = "";

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261125 algorithm = new Algorithm261125();

        String[] testCases = {
            "try hello world",
            "hello",
            "HELLO",
            "a",
            "A",
            "ab cd ef",
            "abc defg",
            "try  hello   world",
            " hello",
            "hello ",
            "  hello  world  ",
            "hElLo WoRlD",
            "a b c d"
        };

        String[] expected = {
            "TrY HeLlO WoRlD",
            "HeLlO",
            "HeLlO",
            "A",
            "A",
            "Ab Cd Ef",
            "AbC DeFg",
            "TrY  HeLlO   WoRlD",
            " HeLlO",
            "HeLlO ",
            "  HeLlO  WoRlD  ",
            "HeLlO WoRlD",
            "A B C D"
        };

        for (int i = 0; i < testCases.length; i++) {
            String actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 입력: \"" + testCases[i] + "\""
                + " | 결과: \"" + actual + "\""
                + " | 예상: \"" + expected[i] + "\""
                + " | 통과: " + expected[i].equals(actual)
            );
        }
    }
}
```

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(s):
    answer = ""

    # 여기에 구현

    return answer


test_cases = [
    ("try hello world", "TrY HeLlO WoRlD"),
    ("hello", "HeLlO"),
    ("HELLO", "HeLlO"),
    ("a", "A"),
    ("A", "A"),
    ("ab cd ef", "Ab Cd Ef"),
    ("abc defg", "AbC DeFg"),
    ("try  hello   world", "TrY  HeLlO   WoRlD"),
    (" hello", " HeLlO"),
    ("hello ", "HeLlO "),
    ("  hello  world  ", "  HeLlO  WoRlD  "),
    ("hElLo WoRlD", "HeLlO WoRlD"),
    ("a b c d", "A B C D")
]

for index, (s, expected) in enumerate(test_cases, start=1):
    actual = solution(s)

    print(
        f"테스트 {index}"
        f" | 입력: {s!r}"
        f" | 결과: {actual!r}"
        f" | 예상: {expected!r}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 단어가 하나인 문자열
- 단어가 여러 개인 문자열
- 한 글자로 구성된 단어
- 대문자로만 구성된 문자열
- 대문자와 소문자가 혼합된 문자열
- 단어 사이에 공백이 여러 개 존재하는 경우
- 문자열 앞에 공백이 존재하는 경우
- 문자열 뒤에 공백이 존재하는 경우
- 단어별 길이가 서로 다른 경우