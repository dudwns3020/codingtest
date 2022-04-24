class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
         StringBuffer result = new StringBuffer();
        
        for(int i = 0; i < numbers.length; i++) {
            int left = 0;
            int right = 0;
            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = numbers[i];
                hand = "L";
            }            
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = numbers[i];
                hand = "R";
            }
            else {
                
            }
            result.append(hand);
        }
        
        answer = result;
        
        return answer;
    }
}