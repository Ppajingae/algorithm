# 신고 결과 받기

**난이도:** Level 1  
**언어:** Java / Python  
**정확성 테스트 제한시간:** 10초

## 문제 설명

게시판 이용자들이 다른 이용자를 신고할 수 있는 시스템을 구현한다.

신고된 횟수가 `k` 이상인 이용자는 게시판 이용이 정지되며, 해당 이용자를 신고했던 모든 이용자에게 정지 처리 결과 메일이 발송된다.

각 이용자가 받는 **처리 결과 메일의 개수**를 구하라.

## 신고 규칙

1. 한 이용자는 여러 이용자를 신고할 수 있다.
2. 동일한 이용자를 여러 번 신고하더라도 **1회만 인정**한다.
3. 서로 다른 이용자에게 신고받은 횟수가 `k` 이상이면 정지된다.
4. 정지된 이용자를 신고했던 모든 이용자는 메일을 1회씩 받는다.
5. 모든 신고를 취합한 뒤 한꺼번에 정지 처리한다.
6. 반환 배열은 `id_list`에 주어진 이용자 순서를 유지해야 한다.

## 매개변수

| 매개변수 | 자료형 | 설명 |
|---|---|---|
| `id_list` | `String[]` / `list[str]` | 전체 이용자 ID |
| `report` | `String[]` / `list[str]` | 신고 내역 |
| `k` | `int` | 이용 정지 기준 신고 횟수 |

`report`의 각 원소는 `"신고자ID 신고대상ID"` 형식이다.

## 제한사항

- `2 ≤ id_list.length ≤ 1,000`
- ID 길이: 1~10자
- ID는 알파벳 소문자로만 구성되며 중복되지 않는다.
- `1 ≤ report.length ≤ 200,000`
- 신고 내역 문자열 길이: 3~21자
- 신고자와 신고 대상은 공백 하나로 구분된다.
- 자기 자신을 신고하는 경우는 없다.
- `1 ≤ k ≤ 200`

## 입출력 예시

### 예제 1

```java
String[] id_list = {"muzi", "frodo", "apeach", "neo"};

String[] report = {
    "muzi frodo",
    "apeach frodo",
    "frodo neo",
    "muzi neo",
    "apeach muzi"
};

int k = 2;
int[] expected = {2, 1, 1, 0};
```

신고 결과:

| 이용자 | 신고받은 횟수 | 정지 여부 |
|---|---:|---|
| muzi | 1 | X |
| frodo | 2 | O |
| apeach | 0 | X |
| neo | 2 | O |

각 이용자가 받은 메일:

| 이용자 | 메일 수 |
|---|---:|
| muzi | 2 |
| frodo | 1 |
| apeach | 1 |
| neo | 0 |

**결과:** `[2, 1, 1, 0]`

### 예제 2

```java
String[] id_list = {"con", "ryan"};

String[] report = {
    "ryan con",
    "ryan con",
    "ryan con",
    "ryan con"
};

int k = 3;
int[] expected = {0, 0};
```

같은 이용자를 반복 신고해도 1회만 인정하므로 정지되는 이용자가 없다.

**결과:** `[0, 0]`

---

## Java 풀이 스켈레톤

```java
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        return answer;
    }
}
```

### Java 테스트 코드

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result1 = solution.solution(
            new String[]{"muzi", "frodo", "apeach", "neo"},
            new String[]{
                "muzi frodo",
                "apeach frodo",
                "frodo neo",
                "muzi neo",
                "apeach muzi"
            },
            2
        );

        int[] result2 = solution.solution(
            new String[]{"con", "ryan"},
            new String[]{
                "ryan con",
                "ryan con",
                "ryan con",
                "ryan con"
            },
            3
        );

        System.out.println(Arrays.toString(result1)); // [2, 1, 1, 0]
        System.out.println(Arrays.toString(result2)); // [0, 0]
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(id_list, report, k):
    answer = [0] * len(id_list)

    return answer
```

### Python 테스트 코드

```python
id_list1 = ["muzi", "frodo", "apeach", "neo"]

report1 = [
    "muzi frodo",
    "apeach frodo",
    "frodo neo",
    "muzi neo",
    "apeach muzi"
]

k1 = 2

id_list2 = ["con", "ryan"]

report2 = [
    "ryan con",
    "ryan con",
    "ryan con",
    "ryan con"
]

k2 = 3

print(solution(id_list1, report1, k1))  # [2, 1, 1, 0]
print(solution(id_list2, report2, k2))  # [0, 0]
```

## 구현 목표

- 중복 신고는 한 번만 인정한다.
- 신고 횟수가 `k` 이상인 이용자를 판별한다.
- 정지된 이용자를 신고한 사람의 메일 수를 계산한다.
- 결과를 `id_list` 순서대로 반환한다.

**반환값:** 각 이용자의 처리 결과 메일 수를 담은 정수 배열