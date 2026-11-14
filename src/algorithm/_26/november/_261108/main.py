def solution(array, commands):
    answer = [0] * len(commands)

    for index, command in enumerate(commands):
        arr_list = []
        for i in range(command[0], command[1] + 1):
            arr_list.append(array[i - 1])

        sorted_list = sorted(arr_list)
        result = sorted_list[command[2] - 1]
        answer[index] = result

    return answer


array = [1, 5, 2, 6, 3, 7, 4]

commands = [
    [2, 5, 3],
    [4, 4, 1],
    [1, 7, 3]
]

expected = [5, 6, 3]

actual = solution(array, commands)

print(
    f"결과: {actual}"
    f" | 예상: {expected}"
    f" | 통과: {actual == expected}"
)