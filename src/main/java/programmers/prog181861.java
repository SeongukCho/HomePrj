package programmers;

import java.util.ArrayList;

public class prog181861 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int k : arr) {
            max = k;
            for (int j = 0; j < max; j++) {
                list.add(k);
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int a : list){
            answer[idx] = a;
            idx++;
        }
        return answer;
    }
}
