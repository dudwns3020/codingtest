class Solution {
    public int solution(String s) {
        int answer = 0;
        String str1 = "";
        for(int i = 1; i <= s.length()/2; i++) {
            str1 = s.substring(0, i);
            int cnt = 0;
            for(int j = i; j < s.length() - i; j += i) {
                if(str1.equals(s.substring(j, j + i))) {
                    cnt++;
                }
                else {
                    str1 = s.substring(j, j + i);
                }
            }
        }
        
        return answer;
    }
}