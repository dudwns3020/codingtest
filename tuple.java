class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == ',') {
               continue;
            }
            else {
                System.out.print(s.charAt(i) + " ");
            }
        }
        
        return answer;
    }
}