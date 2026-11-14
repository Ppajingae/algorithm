def solution(N, stages):
    dict = {}
    count = 0
    stage_length = len(stages)

    for i in range(1, N + 1):
        for stage in stages:
            if stage == i:
                count += 1

        total_count = 0.0
        if count > 0:
            total_count = count / stage_length

        dict.setdefault(i, total_count)
        stage_length -= count
        count = 0

    return sorted(dict, key=lambda x: dict[x], reverse=True)


stage_counts = [5, 4]

stages_list = [
    [2, 1, 2, 6, 2, 4, 3, 3],
    [4, 4, 4, 4, 4]
]

expected = [
    [3, 4, 2, 1, 5],
    [4, 1, 2, 3]
]

for index, (N, stages, result) in enumerate(
        zip(stage_counts, stages_list, expected), start=1
):
    actual = solution(N, stages)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )