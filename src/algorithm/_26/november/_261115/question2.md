# 하샤드 수

**난이도:** Level 1  
**날짜:** 2026-11-15  
**Java 클래스명:** Algorithm261115

## 1. 문제 설명

양의 정수 `x`가 하샤드 수이려면 `x`의 각 자릿수의 합으로 `x`가 나누어떨어져야 해.

예를 들어 18의 자릿수 합은 `1 + 8 = 9`이고, 18은 9로 나누어떨어지므로 하샤드 수야.

자연수 `x`를 입력받아 하샤드 수인지 검사하는 `solution` 함수를 완성해.

## 2. 제한 조건

- `x`는 1 이상 10,000 이하의 정수야.
- 반환값은 `true` 또는 `false`야.

## 3. 입출력 예제

| x | 결과 |
|---|---|
| 10 | `true` |
| 12 | `true` |
| 11 | `false` |
| 13 | `false` |

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261115 {

    public boolean solution(int x) {
        boolean answer = false;

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261115 algorithm = new Algorithm261115();

        int[] testCases = {
            10, 12, 11, 13,
            1, 18, 19, 21,
            100, 101, 9999, 10000
        };

        boolean[] expected = {
            true, true, false, false,
            true, true, false, true,
            true, false, true, true
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 입력: " + testCases[i]
                + " | 결과: " + actual
                + " | 예상: " + expected[i]
                + " | 통과: " + (actual == expected[i])
            );
        }
    }
}
```

## 5. Python 스켈레톤 + 테스트

```python
def solution(x):
    answer = False

    # 여기에 구현

    return answer


test_cases = [
    (10, True),
    (12, True),
    (11, False),
    (13, False),
    (1, True),
    (18, True),
    (19, False),
    (21, True),
    (100, True),
    (101, False),
    (9999, True),
    (10000, True)
]

for index, (x, expected) in enumerate(test_cases, start=1):
    actual = solution(x)

    print(
        f"테스트 {index}"
        f" | 입력: {x}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

## 6. 확인할 테스트 유형

- 한 자리 자연수
- 두 자리 자연수
- 세 자리 자연수
- 네 자리 자연수
- 최솟값과 최댓값
- 하샤드 수인 경우와 아닌 경우