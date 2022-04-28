class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10;
        int r = 12;
        
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
                if(numbers[i] == 0) {
                    numbers[i] = 11;
                }
                int rlen = Math.abs(numbers[i] - r)/3 + Math.abs(numbers[i] - r)%3;
                int llen = Math.abs(numbers[i] - l)/3 + Math.abs(numbers[i] - l)%3;
                
                if(rlen == llen) {
                    if(hand.equals("left")) {
                        l = numbers[i];
                        answer += "L";
                    }
                    else {
                        r = numbers[i];
                        answer += "R";
                    }
                }
                else if(rlen < llen) {
                    r = numbers[i];
                    answer += "R";
                }
                else {
                    l = numbers[i];
                    answer += "L";
                }
            }
        }
        
        return answer;
    }
}