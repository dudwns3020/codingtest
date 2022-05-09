class Solution {
    public String solution(String p) {
        String answer = "";
        String u = "";
        String v = "";
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
                u = p.substring(0, i+1);
                v = p.substring(i+1, p.length());
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(v));
        sb.append(")");
        u = u.substring(1, u.length()-1);
        sb.append(swap(u));
        
        answer = u.toString();
        
        return answer;
    }
    
    public String swap(String str) {
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