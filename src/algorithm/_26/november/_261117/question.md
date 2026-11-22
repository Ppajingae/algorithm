# 콜라츠 추측

**난이도:** Level 1  
**날짜:** 2026-11-17  
**Java 클래스명:** Algorithm261117

## 1. 문제 설명

1937년 콜라츠가 제기한 추측으로, 주어진 양의 정수에 다음 작업을 반복하면 1에 도달한다는 내용이야.

### 작업 규칙

1. 입력된 수가 짝수라면 2로 나눈다.
2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
3. 결과가 1이 될 때까지 같은 작업을 반복한다.

예를 들어 6이 주어지면 다음과 같이 변화해.

```text
6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
```

총 8번의 작업으로 1에 도달해.

### 반환 조건

- 1에 도달하면 작업 횟수를 반환한다.
- 처음부터 1이라면 `0`을 반환한다.
- 500번 작업을 수행해도 1에 도달하지 못하면 `-1`을 반환한다.

## 2. 제한 조건

- `num`은 1 이상 8,000,000 미만인 정수야.

## 3. 입출력 예제

| num | 결과 |
|---|---|
| 6 | 8 |
| 16 | 4 |
| 626331 | -1 |

---

## 4. Java 스켈레톤 + 테스트

```java
public class Algorithm261117 {

    public int solution(int num) {
        int answer = 0;

        // 여기에 구현

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261117 algorithm = new Algorithm261117();

        int[] testCases = {
            6,
            16,
            626331,
            1,
            2,
            3,
            4,
            5,
            8,
            10
        };

        int[] expected = {
            8,
            4,
            -1,
            0,
            1,
            7,
            2,
            5,
            3,
            6
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
def solution(num):
    answer = 0

    # 여기에 구현

    return answer


test_cases = [
    (6, 8),
    (16, 4),
    (626331, -1),
    (1, 0),
    (2, 1),
    (3, 7),
    (4, 2),
    (5, 5),
    (8, 3),
    (10, 6)
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

- 입력값이 처음부터 1인 경우
- 짝수로 시작하는 경우
- 홀수로 시작하는 경우
- 작업 횟수가 적은 경우
- 여러 번 반복해야 하는 경우
- 500번 이내에 1에 도달하지 못하는 경우