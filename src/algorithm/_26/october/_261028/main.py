def solution(lottos, win_nums):
    score = {6 : 1, 5 : 2, 4 : 3, 3 : 4, 2 : 5}

    zero_point = 0
    match_point = 0
    for lotto in lottos:
        if lotto == 0:
            zero_point += 1
        elif lotto in win_nums:
            match_point += 1

    max_score = zero_point + match_point
    return [
        score.get(max_score, 6),
        score.get(match_point, 6)
    ]

lottos1 = [44, 1, 0, 0, 31, 25]
win_nums1 = [31, 10, 45, 1, 6, 19]

lottos2 = [0, 0, 0, 0, 0, 0]
win_nums2 = [38, 19, 20, 40, 15, 25]

lottos3 = [45, 4, 35, 20, 3, 9]
win_nums3 = [20, 9, 3, 45, 4, 35]

print(solution(lottos1, win_nums1))  # [3, 5]
print(solution(lottos2, win_nums2))  # [1, 6]
print(solution(lottos3, win_nums3))  # [1, 1]