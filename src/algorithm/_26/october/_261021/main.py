from collections import defaultdict

def solution(id_list, report, k):
    answer = [0] * len(id_list)
    id_map = {id_list[i]: i for i in range(len(id_list))}
    reporter_map = {id_: set() for id_ in id_list}
    respondent_map = {id_: [] for id_ in id_list}

    for s in report:
        reporter = s.split(' ')[0]
        respondent = s.split(' ')[1]

        if respondent in reporter_map.get(reporter):
            continue

        reporter_map[reporter].add(respondent)
        respondent_map[respondent].append(reporter)

    for key, v in respondent_map.items():
        if len(v) >= k:
            for i in v:
                answer[id_map.get(i)] += 1

    return answer


id_list1 = ["muzi", "frodo", "apeach", "neo"]

report1 = [
    "muzi frodo",
    "apeach frodo",
    "frodo neo",
    "muzi neo",
    "apeach muzi"
]

k1 = 2

id_list2 = ["con", "ryan"]

report2 = [
    "ryan con",
    "ryan con",
    "ryan con",
    "ryan con"
]

k2 = 3

print(solution(id_list1, report1, k1))  # [2, 1, 1, 0]
print(solution(id_list2, report2, k2))  # [0, 0]