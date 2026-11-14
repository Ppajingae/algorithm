def solution(n, arr1, arr2):
    answer = []

    for a, b in zip(arr1, arr2):
        binary = format(a | b, f"0{n}b")
        answer.append(binary.replace("0", " ").replace("1", "#"))

    return answer

def solution2(a, b):
    answer = 0
    if a > b:
        for i in range(b, a + 1):
            answer += i
    elif a < b:
        for i in range(a, b + 1):
            answer += i
    else:
        answer += b

    return answer



test_cases = [
    (
        5,
        [9, 20, 28, 18, 11],
        [30, 1, 21, 17, 28],
        [
            "#####",
            "# # #",
            "### #",
            "#  ##",
            "#####"
        ]
    ),
    (
        6,
        [46, 33, 33, 22, 31, 50],
        [27, 56, 19, 14, 14, 10],
        [
            "######",
            "###  #",
            "##  ##",
            " #### ",
            " #####",
            "### # "
        ]
    )
]

for index, (n, arr1, arr2, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(n, arr1, arr2)

    print(f"테스트 {index}")
    print(f"결과: {actual}")
    print(f"예상: {expected}")
    print(f"통과: {actual == expected}")
    print()

test_cases2 = [
    (3, 5, 12),
    (3, 3, 3),
    (5, 3, 12),
    (-3, 3, 0),
    (-5, -3, -12),
    (-10000000, 10000000, 0)
]

for index, (a, b, expected) in enumerate(test_cases2, start=1):
    actual = solution2(a, b)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )