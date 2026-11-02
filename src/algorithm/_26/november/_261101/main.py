def solution(n):
    answer_str = ''
    while n > 0:
        answer_str += str(n % 3)
        n //= 3

    return int(answer_str, 3)


numbers = [45, 125]
expected = [7, 229]

for index, (number, result) in enumerate(
        zip(numbers, expected), start=1
):
    actual = solution(number)

    print(
        f"테스트 {index}"
        f" | 입력: {number}"
        f" | 결과: {actual}"
        f" | 예상: {result}"
        f" | 통과: {actual == result}"
    )