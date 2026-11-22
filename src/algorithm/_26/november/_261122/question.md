# 정수 내림차순으로 배치하기

**난이도:** Level 1  
**날짜:** 2026-11-22  
**Java 클래스명:** Algorithm261122

## 1. 문제 설명

정수 `n`이 주어져.

`n`의 각 자릿수를 큰 숫자부터 작은 숫자 순서로 정렬한 뒤, 새로운 정수로 반환하는 `solution` 함수를 작성해.

### 예시

- 입력: `118372`
- 출력: `873211`

## 2. 제한 조건

- `n`은 1 이상 8,000,000,000 이하의 자연수야.
- 결과는 정수로 반환해야 해.

## 3. 입출력 예제

| n | 결과 |
|---|---|
| 118372 | 873211 |

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261122 {

    public long solution(long n) {
        long answer = 0;

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261122 algorithm = new Algorithm261122();

        long[] testCases = {
            118372L,
            1L,
            9L,
            10L,
            100L,
            12345L,
            98765L,
            11111L,
            909090L,
            8000000000L,
            1234567890L,
            1000000001L
        };

        long[] expected = {
            873211L,
            1L,
            9L,
            10L,
            100L,
            54321L,
            98765L,
            11111L,
            999000L,
            8000000000L,
            9876543210L,
            1100000000L
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
    (118372, 873211),
    (1, 1),
    (9, 9),
    (10, 10),
    (100, 100),
    (12345, 54321),
    (98765, 98765),
    (11111, 11111),
    (909090, 999000),
    (8000000000, 8000000000),
    (1234567890, 9876543210),
    (1000000001, 1100000000)
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

- 한 자리 숫자
- 이미 내림차순으로 정렬된 숫자
- 오름차순으로 정렬된 숫자
- 같은 숫자가 여러 번 등장하는 경우
- 0이 포함된 숫자
- 입력 범위의 최댓값
- 정렬 결과가 Java `int` 범위를 초과하는 경우