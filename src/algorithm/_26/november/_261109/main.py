from collections import Counter

def solution(participant, completion):
    count_map = Counter(participant)

    for people in completion:
        if people in count_map:
            count_map[people] -= 1

    filtered_answer = {k: v for k, v in count_map.items() if v == 1}
    return next(iter(filtered_answer))


test_cases = [
    (
        ["leo", "kiki", "eden"],
        ["eden", "kiki"],
        "leo"
    ),
    (
        ["marina", "josipa", "nikola", "vinko", "filipa"],
        ["josipa", "filipa", "marina", "nikola"],
        "vinko"
    ),
    (
        ["mislav", "stanko", "mislav", "ana"],
        ["stanko", "ana", "mislav"],
        "mislav"
    )
]

for index, (participant, completion, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(participant, completion)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )