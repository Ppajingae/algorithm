def solution(phone_number):
    char_list = list(phone_number)

    for i in range(len(char_list) - 4):
        char_list[i] = '*'

    return "".join(char_list)

def solution2(x):
    char_arr = str(x)
    result = 0
    for i in char_arr:
        result += int(i)

    return x % result == 0

test_cases = [
    ("01033334444", "*******4444"),
    ("027778888", "*****8888"),
    ("1234", "1234"),
    ("12345", "*2345"),
    ("01012345678", "*******5678"),
    ("12345678901234567890", "****************7890")
]

for index, (phone_number, expected) in enumerate(test_cases, start=1):
    actual = solution(phone_number)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )

test_cases2 = [
    (10, True),
    (12, True),
    (11, False),
    (13, False),
    (1, True),
    (18, True),
    (19, False),
    (21, True),
    (100, True),
    (101, False),
    (9999, False),
    (10000, True)
]

for index, (x, expected) in enumerate(test_cases2, start=1):
    actual = solution2(x)

    print(
        f"테스트 {index}"
        f" | 입력: {x}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )