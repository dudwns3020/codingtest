class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String[] first = new String[str1.length() - 1];
        String[] second = new String[str2.length() - 1];
        
        int cnt = 0;
        for(int i = 0; i < first.length; i++) {
            String replace = str1.substring(i, i+2).replaceAll("[^a-zA-z0-9]", "");
            if(replace.length() > 1) {
                first[cnt++] = replace;
            }
        }
        for(int i = 0; i < str1.length() - 1; i++) {
            System.out.println(first[i]);
        }
        
        // if(str1.equalsIgnoreCase(str2)) {
        //     System.out.println("equals");
        // }
        return answer;
    }
}