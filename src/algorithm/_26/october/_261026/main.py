def solution(s):
    num_list = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

    for i, num in enumerate(num_list):
        s = s.replace(num, str(i))

    return int(s)


print(solution("one4seveneight"))    # 1478
print(solution("23four5six7"))       # 234567
print(solution("2three45sixseven"))  # 234567
print(solution("123"))               # 123