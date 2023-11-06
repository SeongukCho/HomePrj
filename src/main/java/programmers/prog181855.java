package programmers;

import java.util.HashMap;
import java.util.Map;

public class prog181855 {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(String str : strArr){
            int a = str.length();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (int count : map.values()) {
            answer = Math.max(answer, count);
        }

        return answer;
    }
}
