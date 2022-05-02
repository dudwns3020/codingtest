class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i <= s.length()/2; i++) {
            int cnt = 1;
            String str = s.substring(0, i);
            int no = 0;
            
            for(int j = i; j <= s.length() - i; j += i) {
                if(str.equals(s.substring(j, j + i))) {
                    cnt++;
                }
                else {
                    if(cnt > 1) {
                        answer += (int)Math.log10(cnt) + 1;
                    }
                    
                }
            }
            answer = Math.min(answer, no);
        }
        
        return answer;
    }
}