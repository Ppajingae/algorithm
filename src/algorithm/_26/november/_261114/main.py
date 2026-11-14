# n, m = map(int, input().split())
#
# for i in range(0,m):
#     for j in range(0,n):
#         print("*", end="")
#     print()

def solution(x, n):
    answer = [0] * n

    for i in range(0, n):
        answer[i] = (i + 1) * x

    return answer

def solution2(arr1, arr2):
    answer = [[0] * len(arr1[0]) for _ in range(0 , len(arr1))]

    # 여기에 구현
    for index1, i in enumerate(arr1):
        for index3, j in enumerate(i):
            answer[index1][index3] = j + arr2[index1][index3]

    return answer

test_cases = [
    (2, 5, [2, 4, 6, 8, 10]),
    (4, 3, [4, 8, 12]),
    (-4, 2, [-4, -8]),
    (0, 5, [0, 0, 0, 0, 0]),
    (5, 1, [5]),
    (-3, 4, [-3, -6, -9, -12]),
    (10000000, 3, [10000000, 20000000, 30000000])
]

for index, (x, n, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(x, n)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )

test_cases2 = [
    (
        [[1, 2], [2, 3]],
        [[3, 4], [5, 6]],
        [[4, 6], [7, 9]]
    ),
    (
        [[1], [2]],
        [[3], [4]],
        [[4], [6]]
    ),
    (
        [[0]],
        [[0]],
        [[0]]
    ),
    (
        [[-1, 2], [3, -4]],
        [[5, -2], [-3, 4]],
        [[4, 0], [0, 0]]
    ),
    (
        [[1, 2, 3]],
        [[4, 5, 6]],
        [[5, 7, 9]]
    ),
    (
        [[1], [2], [3]],
        [[4], [5], [6]],
        [[5], [7], [9]]
    )
]

for index2, (arr3, arr4, expected2) in enumerate(test_cases2, start=1):
    actual2 = solution2(arr3, arr4)

    print(
        f"테스트 {index2}"
        f" | 결과: {actual2}"
        f" | 예상: {expected2}"
        f" | 통과: {actual2 == expected2}"
    )