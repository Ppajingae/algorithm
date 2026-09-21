# Day 2 - 달리기 경주

## 결과

- 풀이 성공
- 핵심 유형: 구현 / HashMap / 배열 / 시간복잡도 개선
- 최종 시간복잡도: `O(P + C)`
    - `P`: players 길이
    - `C`: callings 길이

---

## 최초 풀이

처음에는 호출된 선수의 위치를 찾기 위해 매번 `players` 배열을 순회했다.

```java
public String[] solution(String[] players, String[] callings) {

    for (String calling : callings) {
        for (int j = 0; j < players.length; j++) {
            if (calling.equals(players[j])) {
                String calledUser = players[j];
                String firstUser = players[j - 1];

                players[j - 1] = calledUser;
                players[j] = firstUser;
            }
        }
    }

    return players;
}
```

논리 자체는 맞지만 시간 초과가 발생했다.

---

## 최초 풀이의 문제점

### 1. 선수의 위치를 매번 처음부터 탐색

각 `calling`마다 해당 선수가 현재 몇 번째에 있는지 찾기 위해 전체 `players`를 순회한다.

```text
callings 최대 길이 = 1,000,000
players 최대 길이  = 50,000
```

최악의 경우:

```text
1,000,000 × 50,000
= 50,000,000,000
```

약 500억 번의 비교가 발생할 수 있다.

시간복잡도:

`O(C × P)`

따라서 단순 반복 탐색으로는 해결하기 어렵다.

---

## 개선 아이디어

문제의 핵심은 다음 질문이었다.

> 호출된 선수의 현재 위치를 매번 검색하지 않고 바로 알아낼 수 없을까?

선수 이름은 중복되지 않기 때문에 다음과 같은 Map을 만들 수 있다.

```text
선수 이름 → 현재 배열 인덱스
```

예:

```text
mumu → 0
soe  → 1
poe  → 2
kai  → 3
mine → 4
```

이를 `HashMap<String, Integer>`로 관리하면 선수의 현재 위치를 평균 `O(1)`에 조회할 수 있다.

---

## 자료구조 구성

이번 문제에서는 배열과 Map이 서로 반대 방향의 조회 역할을 한다.

### Array

```text
index → 선수
```

```text
players[0] → mumu
players[1] → soe
players[2] → poe
players[3] → kai
players[4] → mine
```

### HashMap

```text
선수 → index
```

```text
mumu → 0
soe  → 1
poe  → 2
kai  → 3
mine → 4
```

따라서 양쪽 방향의 조회가 모두 빠르게 가능하다.

```text
선수 이름
   ↓
 HashMap
   ↓
현재 index
   ↓
 players
   ↓
앞 선수
```

---

## 최종 풀이

```java
public String[] solution(String[] players, String[] callings) {

    Map<String, Integer> map = new HashMap<>();

    for (int j = 0; j < players.length; j++) {
        map.put(players[j], j);
    }

    for (String calling : callings) {

        int callingUserRank = map.get(calling);

        String firstPlayer = players[callingUserRank - 1];

        map.replace(firstPlayer, callingUserRank);
        map.replace(calling, callingUserRank - 1);

        players[callingUserRank - 1] = calling;
        players[callingUserRank] = firstPlayer;
    }

    return players;
}
```

---

## 처리 과정

초기 상태:

```text
players

0      1     2     3     4
mumu   soe   poe   kai   mine
```

Map:

```text
mumu → 0
soe  → 1
poe  → 2
kai  → 3
mine → 4
```

`kai`가 호출됐다고 가정한다.

### 1. 현재 위치 조회

```java
int callingUserRank = map.get("kai");
```

결과:

```text
callingUserRank = 3
```

HashMap을 사용하기 때문에 평균 `O(1)`이다.

### 2. 바로 앞 선수 조회

```java
String firstPlayer = players[callingUserRank - 1];
```

즉:

```text
players[2] = poe
```

따라서:

```text
calling = kai
firstPlayer = poe
```

### 3. Map의 순위 갱신

`kai`가 `poe`를 추월했으므로:

```text
kai : 3 → 2
poe : 2 → 3
```

Map도 반드시 같이 변경해야 한다.

```java
map.replace(firstPlayer, callingUserRank);
map.replace(calling, callingUserRank - 1);
```

결과:

```text
mumu → 0
soe  → 1
kai  → 2
poe  → 3
mine → 4
```

### 4. 배열 순서 변경

```java
players[callingUserRank - 1] = calling;
players[callingUserRank] = firstPlayer;
```

결과:

```text
Before

[mumu, soe, poe, kai, mine]

After

[mumu, soe, kai, poe, mine]
```

배열과 Map이 동일한 순위 상태를 가지게 된다.

---

## 시간복잡도

### Map 초기화

모든 선수를 한 번 순회한다.

`O(P)`

### 추월 처리

각 `calling`마다 수행하는 작업:

```text
Map 조회      O(1)
배열 조회     O(1)
Map 수정      O(1)
배열 수정     O(1)
```

따라서 모든 `calling`을 처리하는 데:

`O(C)`

전체 시간복잡도:

```text
O(P + C)
```

기존:

```text
O(P × C)
```

개선 후:

```text
O(P + C)
```

---

## 좋았던 점

### 1. 시간 초과 원인을 이중 반복문으로 특정

처음 코드가 논리적으로는 맞더라도 제한사항을 확인하고 성능 문제가 있다는 것을 인지했다.

코딩 테스트에서는 정답 로직뿐만 아니라 입력 크기를 보고 시간복잡도를 판단하는 것이 중요하다.

### 2. 배열을 그대로 활용

`순위 → 선수`를 찾기 위한 별도의 Map을 만들 필요가 없었다.

이미 `players`가 순위대로 정렬된 배열이기 때문에:

```java
players[index]
```

만으로 해당 순위의 선수를 `O(1)`에 가져올 수 있다.

즉 필요한 자료구조만 추가했다.

### 3. Map과 배열의 상태를 함께 갱신

배열만 swap하면 Map의 순위 정보가 과거 상태로 남는다.

따라서 추월이 발생할 때:

```text
players 변경
+
Map 변경
```

을 동시에 수행했다.

두 자료구조가 동일한 상태를 유지하도록 한 것이 중요하다.

---

## 개선할 점

### 1. 변수 이름을 조금 더 명확하게 만들 수 있음

현재:

```java
int callingUserRank;
String firstPlayer;
```

실제로 `callingUserRank`는 1등, 2등 같은 순위가 아니라 배열의 `index`이다.

따라서 다음처럼 의미를 더 명확하게 표현할 수 있다.

```text
callingUserRank
→ currentIndex

firstPlayer
→ frontPlayer
```

변수 이름이 실제 의미와 일치하면 코드 이해가 쉬워지고 실수도 줄일 수 있다.

---

### 2. 자료구조를 선택하기 전에 조회 방향을 생각하기

처음에는 다음과 같은 고민이 있었다.

> Map에서 value를 가지고 key를 찾을 수 있을까?

일반적인 `HashMap`에서:

```text
key → value
```

조회는 평균 `O(1)`이다.

반대로:

```text
value → key
```

조회는 직접 지원하지 않기 때문에 전체 탐색이 필요하다.

따라서 역방향 조회가 필요하다고 Map을 순회하기보다, 처음부터 필요한 조회 방향에 맞춰 자료구조를 설계하는 것이 좋다.

이번 문제에서는:

```text
선수 → index : HashMap
index → 선수 : Array
```

조합으로 해결했다.

---

## 오늘의 핵심 실수

### 반복해서 필요한 값을 매번 탐색함

최초 풀이에서는:

```text
calling
↓
players 전체 탐색
↓
선수 위치 발견
```

을 매번 반복했다.

하지만 선수의 현재 위치는 별도의 자료구조에 저장해서 계속 관리할 수 있었다.

따라서:

```text
calling
↓
HashMap 조회
↓
선수 위치 즉시 획득
```

으로 변경할 수 있었다.

---

## 오늘 가져갈 포인트

> 반복적으로 검색하는 값이 있다면, 검색하지 않고 저장해둘 수 있는지 먼저 생각한다.

특히 다음과 같은 코드가 보이면:

```java
for (...) {
    for (...) {
        if (target.equals(...)) {
            ...
        }
    }
}
```

내부 반복문의 목적이 단순히 특정 값의 위치를 찾는 것이라면:

```text
HashMap
HashSet
배열 인덱스
```

등을 이용해서 탐색 자체를 없앨 수 있는지 확인한다.

---

## 자료구조 관점에서 기억할 것

### Array

```text
index → value
```

조회:

```java
players[index]
```

시간복잡도:

`O(1)`

### HashMap

```text
key → value
```

조회:

```java
map.get(key)
```

평균 시간복잡도:

`O(1)`

따라서 이번 문제처럼 양방향 조회가 필요한 경우:

```text
Array   : index → player
HashMap : player → index
```

처럼 서로 다른 자료구조의 장점을 조합할 수 있다.

---

## 다음 문제에서 신경 쓸 것

- 제한사항의 최대 입력 크기를 먼저 확인하기
- 이중 반복문이 나오면 최악의 연산 횟수를 계산해보기
- 반복 탐색하는 값을 Map으로 저장할 수 있는지 확인하기
- `key → value`, `index → value`처럼 필요한 조회 방향을 생각하기
- 여러 자료구조가 같은 상태를 표현한다면 변경 시 함께 갱신하기
- 변수 이름이 실제 의미인 `index`, `rank` 등과 일치하는지 확인하기

---

## 한 줄 정리

> 매번 찾지 말고, 위치를 기억해두자.

`O(P × C)`의 반복 탐색을 `HashMap + Array` 조합으로 `O(P + C)`까지 줄인 문제.