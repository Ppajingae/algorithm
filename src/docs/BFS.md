# 3. BFS

## Breadth-First Search

```text
너비 우선 탐색
```

시작점에서 가까운 노드부터 순서대로 탐색한다.

```text
거리 0
↓
거리 1
↓
거리 2
↓
거리 3
```

---

## Queue 사용

```java
Queue<Integer> queue = new ArrayDeque<>();

queue.offer(1);
visited[1] = true;

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

거리가 필요하면:

```java
Queue<int[]> queue = new ArrayDeque<>();

queue.offer(new int[]{1, 0});
```

처럼:

```text
{노드, 거리}
```

를 넣을 수도 있다.

---

## 떠올릴 조건

특히:

```text
가중치 없는 그래프
+
최단거리
```

가 중요하다.

문제에서:

```text
최소 몇 번 이동?

최소 몇 단계?

최소 몇 개의 간선을 지나야 하는가?

시작점에서 가장 가까운/먼 노드는?
```

같은 표현이 나오면 BFS를 생각해본다.

---

## 지금까지 연결된 문제

### 가장 먼 노드

중요한 해석:

```text
❌ 가장 긴 경로

⭕ 각 노드까지의 최단거리 중 가장 큰 값
```

그리고 모든 간선의 이동 비용이:

```text
1
```

이므로 BFS 사용.

---
