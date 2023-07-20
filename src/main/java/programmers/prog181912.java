package programmers;

import java.util.ArrayList;

public class prog181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int a = Integer.parseInt(intStr.substring(s, s + l));
            if (a > k) list.add(a);
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
