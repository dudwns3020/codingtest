import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String str = s.replaceAll("[{,},,]","");
        
        int[] num = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            num [i] = Integer.parseInt(str.substring(i, i+1));
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++) {
            hm.put(num[i], i);
        }

        return answer;
    }
}