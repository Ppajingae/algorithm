# 숫자 문자열과 영단어

**난이도:** Level 1  
**언어:** Java / Python  
**날짜:** 2026-10-26

## 문제 설명

숫자의 일부 또는 전체가 영단어로 바뀐 문자열 `s`가 주어진다.

문자열에 포함된 영단어를 해당 숫자로 해석하여 원래 숫자를 반환하라.

### 숫자와 영단어 대응표

| 숫자 | 영단어 |
|---|---|
| 0 | zero |
| 1 | one |
| 2 | two |
| 3 | three |
| 4 | four |
| 5 | five |
| 6 | six |
| 7 | seven |
| 8 | eight |
| 9 | nine |

## 제한사항

- `1 ≤ s.length ≤ 50`
- `s`는 `"zero"` 또는 `"0"`으로 시작하지 않는다.
- 반환값은 1 이상 2,000,000,000 이하의 정수이다.
- 입력은 항상 올바른 형태로 주어진다.

## 입출력 예시

| s | result |
|---|---|
| `"one4seveneight"` | 1478 |
| `"23four5six7"` | 234567 |
| `"2three45sixseven"` | 234567 |
| `"123"` | 123 |

### 예제 설명

**예제 1**

```text
입력: "one4seveneight"
출력: 1478
```

**예제 2**

```text
입력: "23four5six7"
출력: 234567
```

**예제 3**

```text
입력: "2three45sixseven"
출력: 234567
```

**예제 4**

```text
입력: "123"
출력: 123
```

---

## Java 풀이 스켈레톤

```java
public class Algorithm261026 {

    public int solution(String s) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261026 algorithm = new Algorithm261026();

        System.out.println(algorithm.solution("one4seveneight"));   // 1478
        System.out.println(algorithm.solution("23four5six7"));      // 234567
        System.out.println(algorithm.solution("2three45sixseven")); // 234567
        System.out.println(algorithm.solution("123"));              // 123
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(s):
    answer = 0

    return answer
```

### Python 테스트 코드

```python
print(solution("one4seveneight"))    # 1478
print(solution("23four5six7"))       # 234567
print(solution("2three45sixseven"))  # 234567
print(solution("123"))               # 123
```

## 구현 목표

- 숫자와 영단어가 혼합된 문자열을 처리한다.
- 모든 영단어를 올바른 숫자로 해석한다.
- 최종 결과를 문자열이 아닌 정수로 반환한다.