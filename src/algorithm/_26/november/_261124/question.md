# 자릿수 더하기

**난이도:** Level 1
**날짜:** 2026-11-24
**Java 클래스명:** Algorithm261124

## 1. 문제 설명

자연수 N이 주어진다.

N의 각 자릿수의 합을 구하여 반환하는 solution 함수를 완성한다.

예를 들어 N이 123이라면 1 + 2 + 3 = 6이므로 6을 반환한다.

## 2. 제한 조건

- N은 100,000,000 이하의 자연수이다.

## 3. 입출력 예제

| N | 반환값 |
|---|---|
| 123 | 6 |
| 987 | 24 |

### 입출력 예제 설명

**예제 1**

1 + 2 + 3 = 6이므로 6을 반환한다.

**예제 2**

9 + 8 + 7 = 24이므로 24를 반환한다.

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261124 {

    public int solution(int n) {
        int answer = 0;

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261124 algorithm = new Algorithm261124();

        int[] testCases = {
            123,
            987,
            1,
            9,
            10,
            100,
            12345,
            11111,
            909090,
            1002003,
            99999999,
            100000000
        };

        int[] expected = {
            6,
            24,
            1,
            9,
            1,
            1,
            15,
            5,
            27,
            6,
            72,
            1
        };

        for (int i = 0; i < testCases.length; i++) {
            int actual = algorithm.solution(testCases[i]);

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
    (123, 6),
    (987, 24),
    (1, 1),
    (9, 9),
    (10, 1),
    (100, 1),
    (12345, 15),
    (11111, 5),
    (909090, 27),
    (1002003, 6),
    (99999999, 72),
    (100000000, 1)
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

- 한 자리 자연수
- 여러 자릿수로 구성된 자연수
- 동일한 숫자가 반복되는 자연수
- 중간에 0이 포함된 자연수
- 끝자리가 0인 자연수
- 입력 범위의 최솟값
- 입력 범위의 최댓값
- 자릿수의 합이 최대가 되는 자연수