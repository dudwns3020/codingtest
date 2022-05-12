import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};        
        
        HashMap<String, String> hm = new HashMap<>();
        
        for(int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")) {
                hm.put(str[1], str[2]);
            }
            else if(str[0].equals("Leave")) {
                //hm.remove(str[1]);
            }
            else if(str[0].equals("Change")) {
                hm.put(str[1], str[2]);                
            }
        }
        
        List<String> list = new ArrayList<>();

        for(int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")) {
                list.add(hm.get(str[1]) + "님이 들어왔습니다.");
            }
            else if(str[0].equals("Leave")) {
                list.add(hm.get(str[1]) + "님이 나갔습니다.");
            }
        }
        
        answer = list.toArray(answer);
        
        return answer;
    }
}