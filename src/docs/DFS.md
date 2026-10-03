# 2. DFS

## Depth-First Search

```text
깊이 우선 탐색
```

한 방향으로 가능한 만큼 깊게 들어간 뒤 돌아와 다른 방향을 탐색한다.

---

## 기본 형태

```java
private int dfs(
        int current,
        boolean[] visited,
        ArrayList<ArrayList<Integer>> graph
) {

    visited[current] = true;

    int count = 1;

    for (int next : graph.get(current)) {

        if (visited[next]) {
            continue;
        }

        count += dfs(next, visited, graph);
    }

    return count;
}
```

---

## 핵심 상태

```text
현재 노드
visited
```

---

## 떠올릴 조건

```text
연결된 노드를 전부 방문하고 싶다.

연결된 영역의 크기를 알고 싶다.

경로를 끝까지 따라가야 한다.

트리/그래프 구조를 탐색해야 한다.
```

---

## 지금까지 연결된 문제

### 전력망을 둘로 나누기

```text
전선 하나 제거

↓

한쪽 노드에서 DFS

↓

연결되어 있는 송전탑 개수 계산

↓

다른 쪽 = n - count
```

---