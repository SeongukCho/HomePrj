package programmers;

import java.util.ArrayList;

public class prog181888 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < num_list.length; i=i+n){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
