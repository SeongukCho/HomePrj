package programmers;

import java.util.ArrayList;

public class prog181862 {
    class Solution {
        public String[] solution(String myStr) {
            ArrayList<String> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (char x : myStr.toCharArray()) {
                if (x == 'a' || x == 'b' || x == 'c') {
                    if (sb.length() > 0) {
                        list.add(sb.toString());
                        sb = new StringBuilder();
                    }
                } else {
                    sb.append(x);
                }
            }
            if (sb.length() > 0) list.add(sb.toString());

            if (list.isEmpty()) return new String[]{"EMPTY"};
            else return list.toArray(new String[0]);
        }
    }
}
