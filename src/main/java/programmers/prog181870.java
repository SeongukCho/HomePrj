package programmers;

import java.util.ArrayList;
import java.util.List;

public class prog181870 {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(String a : strArr){
            if(!(a.contains("ad"))){
                list.add(a);
            }
        }
        String[] answer = new String[list.size()];
        int idx = 0;
        for(String b : list){
            answer[idx] = b;
            idx++;
        }

        return answer;
    }
}
