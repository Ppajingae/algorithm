# 코딩테스트 자료구조 정리

> 알고리즘이 **문제를 해결하는 방법**이라면,  
> 자료구조는 **데이터를 어떤 형태로 저장하고 꺼낼 것인가**에 가깝다.
>
> 코테에서는 자료구조 이름을 외우는 것보다:
>
> ```text
> 내가 지금 어떤 데이터를 저장하려고 하는가?
> 어떤 연산을 반복하고 있는가?
> 그 연산을 빠르게 해주는 자료구조가 있는가?
> ```
>
> 를 생각하는 것이 중요하다.

---

# 1. Array

## 개념

같은 타입의 데이터를 연속적으로 저장한다.

Java:

```java
int[] numbers = {10, 20, 30, 40};

int[][] matrix = {
    {1, 2},
    {3, 4}
};
```

---

## 특징

인덱스로 바로 접근할 수 있다.

```java
numbers[2];
```

시간 복잡도:

```text
조회
O(1)
```

하지만 중간 삽입/삭제는 데이터를 이동해야 할 수 있다.

```text
중간 삽입/삭제
O(N)
```

---

## 언제 사용할까?

```text
데이터 개수가 정해져 있음

인덱스가 중요함

빠르게 특정 위치에 접근해야 함

노드 번호처럼 1 ~ N 범위가 명확함
```

---

## 지금까지 사용한 예

### BFS / DFS visited

```java
boolean[] visited = new boolean[n + 1];
```

노드 번호를 그대로 인덱스로 사용한다.

```text
visited[3] = true

→ 3번 노드 방문 완료
```

---

### 다익스트라 거리

```java
int[] dist = new int[n + 1];
```

```text
dist[3]

→ 시작점에서 3번 노드까지 거리
```

---

# 2. ArrayList

## 개념

크기가 동적으로 변할 수 있는 배열 형태의 자료구조.

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
```

---

## 특징

인덱스 접근:

```java
list.get(2);
```

평균:

```text
O(1)
```

맨 뒤 추가:

```java
list.add(value);
```

평균적으로:

```text
O(1)
```

중간 삽입/삭제:

```text
O(N)
```

---

## 주의

```java
new ArrayList<>(10)
```

은:

```text
크기(size) = 10
```

이라는 뜻이 아니다.

단순히:

```text
초기 capacity = 10
```

이라는 의미다.

따라서:

```java
ArrayList<ArrayList<Integer>> graph =
    new ArrayList<>(n + 1);
```

만 만들고:

```java
graph.get(1)
```

을 하면 안 된다.

실제 요소를 추가해야 한다.

```java
for (int i = 0; i <= n; i++) {
    graph.add(new ArrayList<>());
}
```

---

# 3. LinkedList

## 개념

각 데이터가 다음 데이터와 연결된 구조.

개념적으로:

```text
[data]
   ↓
[data]
   ↓
[data]
```

형태다.

---

## 특징

ArrayList와 달리 연속된 배열 형태가 아니다.

중간 노드를 이미 알고 있다면 삽입/삭제 자체는 빠를 수 있지만, 특정 인덱스를 찾는 데:

```text
O(N)
```

이 걸린다.

Java:

```java
LinkedList<Integer> list = new LinkedList<>();
```

---

## 코테에서는?

단순한 리스트가 필요하면 대부분:

```java
ArrayList
```

가 더 흔하다.

Queue가 필요할 때도:

```java
Queue<Integer> queue = new LinkedList<>();
```

가 가능하지만 보통은:

```java
Queue<Integer> queue = new ArrayDeque<>();
```

를 사용하는 편이 좋다.

---

# 4. Stack

## 개념

```text
LIFO

Last In First Out
```

마지막에 들어온 데이터가 가장 먼저 나온다.

예:

```text
push 1
push 2
push 3

현재

3  ← 가장 먼저 나감
2
1
```

---

## Java

예전에는:

```java
Stack<Integer> stack = new Stack<>();
```

을 사용할 수 있지만 현대 Java에서는 보통:

```java
Deque<Integer> stack = new ArrayDeque<>();
```

형태를 많이 사용한다.

```java
stack.push(10);
stack.push(20);

int value = stack.pop();
```

---

## 떠올릴 조건

```text
가장 최근에 들어온 것을 먼저 처리

되돌아가기

괄호 검사

이전 값과 비교

DFS를 반복문으로 구현
```

---

## DFS와 연결

재귀 DFS는 내부적으로 함수 호출 스택을 사용한다.

따라서:

```text
DFS
→ 재귀

또는

DFS
→ 명시적인 Stack
```

으로 구현할 수 있다.

---

# 5. Queue

## 개념

```text
FIFO

First In First Out
```

먼저 들어온 데이터가 먼저 나온다.

```text
입력

1 → 2 → 3

출력

1 → 2 → 3
```

---

## Java

```java
Queue<Integer> queue = new ArrayDeque<>();

queue.offer(1);
queue.offer(2);

int value = queue.poll();
```

---

## 주요 메소드

```java
queue.offer(value);
```

추가.

```java
queue.poll();
```

가장 앞의 값 제거 + 반환.

```java
queue.peek();
```

가장 앞의 값 확인.

---

## 언제 떠올릴까?

```text
먼저 들어온 작업부터 처리

순서대로 처리

가까운 것부터 탐색
```

---

## BFS와 연결

BFS의 핵심 자료구조다.

```java
Queue<Integer> queue = new ArrayDeque<>();

queue.offer(1);

while (!queue.isEmpty()) {

    int current = queue.poll();

    for (int next : graph.get(current)) {

        if (visited[next]) {
            continue;
        }

        visited[next] = true;
        queue.offer(next);
    }
}
```

Queue를 사용하기 때문에:

```text
거리 0

↓

거리 1

↓

거리 2
```

순서로 탐색할 수 있다.

---

# 6. Deque

## Double Ended Queue

양쪽에서 데이터를 넣고 뺄 수 있다.

```text
← [ 1 2 3 4 ] →
```

Java:

```java
Deque<Integer> deque = new ArrayDeque<>();
```

---

## 앞쪽

```java
deque.offerFirst(10);
deque.pollFirst();
```

## 뒤쪽

```java
deque.offerLast(10);
deque.pollLast();
```

---

## Stack처럼 사용

```java
deque.push(10);
deque.pop();
```

---

## Queue처럼 사용

```java
deque.offer(10);
deque.poll();
```

따라서 Java 코테에서는:

```text
Stack
Queue
Deque
```

중 상당 부분을 `ArrayDeque`로 처리할 수 있다.

---

# 7. HashMap

## 개념

```text
Key → Value
```

형태로 데이터를 저장한다.

```java
Map<String, Integer> map = new HashMap<>();

map.put("kim", 10);
map.put("lee", 20);
```

조회:

```java
map.get("kim");
```

결과:

```text
10
```

---

## 시간 복잡도

평균적으로:

```text
put
O(1)

get
O(1)

containsKey
O(1)

remove
O(1)
```

---

## 언제 떠올릴까?

가장 중요한 질문:

```text
내가 지금 반복문을 돌면서
계속 어떤 값을 찾고 있는가?
```

예:

```java
for (...) {
    for (...) {
        if (players[j].equals(name)) {
            ...
        }
    }
}
```

이런 구조가 있다면:

```text
name → 위치
```

를 Map에 저장할 수 없는지 생각한다.

---

## 지금까지 사용한 문제

### 달리기 경주

처음:

```text
호출된 선수 이름을
players에서 처음부터 검색
```

하면:

```text
O(N × M)
```

이 된다.

그래서:

```java
Map<String, Integer> rank = new HashMap<>();
```

를 사용했다.

```text
선수 이름
→ 현재 순위
```

를 저장한다.

그러면:

```java
rank.get(name);
```

으로 평균:

```text
O(1)
```

에 찾을 수 있다.

---

# 8. HashSet

## 개념

Map과 비슷하지만:

```text
Key → Value
```

가 아니라:

```text
Value만 저장
```

한다.

```java
Set<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
```

---

## 특징

중복을 허용하지 않는다.

```java
set.add(10);
set.add(10);
set.add(10);
```

해도:

```text
10
```

하나만 존재한다.

---

## 주요 연산

```java
set.add(value);
set.contains(value);
set.remove(value);
```

평균:

```text
O(1)
```

---

## 언제 떠올릴까?

```text
중복 제거

이 값이 존재하는지만 알고 싶음

이미 처리했는지 빠르게 확인

특정 값을 반복 검색
```

---

## Map과 차이

```text
값의 존재 여부만 필요
→ Set

어떤 값에 대응하는 정보도 필요
→ Map
```

예:

```text
"kim이 존재하는가?"
→ Set
```

```text
"kim의 순위가 몇 등인가?"
→ Map
```

---

# 9. PriorityQueue

## 우선순위 큐

일반 Queue:

```text
먼저 들어온 것
→ 먼저 나감
```

PriorityQueue:

```text
우선순위가 높은 것
→ 먼저 나감
```

Java 기본은 작은 값이 먼저 나온다.

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>();

pq.offer(30);
pq.offer(10);
pq.offer(20);
```

꺼내면:

```text
10
20
30
```

순서다.

---

## 시간 복잡도

```text
삽입
O(log N)

삭제
O(log N)

최솟값 확인
O(1)
```

---

## 언제 떠올릴까?

```text
현재 데이터 중
최솟값/최댓값을 계속 꺼내야 한다.

새 데이터가 계속 추가된다.

전체를 매번 정렬하기에는 비효율적이다.
```

---

## 다익스트라와 연결

다익스트라는:

```text
현재까지 거리가 가장 짧은 노드
```

를 계속 선택해야 한다.

그래서:

```java
PriorityQueue<Node> pq =
    new PriorityQueue<>();
```

를 사용한다.

---

# 10. Graph의 인접 리스트

그래프를 저장하는 대표적인 방법.

지금까지 가장 많이 사용한 형태:

```java
ArrayList<ArrayList<Integer>> graph =
    new ArrayList<>();

for (int i = 0; i <= n; i++) {
    graph.add(new ArrayList<>());
}
```

간선:

```java
int[][] edges = {
    {1, 2},
    {1, 3},
    {2, 4}
};
```

양방향이라면:

```java
for (int[] edge : edges) {

    int a = edge[0];
    int b = edge[1];

    graph.get(a).add(b);
    graph.get(b).add(a);
}
```

결과:

```text
1 → [2, 3]

2 → [1, 4]

3 → [1]

4 → [2]
```

---

## 왜 사용하는가?

현재 노드:

```text
2
```

와 연결된 노드만 알고 싶으면:

```java
graph.get(2);
```

만 보면 된다.

```text
[1, 4]
```

따라서 DFS/BFS에서:

```java
for (int next : graph.get(current)) {
    ...
}
```

형태로 사용한다.

---

# 11. 인접 행렬

그래프를 2차원 배열로 표현할 수도 있다.

```java
boolean[][] graph =
    new boolean[n + 1][n + 1];
```

간선:

```text
1 ↔ 3
```

이라면:

```java
graph[1][3] = true;
graph[3][1] = true;
```

---

## 공간 복잡도

```text
O(V²)
```

노드가:

```text
20,000
```

이면:

```text
20,000 × 20,000
```

이 필요하므로 너무 커질 수 있다.

---

## 인접 리스트

실제 존재하는 간선 중심:

```text
O(V + E)
```

그래서 간선이 상대적으로 적은 그래프에서는 인접 리스트가 효율적이다.

---

# 12. StringBuilder

엄밀히 말하면 일반적인 알고리즘 자료구조 분류와는 조금 다르지만 Java 코테에서 자주 사용한다.

문자열을 반복해서 붙여야 할 때:

```java
StringBuilder sb = new StringBuilder();

sb.append("A");
sb.append("B");
sb.append("C");

String result = sb.toString();
```

---

## 왜 사용하는가?

Java `String`은 immutable이다.

```java
String s = "";

s += "A";
s += "B";
s += "C";
```

를 반복하면 새로운 String 객체가 계속 생성될 수 있다.

따라서 문자열을 반복 조립할 때:

```java
StringBuilder
```

를 고려한다.

---

# 13. char[]

문자열의 각 문자를 자주 다룰 때:

```java
char[] chars = text.toCharArray();
```

를 사용할 수 있다.

```java
for (char c : chars) {
    ...
}
```

하지만 단순히 특정 문자만 확인한다면:

```java
text.charAt(i);
```

로 충분할 수도 있다.

즉:

```text
무조건 char[] 변환
```

할 필요는 없다.

---

# 14. 자료구조별 핵심 복잡도

| 자료구조 | 조회 | 검색 | 추가 | 삭제 |
|---|---:|---:|---:|---:|
| Array | O(1) | O(N) | 고정 크기 | O(N) |
| ArrayList | O(1) | O(N) | 끝 평균 O(1) | 중간 O(N) |
| LinkedList | O(N) | O(N) | 위치 확보 후 O(1) | 위치 확보 후 O(1) |
| HashMap | - | 평균 O(1) | 평균 O(1) | 평균 O(1) |
| HashSet | - | 평균 O(1) | 평균 O(1) | 평균 O(1) |
| Stack/Deque | top O(1) | - | O(1) | O(1) |
| Queue/Deque | front O(1) | - | O(1) | O(1) |
| PriorityQueue | top O(1) | O(N) | O(log N) | O(log N) |

※ HashMap / HashSet의 `O(1)`은 평균적인 경우.

---

# 15. 빠른 선택표

```text
인덱스로 바로 접근
→ Array / ArrayList


크기가 고정
→ Array


크기가 동적으로 증가
→ ArrayList


Key로 Value를 빠르게 찾기
→ HashMap


존재 여부를 빠르게 확인
→ HashSet


중복 제거
→ HashSet


마지막에 들어온 것부터 처리
→ Stack / Deque


먼저 들어온 것부터 처리
→ Queue / Deque


현재 최솟값/최댓값을 계속 꺼냄
→ PriorityQueue


BFS
→ Queue


DFS
→ 재귀 또는 Stack


Dijkstra
→ PriorityQueue


그래프의 연결 관계
→ 인접 리스트
```

---

# 16. 특히 자주 헷갈리는 것

## Array.length

```java
int[] arr = {1, 2, 3};

arr.length;
```

---

## String.length()

```java
String text = "abc";

text.length();
```

---

## ArrayList.size()

```java
List<Integer> list = new ArrayList<>();

list.size();
```

---

# 17. ArrayList의 remove 주의

```java
List<Integer> list =
    new ArrayList<>(List.of(1, 2, 3, 4));
```

이때:

```java
list.remove(2);
```

는:

```text
값 2를 삭제
```

가 아니라:

```text
index 2 삭제
```

이다.

즉 `3`이 삭제된다.

값 `2`를 삭제하려면:

```java
list.remove(Integer.valueOf(2));
```

를 사용한다.

---

# 18. Map에 List 넣기

그래프나 그룹핑에서 자주 나오는 형태:

```java
Map<Integer, List<Integer>> graph =
    new HashMap<>();
```

값을 추가할 때:

```java
graph
    .computeIfAbsent(
        key,
        k -> new ArrayList<>()
    )
    .add(value);
```

예:

```java
graph
    .computeIfAbsent(1, k -> new ArrayList<>())
    .add(3);
```

결과:

```text
1 → [3]
```

다시:

```java
graph
    .computeIfAbsent(1, k -> new ArrayList<>())
    .add(5);
```

결과:

```text
1 → [3, 5]
```

---

# 19. 자료구조를 고를 때 제일 중요한 질문

자료구조를 먼저 고르는 게 아니다.

```text
"HashMap 써야지."

"boolean[] 만들어야지."

"List에 다 넣어야지."
```

보다 먼저:

```text
내가 저장하려는 정보가 정확히 무엇인가?
```

를 정의한다.

예를 들어:

```text
선수의 현재 위치가 필요
```

라면:

```text
선수 이름 → 위치

HashMap
```

이 자연스럽다.

---

# 20. 저장하지 않는 것도 선택이다

코테를 풀면서 특히 중요했던 부분.

처음에는:

```text
상태가 필요하다
→ 자료구조 하나 추가
```

라고 생각하기 쉽다.

하지만 실제로는:

```text
그 상태를 정말 전부 저장해야 하나?
```

도 확인해야 한다.

---

## 덧칠

처음:

```text
각 벽의 상태를 저장?
```

최종:

```java
int paintedUntil;
```

하나.

---

## 바탕화면 정리

파일 좌표 전체를 저장하지 않고:

```java
int minRow;
int maxRow;
int minCol;
int maxCol;
```

만 저장.

---

## 단속카메라

처음:

```java
boolean[] checked;
```

를 생각했다.

최종:

```java
int camera;
```

하나만 필요했다.

---

# 21. 지금까지 문제와 자료구조 연결

| 문제 | 사용/고려한 자료구조 |
|---|---|
| 유연근무제 | Array |
| 달리기 경주 | Array + HashMap |
| 바탕화면 정리 | Array / String |
| 덧칠 | Array, 최종적으로 경계값 하나 |
| 합승 택시 요금 | 인접 리스트 + PriorityQueue + Array |
| 하노이의 탑 | List + 재귀 호출 Stack |
| 정수 삼각형 | 2차원 Array |
| 전력망을 둘로 나누기 | 인접 리스트 + visited[] |
| 쿼드압축 | 2차원 Array + 재귀 호출 Stack |
| 지폐 접기 | Array |
| 가장 먼 노드 | 인접 리스트 + Queue + visited[] |
| 단속카메라 | 2차원 Array, 최종 상태는 camera 하나 |

---

# 22. 알고리즘과 자료구조 연결

```text
DFS
→ Stack / 재귀
→ visited[]
→ 인접 리스트


BFS
→ Queue
→ visited[]
→ 인접 리스트


Dijkstra
→ PriorityQueue
→ dist[]
→ 인접 리스트


DP
→ Array / 2차원 Array


Greedy
→ 문제마다 다름
→ 정렬된 Array/List를 순회하는 경우가 많음


완전탐색
→ Array/List 등을 순회


문자열 반복 조립
→ StringBuilder


반복 검색 제거
→ HashMap / HashSet
```

---

# 23. 코테에서 자료구조를 선택하는 사고 순서

```text
1. 어떤 데이터를 저장해야 하지?

↓

2. 어떤 연산을 가장 많이 하지?

↓

3. 조회인가?
   검색인가?
   삽입인가?
   삭제인가?
   최솟값 조회인가?

↓

4. 해당 연산을 빠르게 해주는
   자료구조가 무엇이지?

↓

5. 그런데 정말 이 데이터를
   전부 저장해야 하나?
```

마지막 `5번`이 특히 중요하다.

---

# 한 장 요약

```text
Array
→ 고정 크기
→ index 접근 O(1)


ArrayList
→ 동적 배열
→ index 접근 O(1)


HashMap
→ Key → Value
→ 반복 검색 제거
→ 평균 O(1)


HashSet
→ 존재 여부 / 중복 제거
→ 평균 O(1)


Stack
→ LIFO
→ DFS / 되돌아가기


Queue
→ FIFO
→ BFS


Deque
→ 양쪽 삽입/삭제
→ Stack/Queue 용도로 활용 가능


PriorityQueue
→ 최솟값/최댓값을 계속 꺼내기
→ Dijkstra


인접 리스트
→ 그래프 연결 관계
→ DFS/BFS/Dijkstra


StringBuilder
→ 문자열 반복 조립


boolean[]
→ 번호 범위가 명확할 때 방문/상태 체크
```

# 핵심 질문

> **"무슨 자료구조를 쓰지?"보다 "내가 반복해서 하는 연산이 무엇이고, 그 데이터를 정말 전부 저장해야 하는가?"를 먼저 생각한다.**