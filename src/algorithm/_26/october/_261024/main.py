def solution(numbers):
    answer = 0
    intArr = [0,1,2,3,4,5,6,7,8,9]

    for i in intArr:
        if i in numbers:
            continue
        else:
            answer += i

    return answer

numbers1 = [1, 2, 3, 4, 6, 7, 8, 0]
numbers2 = [5, 8, 4, 0, 6, 7, 9]

print(solution(numbers1))  # 14
print(solution(numbers2))  # 6