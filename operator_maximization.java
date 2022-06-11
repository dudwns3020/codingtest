import java.util.*;

class Solution {
    public long solution(String expression) {
        long answer = 0;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        
        String expressnumber =  expression.replaceAll("[^0-9]", " ");
        String[] number = expressnumber.split(" ");
        int[] num = new int[number.length];
        for(int i = 0; i < number.length; i++) {
            num[i] = Integer.parseInt(number[i]);
            numbers.add(num[i]);
        }
        
        String expressoper =  expression.replaceAll("[0-9]", "");
        for(int i = 0; i < expressoper.length(); i++) {
            if(!operators.contains(expressoper.charAt(i))) {
                operators.add(expressoper.charAt(i));
            }
        }
        
        int size = 1;
        for(int i = 1; i <= operators.size(); i++) {
            size *= i;
        }
        
        boolean[] visited = new boolean[operators.size()];
        String[] output = new String[size];
        
        permu(operators, output, visited, 0, operators.size());

        return answer;
    }
    
    public void permu(ArrayList<Character> operators, String[] output, boolean[] visited, int depth, int r) {
        if(depth == r) {
            return;
        }
        for(int i = 0; i < operators.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                permu(operators, output, visited, depth+1, r);
                visited[i] = false;
            }
        }
    }
}