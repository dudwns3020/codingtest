import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String pattern = "[a-zA-z0-9]*$";
        
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
        
        // for(String s: al1) {
        //     System.out.print(s + " ");
        // }
        // System.out.println("");
        // for(String s: al2) {
        //     System.out.print(s + " ");
        // }
        // System.out.println("");
        
        // for(String a: al1) {
        //     for(String b : al2) {
        //         if(a.equals(b)) {
        //             System.out.println(a + " " + b + " " +"same");
        //         }
        //     }
        // }
        
        return answer;
    }
}