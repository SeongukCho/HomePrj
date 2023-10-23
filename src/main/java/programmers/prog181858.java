package programmers;

import java.util.LinkedHashSet;

public class prog181858 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int value : arr) {
            if (set.size() < k) {
                set.add(value);
            }
        }


        int idx = 0;
        for (int a : set) {
            answer[idx] = a;
            idx++;
        }

        if (set.size() != k) {
            for (int j = set.size(); j < k; j++) {
                answer[j] = -1;
            }
        }
        return answer;
    }
}
