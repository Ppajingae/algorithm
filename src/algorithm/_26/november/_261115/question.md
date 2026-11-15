# 핸드폰 번호 가리기

**난이도:** Level 1  
**날짜:** 2026-11-15  
**Java 클래스명:** Algorithm261115

## 1. 문제 설명

개인정보 보호를 위해 전화번호의 일부를 가리려고 해.

문자열 `phone_number`가 주어졌을 때, **뒤의 4자리를 제외한 나머지 모든 문자를 `*`로 변경한 문자열**을 반환하는 `solution` 함수를 작성해.

## 2. 제한 조건

- `phone_number`의 길이는 4 이상 20 이하야.
- 마지막 4자리는 그대로 유지해야 해.
- 반환값은 문자열이야.

## 3. 입출력 예제

| phone_number | 결과 |
|---|---|
| `"01033334444"` | `"*******4444"` |
| `"027778888"` | `"*****8888"` |

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261115 {

    public String solution(String phone_number) {
        String answer = "";

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261115 algorithm = new Algorithm261115();

        String[] testCases = {
            "01033334444",
            "027778888",
            "1234",
            "12345",
            "01012345678",
            "12345678901234567890"
        };

        String[] expected = {
            "*******4444",
            "*****8888",
            "1234",
            "*2345",
            "*******5678",
            "****************7890"
        };

        for (int i = 0; i < testCases.length; i++) {
            String actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + actual
                + " | 예상: " + expected[i]
                + " | 통과: " + actual.equals(expected[i])
            );
        }
    }
}
```

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(phone_number):
    answer = ""

    # 여기에 구현

    return answer


test_cases = [
    ("01033334444", "*******4444"),
    ("027778888", "*****8888"),
    ("1234", "1234"),
    ("12345", "*2345"),
    ("01012345678", "*******5678"),
    ("12345678901234567890", "****************7890")
]

for index, (phone_number, expected) in enumerate(test_cases, start=1):
    actual = solution(phone_number)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 일반적인 11자리 전화번호
- 9자리 전화번호
- 최소 길이인 4자리
- 5자리 전화번호
- 최대 길이인 20자리