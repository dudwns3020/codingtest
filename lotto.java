class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int min = 0;
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    min++;
                }
            }
        }
        int zero = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero++;
            }
        }
        
        int max = min + zero;
        
        System.out.println(min + "," + max);
        
        return answer;
    }
}