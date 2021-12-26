import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();

		if(board[i][j] == s.peek()) {
            s.pop();
            answer += 2;
        }
        else {
            s.push(board[i][j]);
        }
        board[i][j] = 0;

        return answer;
    }
}
/*
Board(5*5 크레인)
0 0 0 0 0
0 0 1 0 3 
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1

Moves (담은자리)
1 5 3 5 1 2 1 4

Result (사라진인형수)
4
*/