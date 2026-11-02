def solution(numbers):
    answer = set()

    for i in range(0, len(numbers)):
        for j in range(1, len(numbers):
            answer.add(numbers[i] + numbers[j])

    return sorted(answer)


numbers_list = [
    [2, 1, 3, 4, 1],
    [5, 0, 2, 7]
]

expected = [
    [2, 3, 4, 5, 6, 7],
    [2, 5, 7, 9, 12]
]

for index, (numbers, result) in enumerate(
        zip(numbers_list, expected), start=1
):
    actual = solution(numbers)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )