def solution(board, moves):
    stack = []
    answer = 0

    for move in moves:
        for i in range(len(board)):
            doll = board[i][move - 1]

            if doll == 0:
                continue

            board[i][move - 1] = 0

            if stack and stack[-1] == doll:
                stack.pop()
                answer += 2
            else:
                stack.append(doll)

            break

    return answer


board = [
    [0, 0, 0, 0, 0],
    [0, 0, 1, 0, 3],
    [0, 2, 5, 0, 1],
    [4, 2, 4, 4, 2],
    [3, 5, 1, 3, 1]
]

moves = [1, 5, 3, 5, 1, 2, 1, 4]
expected = 4

actual = solution(board, moves)

print(
    f"결과: {actual}"
    f" | 예상: {expected}"
    f" | 통과: {actual == expected}"
)