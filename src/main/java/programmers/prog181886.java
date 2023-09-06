package programmers;

import java.util.ArrayList;

public class prog181886 {
    class Solution {
        public String[] solution(String[] names) {
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0; i < names.length; i=i+5){
                list.add(names[i]);
            }
            String[] answer = new String[list.size()];
            int idx = 0;
            for(String a : list){
                answer[idx] = a;
                idx++;
            }
            return answer;
        }
    }
}
