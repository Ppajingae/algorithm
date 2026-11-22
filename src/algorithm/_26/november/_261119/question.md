# 짝수와 홀수

**난이도:** Level 1  
**날짜:** 2026-11-19  
**Java 클래스명:** Algorithm261119

## 1. 문제 설명

정수 `num`이 주어졌을 때 다음 조건에 따라 문자열을 반환하는 `solution` 함수를 작성해.

- 짝수인 경우 `"Even"` 반환
- 홀수인 경우 `"Odd"` 반환

## 2. 제한 조건

- `num`은 Java `int` 범위의 정수야.
- `0`은 짝수로 취급해.
- 반환값은 문자열이야.

## 3. 입출력 예제

| num | 결과 |
|---|---|
| 3 | `"Odd"` |
| 4 | `"Even"` |

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261119 {

    public String solution(int num) {
        String answer = "";

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261119 algorithm = new Algorithm261119();

        int[] testCases = {
            3,
            4,
            0,
            1,
            2,
            -1,
            -2,
            -3,
            -4,
            1000000,
            Integer.MAX_VALUE,
            Integer.MIN_VALUE
        };

        String[] expected = {
            "Odd",
            "Even",
            "Even",
            "Odd",
            "Even",
            "Odd",
            "Even",
            "Odd",
            "Even",
            "Even",
            "Odd",
            "Even"
        };

        for (int i = 0; i < testCases.length; i++) {
            String actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 입력: " + testCases[i]
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
def solution(num):
    answer = ""

    # 여기에 구현

    return answer


test_cases = [
    (3, "Odd"),
    (4, "Even"),
    (0, "Even"),
    (1, "Odd"),
    (2, "Even"),
    (-1, "Odd"),
    (-2, "Even"),
    (-3, "Odd"),
    (-4, "Even"),
    (1000000, "Even"),
    (2147483647, "Odd"),
    (-2147483648, "Even")
]

for index, (num, expected) in enumerate(test_cases, start=1):
    actual = solution(num)

    print(
        f"테스트 {index}"
        f" | 입력: {num}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 양의 짝수
- 양의 홀수
- 0
- 음의 짝수
- 음의 홀수
- Java int 최댓값
- Java int 최솟값