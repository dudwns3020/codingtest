import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][moves[j] - 1] != 0) {
                    if (s.peek() == board[i][moves[j] - 1]) {
                        s.pop();
                        answer += 2;
                    } else {
                        s.push(board[i][moves[j] - 1]);
                    }
                    board[i][moves[j] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}