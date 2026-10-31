def solution(sizes):
    max_arr = [0] * len(sizes)
    min_arr = [0] * len(sizes)

    for index, i in enumerate(sizes):
        max_arr[index] = max(i[0], i[1])
        min_arr[index] = min(i[0], i[1])

    return max(max_arr) * max(min_arr)

sizes1 = [
    [60, 50], [30, 70], [60, 30], [80, 40]
]

sizes2 = [
    [10, 7], [12, 3], [8, 15], [14, 7], [5, 15]
]

sizes3 = [
    [14, 4], [19, 6], [6, 16], [18, 7], [7, 11]
]

print(solution(sizes1))  # 4000
print(solution(sizes2))  # 120
print(solution(sizes3))  # 133