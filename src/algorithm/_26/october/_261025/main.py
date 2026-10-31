def solution(price, money, count):
    answer = 0

    for i in range(1, count + 1):
        answer += price * i

    if answer > money:
        return answer - money
    else: return 0

print(solution(3, 20, 4))  # 10
print(solution(3, 30, 4))  # 0
print(solution(3, 40, 4))  # 0