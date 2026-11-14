def solution(nums):
    answer = 0

    for i in range(0, len(nums)):
        for j in range(i + 1, len(nums)):
            for k in range(j + 1, len(nums)):
                if get_devisors(nums[i] + nums[j] + nums[k]) == 2:
                    answer += 1

    return answer

def get_devisors(n):
    count = 0
    for i in range(1, int(n ** 0.5) + 1):
        if n % i == 0:
            count += 1
            if not i == n / i:
                count += 1
    return count

test_cases = [
    ([1, 2, 3, 4], 1),
    ([1, 2, 7, 6, 4], 4),
    ([1, 2, 4], 1),
    ([1, 2, 3], 0),
    ([2, 4, 6], 0),
    ([1, 3, 5], 0),
    ([2, 3, 5, 7], 0)
]

for index, (nums, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(nums)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )