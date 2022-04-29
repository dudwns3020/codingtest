class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        for(int i = 1; i <= s.length()/2; i++) {
            for(int j = 0; j <= s.length() - i; j++) {
                str = s.substring(j, j + i);
                System.out.print(str + " ");
                if(str.equals(s.substring())) {
                    System.out.println("*");
                }
            }
            System.out.println("");
        }
        
        return answer;
    }
}