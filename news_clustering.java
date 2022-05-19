import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++) {
            char l1 = str1.charAt(i);
            char l2 = str1.charAt(i+1);
            if(l1 > 64 && l1 <91) {
                if(l2 > 64 && l2 <91) {
                    al1.add(Character.toString(l1) + Character.toString(l2));
                }
            }
        }
        
        for(int i = 0; i < str2.length() - 1; i++) {
            char l1 = str2.charAt(i);
            char l2 = str2.charAt(i+1);
            if(l1 > 64 && l1 <91) {
                if(l2 > 64 && l2 <91) {
                    al2.add(Character.toString(l1) + Character.toString(l2));
                }
            }
        }

        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        
        for(String s: al1) {
            if(al2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }
        
        for(String s: al2) {
            union.add(s);
        }

        double similar = 0;
        
        if(union.size() == 0) {
            similar = 1;
        }
        else {
            similar = (double) intersection.size() / (double) union.size();
        }
        
        answer = (int) (similar * 65536);
        
        return answer;
    }
}