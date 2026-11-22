def solution(arr):
    if len(arr) == 1:
        return [-1]

    min_val = min(arr)
    min_idx = arr.index(min_val)
    arr.pop(min_idx)

    return arr


test_cases = [
    ([4, 3, 2, 1], [4, 3, 2]),
    ([10], [-1]),
    ([1, 2, 3, 4], [2, 3, 4]),
    ([5, 1, 3, 2, 4], [5, 3, 2, 4]),
    ([-3, -1, -2], [-1, -2]),
    ([0, -5, 10], [0, 10]),
    ([7, 3], [7]),
    ([3, 7], [7]),
    ([-1], [-1]),
    ([0], [-1])
]

for index, (arr, expected) in enumerate(test_cases, start=1):
    actual = solution(arr.copy())

    print(
        f"테스트 {index}"
        f" | 입력: {arr}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )

