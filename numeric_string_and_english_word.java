class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String a = s.replace("one", "1");
        a = a.replace("two", "2");
        a = a.replace("three", "3");
        a = a.replace("four", "4");
        a = a.replace("five", "5");
        a = a.replace("six", "6");
        a = a.replace("seven", "7");
        a = a.replace("eight", "8");
        a = a.replace("nine", "9");
        
        answer = Integer.parseInt(a);
        
        return answer;
    }
}