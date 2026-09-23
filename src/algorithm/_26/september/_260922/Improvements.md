# Day 3 - 바탕화면 정리 풀이 결과

## 결과

- 풀이 성공
- 모든 테스트 통과
- 핵심 유형: 완전 탐색 / 2차원 격자 / 최소·최대 좌표 추적
- 시간복잡도: `O(H × W)`
- 공간복잡도: `O(W)` (`toCharArray()` 사용 기준)

---

## 최종 풀이

```java
public class Algorithm260922 {

    public static int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i <= wallpaper.length - 1; i++) {
            char[] str = wallpaper[i].toCharArray();

            for (int j = 0; j <= str.length - 1; j++) {
                if (str[j] == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
```

---

# 풀이 방식

`wallpaper`의 모든 칸을 탐색하면서 파일(`#`)을 발견하면 해당 파일의 좌표를 이용해 다음 네 값을 갱신했다.

```text
minX = 가장 위에 있는 파일의 행
minY = 가장 왼쪽에 있는 파일의 열

maxX = 가장 아래에 있는 파일의 행
maxY = 가장 오른쪽에 있는 파일의 열
```

파일을 발견할 때마다:

```java
minX = Math.min(minX, i);
minY = Math.min(minY, j);

maxX = Math.max(maxX, i);
maxY = Math.max(maxY, j);
```

를 수행한다.

최종적으로 모든 파일을 포함하는 최소 직사각형은:

```text
왼쪽 위     = (minX, minY)
오른쪽 아래 = (maxX + 1, maxY + 1)
```

이 된다.

따라서:

```java
return new int[]{minX, minY, maxX + 1, maxY + 1};
```

을 반환한다.

---

# 좋았던 점

## 1. 모든 파일의 좌표를 저장하지 않음

예를 들어 다음처럼 모든 파일 위치를 저장할 수도 있다.

```java
List<int[]> files = new ArrayList<>();
```

이후 다시 순회하면서 최소/최대 좌표를 구하는 방식이다.

하지만 실제로 최종 결과를 만들기 위해 필요한 정보는:

```text
최소 X
최소 Y
최대 X
최대 Y
```

네 개뿐이다.

따라서 현재 풀이처럼 파일을 발견하는 즉시 최소/최대 값을 갱신하는 것이 더 단순하다.

```text
전체 좌표 저장
    ↓
최소/최대 탐색

보다

탐색하면서 최소/최대 갱신
```

방식으로 해결했다.

---

## 2. 최소값 초기화를 안전하게 처리

```java
int minX = Integer.MAX_VALUE;
int minY = Integer.MAX_VALUE;
```

최솟값을 구해야 하기 때문에 처음에는 가능한 가장 큰 값으로 설정했다.

그러면 첫 번째 파일을 발견했을 때:

```java
Math.min(Integer.MAX_VALUE, i)
```

가 항상 `i`가 된다.

최댓값도 반대로:

```java
int maxX = Integer.MIN_VALUE;
int maxY = Integer.MIN_VALUE;
```

로 시작했다.

따라서 첫 파일 발견 시:

```java
Math.max(Integer.MIN_VALUE, i)
```

가 항상 `i`가 된다.

최소/최대값을 추적할 때 사용할 수 있는 일반적인 초기화 패턴이다.

---

## 3. `Math.min`, `Math.max`를 이용해 간단하게 상태 갱신

다음처럼 조건문을 여러 개 작성하지 않고:

```java
if (i < minX) {
    minX = i;
}
```

다음과 같이 표현했다.

```java
minX = Math.min(minX, i);
```

최댓값 역시:

```java
maxX = Math.max(maxX, i);
```

로 처리했다.

최소/최대 추적이라는 코드의 의도가 명확하게 드러난다.

---

## 4. 격자칸과 격자점의 차이를 정확하게 처리

이 문제에서 중요한 부분 중 하나다.

파일이:

```text
(i, j)
```

에 존재한다면 해당 파일의 오른쪽 아래 격자점은:

```text
(i + 1, j + 1)
```

이다.

따라서 가장 아래/오른쪽에 있는 파일의 위치가:

```text
(maxX, maxY)
```

라면 드래그 끝점은:

```text
(maxX + 1, maxY + 1)
```

이 되어야 한다.

현재 풀이에서:

```java
return new int[]{minX, minY, maxX + 1, maxY + 1};
```

로 정확하게 처리했다.

---

# 개선할 점

## 1. 반복문의 조건을 더 일반적인 형태로 작성 가능

현재:

```java
for (int i = 0; i <= wallpaper.length - 1; i++)
```

논리적으로는 정확하다.

하지만 일반적으로 배열 전체를 순회할 때는:

```java
for (int i = 0; i < wallpaper.length; i++)
```

형태를 더 많이 사용한다.

두 조건은 동일하다.

```text
i <= length - 1
```

과

```text
i < length
```

은 같은 의미다.

두 번째 형태가 조금 더 단순하고 Java 코드에서 흔히 사용되는 패턴이다.

내부 반복문도 마찬가지로:

```java
for (int j = 0; j < str.length; j++)
```

로 표현할 수 있다.

---

## 2. `toCharArray()`는 필수는 아님

현재:

```java
char[] str = wallpaper[i].toCharArray();
```

로 문자열을 문자 배열로 변환한 뒤:

```java
str[j]
```

로 접근했다.

이 방법도 충분히 괜찮다.

다만 `String`은 특정 위치의 문자를 바로 가져오는:

```java
charAt()
```

을 제공한다.

따라서 다음과 같은 방법도 가능하다.

```java
if (wallpaper[i].charAt(j) == '#') {
    ...
}
```

이렇게 하면 매 행마다 `char[]`를 새로 생성하지 않아도 된다.

현재 입력 크기가 최대 `50 × 50`이기 때문에 성능 차이는 사실상 의미가 없다.

다만 불필요한 객체 생성을 피한다는 관점에서는 `charAt()`을 사용할 수 있다는 것을 기억해둘 만하다.

---

## 3. X/Y보다 row/column이 더 명확할 수 있음

현재:

```text
minX
minY
maxX
maxY
```

를 사용했다.

문제에서도 좌표를 사용하고 있기 때문에 틀린 표현은 아니다.

다만 배열에서는:

```text
i = 행(row)
j = 열(column)
```

이므로 다음처럼 표현할 수도 있다.

```text
minRow
minCol
maxRow
maxCol
```

그러면:

```java
minRow = Math.min(minRow, i);
minCol = Math.min(minCol, j);
```

처럼 배열의 의미와 변수 이름이 바로 연결된다.

특히 2차원 배열 문제에서는 `x/y`가 문제에 따라 가로/세로 의미가 뒤집히는 경우가 있기 때문에 `row/col`이 실수를 줄이는 데 도움이 될 수 있다.

---

# 시간복잡도

`wallpaper`의 모든 칸을 정확히 한 번씩 확인한다.

높이를 `H`, 너비를 `W`라고 하면:

```text
H × W
```

개의 칸을 탐색한다.

따라서 시간복잡도는:

```text
O(H × W)
```

이다.

문제의 최대 입력은:

```text
H ≤ 50
W ≤ 50
```

이므로 최대:

```text
50 × 50
= 2,500
```

번 정도의 칸 탐색만 필요하다.

따라서 완전 탐색으로 충분하다.

---

# 공간복잡도

현재 코드에서는:

```java
char[] str = wallpaper[i].toCharArray();
```

를 사용한다.

한 행의 문자열을 `char[]`로 변환하기 때문에 최대 너비 `W`만큼의 추가 공간이 필요하다.

따라서 추가 공간복잡도는:

```text
O(W)
```

이다.

만약 `charAt(j)`를 이용한다면 별도의 문자 배열이 필요하지 않으므로 추가 공간을:

```text
O(1)
```

로 만들 수 있다.

다만 이 문제에서는 `W ≤ 50`이므로 실질적인 차이는 매우 작다.

---

# 이번 문제에서 잘 잡은 핵심

이번 문제는 모든 `#`의 위치 자체가 중요한 문제가 아니다.

중요한 것은 파일들의:

```text
위쪽 경계
왼쪽 경계
아래쪽 경계
오른쪽 경계
```

뿐이다.

즉:

```text
데이터 전체가 필요한가?

        ↓ NO

최종 결과에 필요한 정보만 유지
```

라는 방식으로 접근할 수 있었다.

이는 다른 문제에서도 자주 사용할 수 있는 패턴이다.

---

# 이전 문제와 비교

## Day 2 - 달리기 경주

핵심 질문:

```text
매번 선수 위치를 다시 찾아야 하는가?
```

답:

```text
NO

HashMap에 현재 위치를 저장한다.
```

즉 **반복 탐색을 상태 저장으로 제거**했다.

---

## Day 3 - 바탕화면 정리

핵심 질문:

```text
모든 파일 위치를 저장해야 하는가?
```

답:

```text
NO

최소/최대 좌표만 유지한다.
```

즉 **불필요한 데이터 저장을 제거**했다.

둘 다 결국 비슷한 사고방식이다.

```text
문제에서 주어진 데이터를
전부 그대로 들고 갈 필요가 있는가?

↓

최종 결과를 만드는 데
실제로 필요한 정보는 무엇인가?
```

---

# 오늘 가져갈 포인트

> 전체 데이터를 저장하기 전에 최종 결과에 실제로 필요한 정보가 무엇인지 생각한다.

이번 문제에서는:

```text
모든 파일 좌표
```

가 아니라:

```text
minRow
minCol
maxRow
maxCol
```

만 있으면 충분했다.

또 최소/최대값을 계속 추적하는 문제에서는 다음 패턴을 기억해둘 수 있다.

```java
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

for (...) {
    min = Math.min(min, value);
    max = Math.max(max, value);
}
```

---

# 시간복잡도 개선 관점

이번 문제는 억지로 더 빠른 자료구조를 사용할 필요가 없다.

입력 최대 크기가:

```text
50 × 50 = 2,500
```

밖에 되지 않기 때문에 전체 탐색:

```text
O(H × W)
```

이 충분히 빠르다.

따라서 중요한 것은:

> 무조건 Map이나 특별한 알고리즘을 사용하는 것이 아니라 입력 크기를 보고 가장 단순하면서 충분히 빠른 방법을 선택하는 것.

Day 2에서는:

```text
최대 1,000,000 × 50,000
```

가능성이 있었기 때문에 탐색 최적화가 필요했다.

Day 3에서는:

```text
최대 2,500
```

이므로 완전 탐색이 가장 자연스럽다.

---

# 한 줄 정리

> 모든 파일의 위치를 저장하지 말고, 모든 파일을 포함하는 최소/최대 경계만 추적한다.

`O(H × W)` 완전 탐색 한 번으로 최소 드래그 영역을 구한 문제.