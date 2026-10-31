# 신규 아이디 추천

**난이도:** Level 1  
**날짜:** 2026-10-30  
**언어:** Java / Python

## 1. 문제 설명

신규 사용자가 입력한 아이디 `new_id`를 정해진 규칙에 맞게 변환하여 추천 아이디를 반환하라.

### 아이디 규칙

- 길이는 3자 이상 15자 이하이다.
- 알파벳 소문자, 숫자, `-`, `_`, `.`만 사용할 수 있다.
- 마침표(`.`)는 처음이나 끝에 위치할 수 없다.
- 마침표(`.`)는 연속해서 사용할 수 없다.

## 2. 아이디 변환 과정

다음 7단계를 순서대로 수행한다.

**1단계 — 소문자 변환**

모든 대문자를 소문자로 변경한다.

**2단계 — 허용되지 않는 문자 제거**

알파벳 소문자, 숫자, `-`, `_`, `.`을 제외한 모든 문자를 제거한다.

**3단계 — 연속된 마침표 처리**

마침표가 2개 이상 연속된다면 하나의 마침표로 변경한다.

**4단계 — 양 끝 마침표 제거**

문자열의 처음이나 끝에 마침표가 있다면 제거한다.

**5단계 — 빈 문자열 처리**

문자열이 비어 있다면 `"a"`를 대입한다.

**6단계 — 최대 길이 제한**

문자열 길이가 16자 이상이라면 처음 15자만 남긴다.

이후 마지막 문자가 마침표라면 제거한다.

**7단계 — 최소 길이 보장**

문자열 길이가 2자 이하라면 마지막 문자를 반복해서 추가하여 길이를 3으로 만든다.

---

## 3. 제한사항

- `1 ≤ new_id.length ≤ 1,000`
- 알파벳 대문자, 소문자, 숫자, 특수문자로 구성된다.
- 특수문자는 다음 문자들로 한정된다.

```text
-_.~!@#$%^&*()=+[{]}:?,<>/
```

## 4. 입출력 예시

| new_id | result |
|---|---|
| `"...!@BaT#*..y.abcdefghijklm"` | `"bat.y.abcdefghi"` |
| `"z-+.^."` | `"z--"` |
| `"=.="` | `"aaa"` |
| `"123_.def"` | `"123_.def"` |
| `"abcdefghijklmn.p"` | `"abcdefghijklmn"` |

### 예제 1

```java
String newId = "...!@BaT#*..y.abcdefghijklm";
String expected = "bat.y.abcdefghi";
```

### 예제 2

```java
String newId = "z-+.^.";
String expected = "z--";
```

### 예제 3

```java
String newId = "=.=";
String expected = "aaa";
```

### 예제 4

```java
String newId = "123_.def";
String expected = "123_.def";
```

### 예제 5

```java
String newId = "abcdefghijklmn.p";
String expected = "abcdefghijklmn";
```

---

## 5. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261030 {

    public String solution(String new_id) {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261030 algorithm = new Algorithm261030();

        String[] newIds = {
            "...!@BaT#*..y.abcdefghijklm",
            "z-+.^.",
            "=.=",
            "123_.def",
            "abcdefghijklmn.p"
        };

        String[] expected = {
            "bat.y.abcdefghi",
            "z--",
            "aaa",
            "123_.def",
            "abcdefghijklmn"
        };

        for (int i = 0; i < newIds.length; i++) {
            System.out.println(
                "결과: " + algorithm.solution(newIds[i])
                + " / 예상: " + expected[i]
            );
        }
    }
}
```

---

## 6. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(new_id):
    answer = ""

    return answer


new_ids = [
    "...!@BaT#*..y.abcdefghijklm",
    "z-+.^.",
    "=.=",
    "123_.def",
    "abcdefghijklmn.p"
]

expected = [
    "bat.y.abcdefghi",
    "z--",
    "aaa",
    "123_.def",
    "abcdefghijklmn"
]

for new_id, result in zip(new_ids, expected):
    print(f"결과: {solution(new_id)} / 예상: {result}")
```

---

## 7. 구현 목표

1. 문자열을 정해진 7단계에 따라 순서대로 변환한다.
2. 허용되지 않는 문자를 제거한다.
3. 마침표의 위치와 연속 여부를 처리한다.
4. 문자열의 최소·최대 길이를 보장한다.
5. 최종 추천 아이디를 문자열로 반환한다.