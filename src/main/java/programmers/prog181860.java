package programmers;

import java.util.ArrayList;
import java.util.List;

public class prog181860 {
    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++){
                if(flag[i]){
                    for(int j = 0; j < arr[i]; j++){
                        list.add(arr[i]);
                        list.add(arr[i]);
                    }
                } else{
                    for(int k = 0; k < arr[i]; k++){
                        int lastIdx = list.size() - 1;
                        list.remove(lastIdx);
                    }
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
}
