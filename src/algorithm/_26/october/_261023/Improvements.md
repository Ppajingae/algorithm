# 코딩 테스트 복기 — 신고 결과 받기 (Python)

## 1. 풀이 결과

- **문제:** 프로그래머스 Lv.1 신고 결과 받기
- **언어:** Python
- **결과:** 해결 완료
- **시간 복잡도:** 평균 O(U + R)
- **공간 복잡도:** O(U + R)

> U = 사용자 수, R = 신고 내역 수

이번 복기는 알고리즘보다 **Python 문법과 코드 작성 방식**에 집중한다.

---

## 2. 잘한 점

### ① 딕셔너리 컴프리헨션 활용

```python
id_map = {id_list[i]: i for i in range(len(id_list))}
reporter_map = {id_: set() for id_ in id_list}
respondent_map = {id_: [] for id_ in id_list}
```

반복문 없이 딕셔너리를 간결하게 초기화했다.

특히 `set()`과 `list`를 목적에 맞게 구분해서 사용했다.

### ② `set`을 이용한 중복 검사

```python
if respondent in reporter_map[reporter]:
    continue

reporter_map[reporter].add(respondent)
```

- `set`은 중복된 원소를 저장하지 않는다.
- `in` 연산으로 원소의 존재 여부를 확인한다.
- 평균 조회 및 추가 시간은 O(1)이다.

Java의 `HashSet`과 유사한 역할을 한다.

### ③ 딕셔너리 순회

```python
for key, value in respondent_map.items():
```

`items()`를 통해 키와 값을 동시에 순회하는 문법을 활용했다.

---

## 3. 개선 포인트

### ① `split()` 중복 호출

**기존 코드**

```python
reporter = s.split(' ')[0]
respondent = s.split(' ')[1]
```

같은 문자열에 `split()`을 두 번 호출하고 있다.

**개선 코드**

```python
reporter, respondent = s.split()
```

Python의 **시퀀스 언패킹(Unpacking)** 을 활용하면 한 번의 분리로 두 변수에 값을 할당할 수 있다.

```python
a, b = [10, 20]

print(a)  # 10
print(b)  # 20
```

### ② `items()`와 `values()` 구분

**기존 코드**

```python
for key, v in respondent_map.items():
    if len(v) >= k:
        for i in v:
            answer[id_map.get(i)] += 1
```

`key`를 사용하지 않는데도 가져오고 있다.

**개선 코드**

```python
for reporters in respondent_map.values():
    if len(reporters) >= k:
        for reporter in reporters:
            answer[id_map[reporter]] += 1
```

| 메서드 | 반환하는 요소 |
|---|---|
| `keys()` | 키 |
| `values()` | 값 |
| `items()` | 키와 값의 쌍 |

필요한 데이터만 순회하는 습관을 들이자.

### ③ `get()`과 `[]`의 차이

**기존 코드**

```python
reporter_map.get(reporter)
id_map.get(i)
```

`get()`은 키가 존재하지 않으면 기본적으로 `None`을 반환한다.

```python
data = {'a': 10}

print(data.get('a'))     # 10
print(data.get('b'))     # None
print(data.get('b', 0))  # 0
```

반면 `[]`는 존재하지 않는 키에 접근하면 `KeyError`가 발생한다.

```python
data = {'a': 10}

print(data['a'])  # 10
print(data['b'])  # KeyError
```

이번 문제는 모든 ID를 미리 초기화했으므로 `[]`가 더 명확하다.

**정리**

- 키가 반드시 존재한다면 `dict[key]`
- 키가 없을 수도 있다면 `dict.get(key, default)`

### ④ 사용하지 않는 import 제거

**기존 코드**

```python
from collections import defaultdict
```

현재 구현에서는 `defaultdict`를 사용하지 않는다.

따라서 import를 제거해도 된다.

`defaultdict`는 존재하지 않는 키에 접근할 때 기본값을 자동 생성하는 딕셔너리다.

```python
from collections import defaultdict

data = defaultdict(list)

data['muzi'].append('frodo')
data['muzi'].append('neo')

print(data['muzi'])  # ['frodo', 'neo']
print(data['ryan'])  # []
```

이번처럼 모든 키를 미리 초기화한 경우에는 일반 `dict`로도 충분하다.

---

## 4. 추가로 익혀둘 Python 문법

### `enumerate()`를 이용한 딕셔너리 생성

기존 코드:

```python
id_map = {id_list[i]: i for i in range(len(id_list))}
```

개선 코드:

```python
id_map = {user_id: i for i, user_id in enumerate(id_list)}
```

`enumerate()`를 사용하면 인덱스 접근을 별도로 작성하지 않아도 된다.

```python
names = ['muzi', 'frodo', 'neo']

for index, name in enumerate(names):
    print(index, name)
```

출력:

```text
0 muzi
1 frodo
2 neo
```

---

## 5. 최종 정리

| 개념 | 기억할 내용 |
|---|---|
| 딕셔너리 컴프리헨션 | 딕셔너리를 간결하게 생성 |
| `set` | 중복 제거, 평균 O(1) 조회 |
| 언패킹 | 여러 값을 한 번에 변수에 할당 |
| `keys()` | 키만 순회 |
| `values()` | 값만 순회 |
| `items()` | 키와 값을 함께 순회 |
| `dict.get()` | 키가 없으면 기본값 반환 |
| `dict[key]` | 키가 없으면 `KeyError` |
| `defaultdict` | 없는 키에 대한 기본값 자동 생성 |
| `enumerate()` | 인덱스와 값을 함께 순회 |

## 6. 이번 복기의 핵심

**잘한 점**
- 딕셔너리 컴프리헨션을 활용했다.
- `set`을 이용해 중복 신고를 효율적으로 처리했다.
- Python의 `dict`, `list`, `set`을 적절하게 구분했다.

**개선 포인트**
1. `split()`을 반복 호출하지 말고 언패킹 활용하기.
2. 키가 필요 없다면 `items()` 대신 `values()` 사용하기.
3. 키 존재 여부에 따라 `get()`과 `[]` 구분하기.
4. 인덱스가 필요하면 `range(len())` 대신 `enumerate()` 고려하기.
5. 사용하지 않는 import 제거하기.

**최종 평가:** 알고리즘과 자료구조 선택은 적절했고, 개선할 부분은 대부분 Python 문법 활용과 가독성에 관한 내용이다.