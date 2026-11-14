from collections import deque

def solution(dartResult):
    queue = deque()
    queue.extend(dartResult)

    score_dict = {1 : 0, 2 : 0, 3 : 0}
    count = 1
    while queue:
        print(queue)
        score = queue.popleft()
        if score == '1':
            next = queue[0]
            if next == '0':
                score += next
                queue.popleft()
        bonus = queue.popleft()

        match bonus:
            case "S" : score_dict[count] = int(score) ** 1
            case "D" : score_dict[count] = int(score) ** 2
            case "T" : score_dict[count] = int(score) ** 3

        if not queue:
            continue
        option = queue[0]
        if option.isdigit():
            count += 1
            continue
        match option:
            case "*":
                score_dict[count] = score_dict[count] * 2
                if count != 1:
                    score_dict[count - 1] = score_dict[count - 1] * 2
            case "#":
                score_dict[count] = score_dict[count] * -1

        queue.popleft()
        count += 1

    return sum(score_dict.values())


test_cases = [
    ("1S2D*3T", 37),
    ("1D2S#10S", 9),
    ("1D2S0T", 3),
    ("1S*2T*3S", 23),
    ("1D#2S*3S", 5),
    ("1T2D3D#", -4),
    ("1D2S3T*", 59)
]

for index, (dart_result, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(dart_result)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )