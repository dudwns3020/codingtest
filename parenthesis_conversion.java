class Solution {
    public String solution(String p) {
        String answer = "";
        
        for(int i = 0; i < p.length(); i++) {
            int leftp = 0;
            int rightp = 0;
            
            String parenthesis = p.substring(i, i+1);
            if(parenthesis.equals('{')) {
                leftp++;
            }
            else if(parenthesis.equals('}')) {
                rightp++;
            }
            
            if(leftp == rightp) {
                String u = p.substring(0, i+1);
                String v = p.substring(i+1, p.length());
                p = v;
            }
        }
        return answer;
    }
}