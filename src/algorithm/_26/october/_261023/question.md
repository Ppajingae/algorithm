# 최소직사각형

**난이도:** Level 1  
**언어:** Java / Python

## 문제 설명

다양한 크기의 명함을 모두 수납할 수 있는 가장 작은 지갑을 만들려고 한다.

각 명함에는 가로와 세로 길이가 있으며, 명함은 필요에 따라 90도 회전해서 수납할 수 있다.

모든 명함을 수납할 수 있는 지갑의 **최소 넓이**를 반환하라.

## 제한사항

- `1 ≤ sizes.length ≤ 10,000`
- `sizes[i] = [w, h]`
- `1 ≤ w, h ≤ 1,000`
- 모든 명함은 회전할 수 있다.

## 입출력 예시

| 예제 | 명함 크기 | 결과 |
|---|---|---|
| 1 | `[[60,50],[30,70],[60,30],[80,40]]` | 4000 |
| 2 | `[[10,7],[12,3],[8,15],[14,7],[5,15]]` | 120 |
| 3 | `[[14,4],[19,6],[6,16],[18,7],[7,11]]` | 133 |

### Java 입력 예시

```java
int[][] sizes1 = {
    {60, 50},
    {30, 70},
    {60, 30},
    {80, 40}
};

int[][] sizes2 = {
    {10, 7},
    {12, 3},
    {8, 15},
    {14, 7},
    {5, 15}
};

int[][] sizes3 = {
    {14, 4},
    {19, 6},
    {6, 16},
    {18, 7},
    {7, 11}
};
```

## Java 풀이 스켈레톤

```java
public class Algorithm261023 {

    public int solution(int[][] sizes) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261023 algorithm = new Algorithm261023();

        int[][] sizes1 = {
            {60, 50}, {30, 70}, {60, 30}, {80, 40}
        };

        int[][] sizes2 = {
            {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}
        };

        int[][] sizes3 = {
            {14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}
        };

        System.out.println(algorithm.solution(sizes1)); // 4000
        System.out.println(algorithm.solution(sizes2)); // 120
        System.out.println(algorithm.solution(sizes3)); // 133
    }
}
```

---

## Python 풀이 스켈레톤

```python
def solution(sizes):
    answer = 0

    return answer
```

### Python 테스트 코드

```python
sizes1 = [
    [60, 50], [30, 70], [60, 30], [80, 40]
]

sizes2 = [
    [10, 7], [12, 3], [8, 15], [14, 7], [5, 15]
]

sizes3 = [
    [14, 4], [19, 6], [6, 16], [18, 7], [7, 11]
]

print(solution(sizes1))  # 4000
print(solution(sizes2))  # 120
print(solution(sizes3))  # 133
```

## 구현 목표

- 모든 명함을 수납할 수 있어야 한다.
- 명함은 가로와 세로 방향을 바꿔 수납할 수 있다.
- 가능한 지갑 크기 중 가장 작은 넓이를 반환한다.