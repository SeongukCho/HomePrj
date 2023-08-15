package programmers;

public class prog181896 {
    public int solution(int[] num_list) {
        int idx = 0;
        for (int a : num_list){
            if ( a >= 0) {
                idx++;
            } else {
                return idx;
            }
        }
        return -1;
    }
}
