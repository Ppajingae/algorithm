def solution(numbers, hand):
    answer = ""
    left_button = "*"
    right_button = "#"

    for number in numbers:
        str_number = str(number)
        match number:
            case 1 | 4 | 7:
                answer += "L"
                left_button = str_number
            case 2 | 5 | 8 | 0:
                if get_distance(right_button, str_number) == get_distance(left_button, str_number):
                    if hand == "right":
                        right_button = str_number
                        answer += "R"
                    else:
                        left_button = str_number
                        answer += "L"
                elif get_distance(right_button, str_number) < get_distance(left_button, str_number):
                    right_button = str_number
                    answer += "R"
                else :
                    left_button = str_number
                    answer += "L"
            case 3 | 6 | 9:
                answer += "R"
                right_button = str_number

    return answer

def get_distance(button, clicked_button):
    distance = 0
    dict = {
        "*": [3,0],
        "0": [3,1],
        "#": [3,2],
        "1": [0,0],
        "2": [0,1],
        "3": [0,2],
        "4": [1,0],
        "5": [1,1],
        "6": [1,2],
        "7": [2,0],
        "8": [2,1],
        "9": [2,2],
    }

    point = dict[button]
    point1 = dict[clicked_button]

    for index, p in enumerate(point):
        distance += abs(abs(p) - abs(point1[index]))

    return distance

numbers_list = [
    [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],
    [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2],
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
]

hands = [
    "right",
    "left",
    "right"
]

expected = [
    "LRLLLRLLRRL",
    "LRLLRRLLLRR",
    "LLRLLRLLRL"
]

for index, (numbers, hand, result) in enumerate(
        zip(numbers_list, hands, expected), start=1
):
    actual = solution(numbers, hand)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )