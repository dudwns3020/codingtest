class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1
        answer = new_id.toLowerCase();
        
        //2
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        //3
        //for(int i = 0 ; i < answer.length() - 1 ; i++ ){
        //    if(answer.charAt(i) == answer.charAt(i + 1)) {
        //        answer = answer.replace(answer.charAt(i), "");
        //    }
        //}
        
        //4
        if(answer.charAt(0) == '.') {
            answer = answer.substring(1, answer.length());
        }
        //else if(answer.charAt(answer.length()) == '.') {
        //    answer = answer.substring(0, answer.length()-1);
        //}

        //5
        if(answer.length() == 0) {
            answer = "a";
        }

        //6
        if(answer.length() >= 16) {
            answer.substring(0, 15);
        }
        
        //7
         if(answer.length() <= 2) {
            while(answer.length() < 3){
                answer += answer.charAt(0);
            }        
        }
        
        return answer;
    }
}