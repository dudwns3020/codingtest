import java.util.*;

class Solution {
    
    HashMap<String, Integer> hm = new HashMap<>();
    ArrayList<Integer> al = new ArrayList<>();

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        for(String s: orders) {
            char[] orders_char = s.toCharArray();
            Arrays.sort(orders_char);
            int len = orders_char.length;
            boolean[] visited = new boolean[len];
            for(int i = 0; i < course.length; i++) {
                combi(orders_char, visited, 0, len, course[i]);
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int n: course) {
            int max = 0;
            for(String s: hm.keySet()) {
                if(s.length() == n ) {
                    al.add(hm.get(s));
                    max = Collections.max(al);
                }
            }
            for(String s: hm.keySet()) {
                if(hm.get(s) == max && s.length() == n && max > 1) {
                    list.add(s);
                }
            }
            max = 0;
            al.clear();
        }
        
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    void combi(char[] arr, boolean[] visited, int s, int n, int r) {
        String str = "";
        if(r == 0) {
            for(int i = 0; i < n; i++) {
                if(visited[i]) {
                    str += arr[i];
                }
            }
            hm.put(str,hm.getOrDefault(str,0) + 1);
        }
        
        for(int i = s; i < n; i++) {
            visited[i] = true;
            combi(arr, visited, i+1, n, r-1);
            visited[i] = false;
        }
    }
}