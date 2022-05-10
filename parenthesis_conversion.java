import java.util.*;

class Solution {
    public String solution(String p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        
        if(p.isEmpty()) {
            return p;
        }
        
        int leftp = 0;
        int rightp = 0;
        
        for(int i = 0; i < p.length(); i++) {
            String parenthesis = p.substring(i, i+1);
            if(parenthesis.equals("(")) {
                leftp++;
            }
            else if(parenthesis.equals(")")) {
                rightp++;
            }
            
            if(leftp == rightp) {
                u.append(p.substring(0, i+1));
                v.append(p.substring(i+1, p.length()));
                break;
            }
        }
        
        if(Correct(u.toString())) {
            return u.append(solution(v.toString())).toString();
        }        
                
        answer.append("(");
        answer.append(solution(v.toString()));
        answer.append(")");
        answer.append(Swap(u.substring(1, u.length()-1).toString()));
        
        return answer.toString();
    }

   public boolean Correct(String str) {
        if(str.substring(0,1).equals("(")) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static String Swap(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.substring(i, i+1).equals("(")) {
                sb.append(")");
            }
            else if(str.substring(i, i+1).equals(")")) {
                sb.append("(");
            }
        }
        return sb.toString();
    }
}
    
    
   