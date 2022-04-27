class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 0;
        int r = 0;
        
        for(int i = 0; i < numbers.length; i++) {            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                l = numbers[i];
                answer += "L";
            }            
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                r = numbers[i];
                answer += "R";
            }
            else {
                answer += len(numbers[i], hand, r, l);
            }
        }
        
        return answer;
    }
    
    public String len (int numbers, String hand, int r, int l) {
        if(r == 5 || l == 5) {
            return "b";
        }
        return "a";
    }
}