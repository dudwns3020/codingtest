class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = 9;
        
        for(int i = 0; i <= len; i++) {
            answer += i;
        }
        
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}