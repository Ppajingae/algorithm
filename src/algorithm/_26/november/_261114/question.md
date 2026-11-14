# 직사각형 별찍기

**난이도:** Level 1  
**날짜:** 2026-11-14  
**Java 클래스명:** Algorithm261114

## 1. 문제 설명

두 정수 `n`, `m`이 주어진다.

별(`*`) 문자를 이용해 다음 크기의 직사각형을 출력하라.

- 가로 길이: `n`
- 세로 길이: `m`

## 2. 제한 조건

- `n`은 1 이상 1000 이하의 자연수
- `m`은 1 이상 1000 이하의 자연수

## 3. 입출력 예제

**입력**

```text
5 3
```

**출력**

```text
*****
*****
*****
```

## 4. Java 스켈레톤

```java
import java.util.Scanner;

public class Algorithm261114 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 여기에 구현

        scanner.close();
    }
}
```

## 5. Python 스켈레톤

```python
n, m = map(int, input().split())

# 여기에 구현
```

## 6. 추가 테스트 케이스

### 테스트 1

입력:
```text
1 1
```

출력:
```text
*
```

### 테스트 2

입력:
```text
3 2
```

출력:
```text
***
***
```

### 테스트 3

입력:
```text
2 4
```

출력:
```text
**
**
**
**
```

### 테스트 4

입력:
```text
5 1
```

출력:
```text
*****
```