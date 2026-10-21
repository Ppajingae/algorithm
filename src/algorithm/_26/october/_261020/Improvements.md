# 코딩 테스트 복기 — 성격 유형 검사하기 (Python)

## 1. 문제 풀이 결과

- **Java:** 해결 완료
- **Python:** 해결 완료
- **시간 복잡도:** O(N)
- **공간 복잡도:** O(1)

Java와 Python에서 동일한 알고리즘을 사용했으므로, 이번 복기는 **Python 문법과 코딩 스타일**을 중심으로 정리한다.

---

## 2. `sort()`와 `sorted()` 차이

### 실수한 부분

```python
char_arr = ['T', 'R']
result = char_arr.sort()

print(result)  # None
```

`sort()`가 정렬된 리스트를 반환한다고 생각했지만, 실제로는 `None`을 반환한다.

### `sort()`

- 리스트 자체를 정렬한다.
- 원본 리스트가 변경된다.
- 반환값은 `None`이다.
- 리스트에서만 사용할 수 있다.

```python
arr = [3, 1, 2]

arr.sort()

print(arr)  # [1, 2, 3]
```

### `sorted()`

- 정렬된 새로운 리스트를 반환한다.
- 원본 데이터를 변경하지 않는다.
- 리스트뿐 아니라 문자열, 튜플 등에도 사용할 수 있다.

```python
arr = [3, 1, 2]

result = sorted(arr)

print(arr)     # [3, 1, 2]
print(result)  # [1, 2, 3]
```

**핵심:** `sort()`는 원본 변경, `sorted()`는 새로운 리스트 반환.

---

## 3. `map`, `type` 변수명 주의

Python에는 `map()`과 `type()`이라는 내장 함수가 존재한다.

```python
map = {'R': 0, 'T': 0}
type = 'RT'
```

이렇게 작성하면 해당 범위에서 기존 내장 함수 이름을 가리게 된다.

### 개선

```python
scores = {'R': 0, 'T': 0}
personality = 'RT'
```

Java의 `Map`과 달리 Python에서 키-값 자료구조는 `dict`라고 부른다.

---

## 4. `enumerate()`와 `zip()`

### `enumerate()`

반복하면서 인덱스와 값을 함께 가져온다.

```python
choices = [5, 3, 2]

for index, choice in enumerate(choices):
    print(index, choice)
```

출력:

```text
0 5
1 3
2 2
```

### `zip()`

두 개 이상의 iterable을 같은 위치끼리 묶어서 순회한다.

```python
survey = ['AN', 'CF', 'MJ']
choices = [5, 3, 2]

for personality, choice in zip(survey, choices):
    print(personality, choice)
```

출력:

```text
AN 5
CF 3
MJ 2
```

### 차이점

- `enumerate()` : 인덱스가 필요할 때
- `zip()` : 여러 배열의 같은 위치에 있는 값을 함께 사용할 때

**주의:** `zip()`은 기본적으로 가장 짧은 iterable의 길이에 맞춰 종료된다.

---