# 정수 제곱근 판별

**난이도:** Level 1  
**날짜:** 2026-11-21  
**Java 클래스명:** Algorithm261121

## 1. 문제 설명

양의 정수 `n`이 주어져.

`n`이 어떤 양의 정수 `x`의 제곱인지 판별하는 `solution` 함수를 작성해.

- `n`이 양의 정수 `x`의 제곱이라면 `(x + 1)`의 제곱을 반환해.
- 양의 정수의 제곱이 아니라면 `-1`을 반환해.

## 2. 제한 조건

- `n`은 1 이상 50,000,000,000,000 이하의 양의 정수야.
- 반환값은 정수야.

## 3. 입출력 예제

| n | 결과 |
|---|---|
| 121 | 144 |
| 3 | -1 |

### 예제 설명

**예제 1**

121은 11의 제곱이므로 `(11 + 1)`의 제곱인 144를 반환해.

**예제 2**

3은 양의 정수의 제곱이 아니므로 -1을 반환해.

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261121 {

    public long solution(long n) {
        long answer = 0;

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261121 algorithm = new Algorithm261121();

        long[] testCases = {
            121L,
            3L,
            1L,
            4L,
            9L,
            16L,
            25L,
            100L,
            101L,
            1000000L,
            1000000000000L,
            49999999999999L,
            50000000000000L
        };

        long[] expected = {
            144L,
            -1L,
            4L,
            9L,
            16L,
            25L,
            36L,
            121L,
            -1L,
            1002001L,
            1000002000001L,
            -1L,
            -1L
        };

        for (int i = 0; i < testCases.length; i++) {
            long actual = algorithm.solution(testCases[i]);

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

---

## 5. Python 스켈레톤 + 테스트

```python
def solution(n):
    answer = 0

    # 여기에 구현

    return answer


test_cases = [
    (121, 144),
    (3, -1),
    (1, 4),
    (4, 9),
    (9, 16),
    (16, 25),
    (25, 36),
    (100, 121),
    (101, -1),
    (1000000, 1002001),
    (1000000000000, 1000002000001),
    (49999999999999, -1),
    (50000000000000, -1)
]

for index, (n, expected) in enumerate(test_cases, start=1):
    actual = solution(n)

    print(
        f"테스트 {index}"
        f" | 입력: {n}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 확인할 테스트 유형

- 최솟값인 1
- 작은 완전제곱수
- 완전제곱수가 아닌 수
- 큰 완전제곱수
- 입력 범위의 최댓값 근처
- 입력 범위의 최댓값