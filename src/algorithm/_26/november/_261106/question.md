# 체육복

**난이도:** Level 1  
**날짜:** 2026-11-06  
**Java 클래스명:** Algorithm261106

## 1. 문제 설명

일부 학생이 체육복을 도난당했다.

여벌 체육복을 가진 학생은 자신의 바로 앞번호 또는 뒷번호 학생에게 체육복을 빌려줄 수 있다.

체육복이 없는 학생은 체육수업에 참여할 수 없다.

전체 학생 수 `n`, 체육복을 도난당한 학생 번호 배열 `lost`, 여벌 체육복을 가져온 학생 번호 배열 `reserve`가 주어질 때, **체육수업에 참여할 수 있는 학생의 최댓값**을 반환하라.

### 체육복 대여 규칙

1. 학생 번호는 1부터 n까지다.
2. 학생은 바로 앞번호 또는 뒷번호 학생에게만 체육복을 빌려줄 수 있다.
3. 여벌 체육복을 가진 학생만 다른 학생에게 빌려줄 수 있다.
4. 여벌 체육복을 가진 학생도 도난당할 수 있다.
5. 여벌 체육복을 가진 학생이 도난당했다면 본인 체육복만 남으므로 다른 학생에게 빌려줄 수 없다.

---

## 2. 제한사항

- `2 ≤ n ≤ 30`
- `1 ≤ lost.length ≤ n`
- `1 ≤ reserve.length ≤ n`
- `lost`와 `reserve` 내부에는 각각 중복된 번호가 없다.
- `lost`와 `reserve`에 동일한 학생 번호가 존재할 수 있다.

---

## 3. 입출력 예시

| n | lost | reserve | result |
|---|---|---|---|
| 5 | `[2, 4]` | `[1, 3, 5]` | 5 |
| 5 | `[2, 4]` | `[3]` | 4 |
| 3 | `[3]` | `[1]` | 2 |

### 예제 1

**입력**

```text
n = 5
lost = [2, 4]
reserve = [1, 3, 5]
```

**출력**

```text
5
```

1번 학생이 2번 학생에게 빌려주고, 3번 또는 5번 학생이 4번 학생에게 빌려주면 모든 학생이 수업에 참여할 수 있다.

### 예제 2

**입력**

```text
n = 5
lost = [2, 4]
reserve = [3]
```

**출력**

```text
4
```

3번 학생은 2번 또는 4번 학생 중 한 명에게만 빌려줄 수 있다.

### 예제 3

**입력**

```text
n = 3
lost = [3]
reserve = [1]
```

**출력**

```text
2
```

---

## 4. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261106 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261106 algorithm = new Algorithm261106();

        int[] studentCounts = {5, 5, 3};

        int[][] lostCases = {
            {2, 4},
            {2, 4},
            {3}
        };

        int[][] reserveCases = {
            {1, 3, 5},
            {3},
            {1}
        };

        int[] expected = {5, 4, 2};

        for (int i = 0; i < studentCounts.length; i++) {
            int result = algorithm.solution(
                studentCounts[i],
                lostCases[i],
                reserveCases[i]
            );

            System.out.println(
                "테스트 " + (i + 1)
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
def solution(n, lost, reserve):
    answer = 0

    return answer


test_cases = [
    (5, [2, 4], [1, 3, 5], 5),
    (5, [2, 4], [3], 4),
    (3, [3], [1], 2)
]

for index, (n, lost, reserve, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(n, lost, reserve)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 6. 구현 목표

1. 전체 학생 수와 체육복 보유 상태를 확인한다.
2. 체육복을 도난당한 학생을 처리한다.
3. 여벌 체육복을 가진 학생의 대여 조건을 적용한다.
4. 체육수업에 참여할 수 있는 학생 수를 최대화한다.
5. 최종 학생 수를 반환한다.