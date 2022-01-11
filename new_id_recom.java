class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1
        answer = new_id.toLowerCase();
        
        //2
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        //3
        answer = answer.replaceAll("[.]{2,}", ".");
        
        //4
        ///if(answer.charAt(0) == '.') {
        //    answer = answer.substring(1, answer.length());
        //}
        //else if(answer.charAt(answer.length() - 1) == '.') {
        //    answer = answer.substring(0, answer.length() - 1);
        //}
        answer = answer.replaceAll("^[.]", "");
        answer = answer.replaceAll("[.]$", "");
        
        //answer = answer.replaceAll("^(\\.)|(\\.)$","");

        //5
        if(answer.length() == 0) {
            answer += "a";
        }
        //if(answer.empty()) {
        //    answer = "a"
        //}

        //6
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
       
        //7
        while(answer.length() < 3) {
             answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}