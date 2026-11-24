def solution(n):
    answer = 0

    n_arr = list(str(n))
    
    for i in range(0, len(n_arr)):
        answer += int(n_arr[i])

    return answer

test_cases = [
    (123, 6),
    (987, 24),
    (1, 1),
    (9, 9),
    (10, 1),
    (100, 1),
    (12345, 15),
    (11111, 5),
    (909090, 27),
    (1002003, 6),
    (99999999, 72),
    (100000000, 1)
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
