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
        
        return answer;
    }
}