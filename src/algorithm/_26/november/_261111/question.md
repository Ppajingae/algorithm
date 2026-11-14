# 비밀지도

**난이도:** Level 1  
**날짜:** 2026-11-11  
**Java 클래스명:** Algorithm261111

## 1. 문제 설명

네오는 숫자로 암호화된 두 장의 지도를 손에 넣었다.

각 지도는 한 변의 길이가 `n`인 정사각형이며, 모든 칸은 다음 두 종류로 구성된다.

- `#`: 벽
- ` `: 공백

두 지도를 겹쳐서 최종 비밀지도를 완성해야 한다.

### 지도 해독 규칙

1. 지도는 `n × n` 크기다.
2. 두 지도 중 하나라도 벽인 위치는 최종 지도에서도 벽이다.
3. 두 지도 모두 공백인 위치만 최종 지도에서도 공백이다.
4. 각 지도는 길이가 `n`인 정수 배열로 주어진다.
5. 각 정수는 해당 가로줄을 이진수로 표현한 값이다.
6. 이진수에서 `1`은 벽, `0`은 공백을 의미한다.

---

## 2. 제한 사항

| 항목 | 조건 |
|---|---|
| `n` | 1 이상 16 이하 |
| `arr1` | 길이가 `n`인 정수 배열 |
| `arr2` | 길이가 `n`인 정수 배열 |
| 배열 원소 | 0 이상 `2^n - 1` 이하 |
| 반환값 | 길이가 `n`인 문자열 배열 |

각 결과 문자열의 길이는 반드시 `n`이어야 한다.

---

## 3. 입출력 예제

### 예제 1

**입력**

```java
int n = 5;
int[] arr1 = {9, 20, 28, 18, 11};
int[] arr2 = {30, 1, 21, 17, 28};
```

**출력**

```java
String[] expected = {
    "#####",
    "# # #",
    "### #",
    "#  ##",
    "#####"
};
```

### 예제 2

**입력**

```java
int n = 6;
int[] arr1 = {46, 33, 33, 22, 31, 50};
int[] arr2 = {27, 56, 19, 14, 14, 10};
```

**출력**

```java
String[] expected = {
    "######",
    "###  #",
    "##  ##",
    " #### ",
    " #####",
    "### # "
};
```

**주의:** 공백도 정답의 일부이므로 문자열 앞, 뒤, 중간의 공백을 그대로 유지해야 한다.

---

## 4. Java 풀이 스켈레톤 + 테스트

```java
import java.util.Arrays;

public class Algorithm261111 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261111 algorithm = new Algorithm261111();

        int[] sizes = {5, 6};

        int[][] arr1Cases = {
            {9, 20, 28, 18, 11},
            {46, 33, 33, 22, 31, 50}
        };

        int[][] arr2Cases = {
            {30, 1, 21, 17, 28},
            {27, 56, 19, 14, 14, 10}
        };

        String[][] expected = {
            {
                "#####",
                "# # #",
                "### #",
                "#  ##",
                "#####"
            },
            {
                "######",
                "###  #",
                "##  ##",
                " #### ",
                " #####",
                "### # "
            }
        };

        for (int i = 0; i < sizes.length; i++) {
            String[] actual = algorithm.solution(
                sizes[i],
                arr1Cases[i],
                arr2Cases[i]
            );

            System.out.println("테스트 " + (i + 1));
            System.out.println("결과: " + Arrays.toString(actual));
            System.out.println("예상: " + Arrays.toString(expected[i]));
            System.out.println(
                "통과: " + Arrays.equals(actual, expected[i])
            );
            System.out.println();
        }
    }
}
```

---

## 5. Python 풀이 스켈레톤 + 테스트

```python
def solution(n, arr1, arr2):
    answer = []

    return answer


test_cases = [
    (
        5,
        [9, 20, 28, 18, 11],
        [30, 1, 21, 17, 28],
        [
            "#####",
            "# # #",
            "### #",
            "#  ##",
            "#####"
        ]
    ),
    (
        6,
        [46, 33, 33, 22, 31, 50],
        [27, 56, 19, 14, 14, 10],
        [
            "######",
            "###  #",
            "##  ##",
            " #### ",
            " #####",
            "### # "
        ]
    )
]

for index, (n, arr1, arr2, expected) in enumerate(
    test_cases, start=1
):
    actual = solution(n, arr1, arr2)

    print(f"테스트 {index}")
    print(f"결과: {actual}")
    print(f"예상: {expected}")
    print(f"통과: {actual == expected}")
    print()
```

---

## 6. 구현 목표

1. 두 개의 정수 배열을 입력받는다.
2. 암호화된 각 가로줄을 해독한다.
3. 두 지도를 규칙에 맞게 겹친다.
4. 벽과 공백으로 구성된 문자열을 만든다.
5. 길이가 `n`인 문자열 배열을 반환한다.