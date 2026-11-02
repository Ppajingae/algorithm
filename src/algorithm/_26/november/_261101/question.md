# 3진법 뒤집기

**난이도:** Level 1  
**날짜:** 2026-11-01  
**언어:** Java / Python

## 1. 문제 설명

자연수 `n`이 주어진다.

`n`을 3진법으로 변환한 뒤, 3진법으로 표현된 숫자의 순서를 앞뒤로 뒤집는다.

이후 뒤집힌 3진법 숫자를 다시 10진법으로 변환한 값을 반환하라.

---

## 2. 제한사항

- `1 ≤ n ≤ 100,000,000`
- `n`은 자연수이다.

---

## 3. 입출력 예시

| n | result |
|---|---|
| 45 | 7 |
| 125 | 229 |

### 예제 1

**입력**

```text
n = 45
```

**변환 과정**

| 단계 | 값 |
|---|---|
| 10진법 | 45 |
| 3진법 | 1200 |
| 앞뒤 반전 | 0021 |
| 10진법 변환 | 7 |

**출력**

```text
7
```

### 예제 2

**입력**

```text
n = 125
```

**변환 과정**

| 단계 | 값 |
|---|---|
| 10진법 | 125 |
| 3진법 | 11122 |
| 앞뒤 반전 | 22111 |
| 10진법 변환 | 229 |

**출력**

```text
229
```

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261101 {

    public int solution(int n) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261101 algorithm = new Algorithm261101();

        int[] numbers = {45, 125};
        int[] expected = {7, 229};

        for (int i = 0; i < numbers.length; i++) {
            int result = algorithm.solution(numbers[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 입력: " + numbers[i]
                + " | 결과: " + result
                + " | 예상: " + expected[i]
                + " | 통과: " + (result == expected[i])
            );
        }
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(n):
    answer = 0

    return answer


numbers = [45, 125]
expected = [7, 229]

for index, (number, result) in enumerate(
    zip(numbers, expected), start=1
):
    actual = solution(number)

    print(
        f"테스트 {index}"
        f" | 입력: {number}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )
```

---

## 6. 구현 목표

1. 자연수 `n`을 입력받는다.
2. `n`을 3진법으로 변환한다.
3. 변환된 3진법 숫자의 순서를 뒤집는다.
4. 뒤집힌 3진법 숫자를 10진법으로 변환한다.
5. 최종 결과를 정수로 반환한다.