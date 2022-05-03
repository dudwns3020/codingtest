class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i <= s.length()/2; i++) {
            int cnt = 1;
            String str = s.substring(0, i);
            String res = "";
            for(int j = i; j <= s.length() - i; j += i) {
                if(str.equals(s.substring(j, j + i))) {
                    cnt++;
                }
                else {
                    if(cnt > 1) {
                        res += cnt;
                    }
                    res += str;
                    str = s.substring(j, j + i);
                    cnt = 1;
                }
            }
            if(cnt > 1) {
                res += cnt;
            }
            res += str;            
            int left = s.length() % i;
            answer = Math.min(answer, res.length() + left);
        }
        
        return answer;
    }
}