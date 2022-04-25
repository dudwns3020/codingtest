class Solution {
    int l = 0;
    int r = 0;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
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
                answer += len(numbers[i], hand);
            }
        }
        
        return answer;
    }
    
    public String len (int numbers, String hand) {
        if(Math.abs(numbers - r) > Math.abs(numbers - l)) {
            return "L";
        }
        else if(Math.abs(numbers - r) == Math.abs(numbers - l)) {
            if (Math.abs(numbers - r) > Math.abs(numbers - l)) {
                return "L";
            }
            else {
                return "R";
            }
        }
        else {
            return "R";
        }
    }
}