# 다트 게임

**난이도:** Level 1  
**날짜:** 2026-11-10  
**Java 클래스명:** Algorithm261110

## 1. 문제 설명

다트 게임은 총 3번의 기회로 구성되며, 각 기회에서 획득한 점수를 합산해 최종 점수를 계산한다.

각 기회는 다음 형식으로 구성된다.

```text
점수 + 보너스 + 선택적 옵션
```

예를 들어 다음과 같은 문자열이 주어진다.

```text
1S2D*3T
```

주어진 문자열을 해석해 **3번의 기회에서 획득한 최종 점수의 합계**를 반환하라.

---

## 2. 점수 계산 규칙

### 기본 점수

- 각 기회에서 얻을 수 있는 점수는 0부터 10까지다.
- 게임은 반드시 3번의 기회로 구성된다.

### 보너스

| 보너스 | 의미 | 계산 |
|---|---|---|
| `S` | Single | 점수의 1제곱 |
| `D` | Double | 점수의 2제곱 |
| `T` | Triple | 점수의 3제곱 |

### 옵션

| 옵션 | 효과 |
|---|---|
| `*` | 현재 점수와 직전 점수를 각각 2배 |
| `#` | 현재 점수를 음수로 변경 |
| 없음 | 추가 효과 없음 |

### 추가 규칙

1. 첫 번째 기회에서 `*`가 나오면 현재 점수만 2배가 된다.
2. `*` 효과는 중첩될 수 있으며, 중첩된 점수는 4배가 될 수 있다.
3. `*`와 `#` 효과도 중첩될 수 있다.
4. 각 기회에는 `S`, `D`, `T` 중 하나가 반드시 존재한다.
5. 옵션은 `*`, `#` 중 하나만 존재하거나 생략될 수 있다.

---

## 3. 입력 및 출력

### 입력

- 매개변수: `dartResult`
- 자료형: 문자열
- 형식: `점수|보너스|[옵션]`이 3번 반복된 문자열
- 점수 범위: 0~10

### 출력

- 자료형: 정수
- 내용: 세 번의 다트 점수를 모두 합산한 결과

---

## 4. 입출력 예시

| 번호 | dartResult | 결과 |
|---|---|---|
| 1 | `"1S2D*3T"` | 37 |
| 2 | `"1D2S#10S"` | 9 |
| 3 | `"1D2S0T"` | 3 |
| 4 | `"1S*2T*3S"` | 23 |
| 5 | `"1D#2S*3S"` | 5 |
| 6 | `"1T2D3D#"` | -4 |
| 7 | `"1D2S3T*"` | 59 |

### 예제 1

**입력**

```text
1S2D*3T
```

**출력**

```text
37
```

### 예제 2

**입력**

```text
1D2S#10S
```

**출력**

```text
9
```

### 예제 3

**입력**

```text
1S*2T*3S
```

**출력**

```text
23
```

---

## 5. Java 풀이 스켈레톤 + 테스트 코드

```java
public class Algorithm261110 {

    public int solution(String dartResult) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261110 algorithm = new Algorithm261110();

        String[] testCases = {
            "1S2D*3T",
            "1D2S#10S",
            "1D2S0T",
            "1S*2T*3S",
            "1D#2S*3S",
            "1T2D3D#",
            "1D2S3T*"
        };

        int[] expected = {
            37, 9, 3, 23, 5, -4, 59
        };

        for (int i = 0; i < testCases.length; i++) {
            int actual = algorithm.solution(testCases[i]);

            System.out.println(
                "테스트 " + (i + 1)
                + " | 결과: " + actual
                + " | 예상: " + expected[i]
                + " | 통과: " + (actual == expected[i])
            );
        }
    }
}
```

---

## 6. Python 풀이 스켈레톤 + 테스트 코드

```python
def solution(dartResult):
    answer = 0

    return answer


test_cases = [
    ("1S2D*3T", 37),
    ("1D2S#10S", 9),
    ("1D2S0T", 3),
    ("1S*2T*3S", 23),
    ("1D#2S*3S", 5),
    ("1T2D3D#", -4),
    ("1D2S3T*", 59)
]

for index, (dart_result, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(dart_result)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )
```

---

## 7. 구현 목표

1. 다트 게임 결과 문자열을 입력받는다.
2. 총 3번의 다트 점수를 구분한다.
3. 각 점수에 보너스 규칙을 적용한다.
4. 옵션이 존재하면 해당 규칙을 적용한다.
5. 모든 점수를 합산한다.
6. 최종 점수를 정수로 반환한다.