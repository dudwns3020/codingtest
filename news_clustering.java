import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String pattern = "^[a-zA-z0-9]*$";
        
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++) {
            if(Pattern.matches(pattern, str1.substring(i, i + 2))) {
                al1.add(str1.substring(i, i + 2).toUpperCase());
            }
        }        
        for(int i = 0; i < str2.length() - 1; i++) {
            if(Pattern.matches(pattern, str2.substring(i, i + 2))) {
                al2.add(str2.substring(i, i + 2).toUpperCase());
            }
        }

        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        
        for(String s: al1) {
            if(al2.remove(s)) {
                intersection.add(s);
            }
        }
        
        double similar = (double) intersection.size()/union.size();
        
        if(similar == 0) {
            similar = 1;
        }
        answer = (int)(similar * 65536);
        System.out.println(similar);
        
        return answer;
    }
}