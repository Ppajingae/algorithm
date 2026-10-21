def solution(survey, choices):
    map = {'R' : 0, 'T' : 0, 'C' : 0, 'F' : 0, 'J' : 0, 'M' : 0, 'A' : 0, 'N' : 0}

    for index, choice in enumerate(choices):
        number = choice - 4
        type = survey[index]
        if number < 0:
            map[type[0]] += abs(number)
        elif number > 0:
            map[type[1]] += number

    return returning_string('R','T', map) + returning_string('C', 'F', map) + returning_string('J','M', map) + returning_string('A', 'N', map)

def returning_string(char1, char2, map):
    if map[char1] > map[char2]:
        return char1
    elif map[char2] > map[char1]:
        return char2
    else:
        char_arr = sorted([char1, char2])
        return char_arr[0]

survey1 = ["AN", "CF", "MJ", "RT", "NA"]
choices1 = [5, 3, 2, 7, 5]

survey2 = ["TR", "RT", "TR"]
choices2 = [7, 1, 3]

print(solution(survey1, choices1))  # TCMA
print(solution(survey2, choices2))  # RCJA