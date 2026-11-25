def solution(s):
    answer = ""

    split_str = s.split(" ")
    for i in split_str:
        for j in range(0, len(i)):
            if j % 2 == 0:
                answer += i[j].upper()
            else:
                answer += i[j].lower()
        answer += " "

    return answer[0:-1]


test_cases = [
    ("try hello world", "TrY HeLlO WoRlD"),
    ("hello", "HeLlO"),
    ("HELLO", "HeLlO"),
    ("a", "A"),
    ("A", "A"),
    ("ab cd ef", "Ab Cd Ef"),
    ("abc defg", "AbC DeFg"),
    ("try  hello   world", "TrY  HeLlO   WoRlD"),
    (" hello", " HeLlO"),
    ("hello ", "HeLlO "),
    ("  hello  world  ", "  HeLlO  WoRlD  "),
    ("hElLo WoRlD", "HeLlO WoRlD"),
    ("a b c d", "A B C D")
]

for index, (s, expected) in enumerate(test_cases, start=1):
    actual = solution(s)

    print(
        f"테스트 {index}"
        f" | 입력: {s!r}"
        f" | 결과: {actual!r}"
        f" | 예상: {expected!r}"
        f" | 통과: {actual == expected}"
    )