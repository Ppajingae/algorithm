def solution(a, b):
    answer = 0

    for c, d in zip(a, b):
        answer += c * d

    return answer


a_list = [
    [1, 2, 3, 4],
    [-1, 0, 1]
]

b_list = [
    [-3, -1, 0, 2],
    [1, 0, -1]
]

expected = [3, -2]

for index, (a, b, result) in enumerate(
        zip(a_list, b_list, expected), start=1
):
    actual = solution(a, b)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )