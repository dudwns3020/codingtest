class Solution {
    public String solution(String new_id) {
        String answer = "";
    
        answer = new_id.toLowerCase();
        
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s-_.]";
        answer = answer.replaceAll(match, "");
        
        return answer;
    }
}