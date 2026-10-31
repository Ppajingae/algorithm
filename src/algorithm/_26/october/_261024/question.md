# 없는 숫자 더하기

**난이도:** Level 1  
**언어:** Java / Python

## 문제 설명

0부터 9까지의 숫자 중 일부가 들어 있는 정수 배열 `numbers`가 주어진다.

`numbers`에 포함되지 않은 숫자를 모두 찾아 더한 값을 반환하라.

## 제한사항

- `1 ≤ numbers.length ≤ 9`
- `0 ≤ numbers[i] ≤ 9`
- `numbers`의 모든 원소는 서로 다르다.

## 입출력 예시

| numbers | result |
|---|---|
| `[1,2,3,4,6,7,8,0]` | 14 |
| `[5,8,4,0,6,7,9]` | 6 |

### 예제 설명

- 예제 1: 없는 숫자는 `5, 9`이므로 결과는 `14`
- 예제 2: 없는 숫자는 `1, 2, 3`이므로 결과는 `6`

---

## Java 풀이 스켈레톤

```java
public class Algorithm261024 {

    public int solution(int[] numbers) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261024 algorithm = new Algorithm261024();

        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(algorithm.solution(numbers1)); // 14
        System.out.println(algorithm.solution(numbers2)); // 6
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(numbers):
    answer = 0

    return answer
```

### Python 테스트 코드

```python
numbers1 = [1, 2, 3, 4, 6, 7, 8, 0]
numbers2 = [5, 8, 4, 0, 6, 7, 9]

print(solution(numbers1))  # 14
print(solution(numbers2))  # 6
```