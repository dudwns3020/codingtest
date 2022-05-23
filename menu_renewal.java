import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String s: orders) {
            char[] orders_char = s.toCharArray();
            int len = orders_char.length;
            boolean[] visited = new boolean[len];
            for(int i = 0; i < course.length; i++) {
                combi(orders_char, visited, 0, len, course[i]);
            }
            System.out.println();
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
            System.out.println(str);
        }
        
        for(int i = s; i < n; i++) {
            visited[i] = true;
            combi(arr, visited, i+1, n, r-1);
            visited[i] = false;
        }
    }
}