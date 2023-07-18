package programmers;

import java.util.ArrayList;

public class prog181918 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length;) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
        }
        return stk.stream(). mapToInt(i -> i). toArray();
    }
}
