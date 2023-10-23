package programmers;

import java.util.ArrayList;
import java.util.List;

public class prog181859 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        if (i < arr.length) {
            for (int k = 0; k < arr.length; k++) {
                if (list.size() == 0) {
                    list.add(arr[i]);
                    i++;
                } else {
                    if (list.get(list.size() - 1) == arr[i]) {
                        list.remove(list.size() - 1);
                        i++;
                    } else {
                        list.add(arr[i]);
                        i++;
                    }
                }
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        int idx = 0;

        for (int a : list) {
            answer[idx] = a;
            idx++;
        }

        return answer;
    }
}

