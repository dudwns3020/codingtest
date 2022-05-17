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
        System.out.println("");
         System.out.print("al1 : ");        
        for(String s: al1) {
            System.out.print(s + " ");
        }
        System.out.println("");
       System.out.print("al2 : ");        
        for(String s: al2) {
            System.out.print(s + " ");
        }
        System.out.println("");
        ArrayList<String> intersection = new ArrayList<>();
        
        for(int i = 0; i < al1.size(); i++) {
            for(int j = 0; j < al2.size(); j++) {
                if(al1.get(i).equals(al2.get(j))) {
                    intersection.add(al1.get(i));
                    // System.out.println(al1.get(i));
                    // System.out.println(al2.get(j));
                    al1.remove(i);
                    al2.remove(j);
                    i = 0;
                    j = 0;
                }
            }
        }        
        
        System.out.print("N : ");
        for(String s: intersection) {
            System.out.print(s + " ");
        }
        System.out.println("");
         System.out.print("al1 : ");        
        for(String s: al1) {
            System.out.print(s + " ");
        }
        System.out.println("");
       System.out.print("al2 : ");        
        for(String s: al2) {
            System.out.print(s + " ");
        }
        System.out.println("");
        
        ArrayList<String> union = new ArrayList<>();
        for(String s: al1) {
            union.add(s);
        }
        for(String s: al2) {
            union.add(s);
        }
        for(String s: intersection) {
            union.add(s);
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