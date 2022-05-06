import java.util.*;
import java.util.Map.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String str = s.replaceAll("[{}]","");
        String[] sp = str.split(",");

        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String a : sp) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());

		Collections.sort(list, new Comparator<>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
			}
		});

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i ++) {
            answer[i] = Integer.parseInt(list.get(i).getKey());
        }
       
        return answer;
    }
}