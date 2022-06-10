import java.util.*;

class Solution {
    ArrayList<Integer> numbers;
    ArrayList<Character> operators;
    ArrayList<String> operpermu;
    public long solution(String expression) {
        long answer = 0;
        
        numbers = new ArrayList<>();
        operators = new ArrayList<>();
        
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
        operpermu = new ArrayList<>();
        
        permu(operators, operpermu, output, visited, 0, operators.size());
        for(String s: operpermu) {
            System.out.println(s);
        }
        return answer;
    }
    
    public void permu(ArrayList<Character> operators, ArrayList<String> operpermu, String[] output, boolean[] visited, int depth, int r) {
        if(depth == r) {
            operpermu.add(output.toString());
            return;
        }
        for(int i = 0; i < operators.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = operators.get(i).toString();
                permu(operators, operpermu, output, visited, depth+1, r);
                visited[i] = false;
            }
        }
    }
}