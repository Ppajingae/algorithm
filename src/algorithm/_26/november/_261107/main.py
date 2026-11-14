def solution(answers):
    result = [0,0,0]
    one = [1, 2, 3, 4, 5]
    two = [2, 1, 2, 3, 2, 4, 2, 5]
    three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    answer_count = [0,0,0]

    for i , answer in enumerate(answers):
        if answer == one[i % len(one)]:
            answer_count[0] += 1
        if answer == two[i % len(two)]:
            answer_count[1] += 1
        if answer == three[i % len(three)]:
            answer_count[2] += 1

    max_count = 0
    for answer in answer_count:
        if answer > max_count:
            max_count = answer
    for i, answer in enumerate(answer_count):
        if answer_count[i] == max_count:
            result[i] = i + 1

    return list(filter(lambda n: n != 0, result))


test_cases = [
    ([1, 2, 3, 4, 5], [1]),
    ([1, 3, 2, 4, 2], [1, 2, 3])
]

for index, (answers, expected) in enumerate(test_cases, start=1):
    actual = solution(answers)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )