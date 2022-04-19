import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        
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
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 6; i++) {
            map.put(6 - i, 1 + i);
        }
        map.put(0 , 6);

        answer[0] = map.get(max);
        answer[1] = map.get(min);
        
        return answer;
    }
}