def solution(n):
    n_arr = list(str(n))
    print(n_arr)
    answer = [0] * len(n_arr)

    index1 = 0
    for i in range(len(n_arr) - 1, -1, -1):
        answer[index1] = int(n_arr[i])
        index1 += 1

    return answer


test_cases = [
    (12345, [5, 4, 3, 2, 1]),
    (1, [1]),
    (9, [9]),
    (10, [0, 1]),
    (100, [0, 0, 1]),
    (1200, [0, 0, 2, 1]),
    (987654321, [1, 2, 3, 4, 5, 6, 7, 8, 9]),
    (11111, [1, 1, 1, 1, 1]),
    (909090, [0, 9, 0, 9, 0, 9]),
    (10000000000, [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]),
    (1234567890, [0, 9, 8, 7, 6, 5, 4, 3, 2, 1])
]

for index, (n, expected) in enumerate(test_cases, start=1):
    actual = solution(n)

    print(
        f"테스트 {index}"
        f" | 입력: {n}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )