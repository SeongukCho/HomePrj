package programmers;

import java.util.ArrayList;

public class prog181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        int idx = 0;
        for(String i : list){
            answer[idx] = i;
            idx++;
        }

        return answer;
    }
}
