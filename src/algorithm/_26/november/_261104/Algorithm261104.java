package algorithm._26.november._261104;

import java.util.Stack;

public class Algorithm261104 {

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0){
                    if(stack.isEmpty()){
                        stack.push(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;
                        break;
                    }
                    if(board[j][moves[i] - 1] == stack.peek()){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261104 algorithm = new Algorithm261104();

        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int expected = 4;

        int result = algorithm.solution(board, moves);

        System.out.println(
                "결과: " + result
                        + " | 예상: " + expected
                        + " | 통과: " + (result == expected)
        );
    }
}