from math import sqrt

def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        if get_divisors(i) % 2 == 0:
            answer += i
        else:
            answer -= i

    return answer

def get_divisors(n):
    count = 0
    for i in range(1, int(sqrt(n)) + 1):
        if n % i == 0:
            count += 1
            if n // i != i:
                count += 1
    return count

print(solution(13, 17))  # 43
print(solution(24, 27))  # 52