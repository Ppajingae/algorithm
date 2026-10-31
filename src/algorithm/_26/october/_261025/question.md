# 부족한 금액 계산하기

**난이도:** Level 1  
**언어:** Java / Python

## 문제 설명

놀이기구의 기본 이용료는 `price`원이다.

놀이기구를 이용할 때마다 요금이 증가하며, N번째 이용 시 기본 이용료의 N배를 지불해야 한다.

`count`번 이용하는 데 필요한 총금액을 계산하고, 현재 보유한 `money`와 비교하여 **부족한 금액**을 반환하라.

단, 보유한 금액이 충분하다면 `0`을 반환한다.

## 제한사항

- `1 ≤ price ≤ 2,500`
- `1 ≤ money ≤ 1,000,000,000`
- `1 ≤ count ≤ 2,500`

## 입출력 예시

| price | money | count | result |
|---|---|---|---|
| 3 | 20 | 4 | 10 |

### 예제 설명

```java
int price = 3;
int money = 20;
int count = 4;
long expected = 10L;
```

4번 이용할 때의 요금은 각각 3원, 6원, 9원, 12원이다.

총 30원이 필요하지만 보유한 금액은 20원이므로 10원을 반환한다.

---

## Java 풀이 스켈레톤

```java
public class Algorithm261025 {

    public long solution(int price, int money, int count) {
        long answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261025 algorithm = new Algorithm261025();

        System.out.println(algorithm.solution(3, 20, 4)); // 10
        System.out.println(algorithm.solution(3, 30, 4)); // 0
        System.out.println(algorithm.solution(3, 40, 4)); // 0
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(price, money, count):
    answer = 0

    return answer
```

### Python 테스트 코드

```python
print(solution(3, 20, 4))  # 10
print(solution(3, 30, 4))  # 0
print(solution(3, 40, 4))  # 0
```

## 구현 목표

- N번째 이용 시 요금은 기본 이용료의 N배이다.
- `count`번 이용하는 데 필요한 총금액을 계산한다.
- 보유 금액이 부족하면 부족한 금액을 반환한다.
- 보유 금액이 충분하면 0을 반환한다.