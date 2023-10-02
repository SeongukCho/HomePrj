package programmers;

public class prog181879 {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int answer = (len >= 11) ? 0 : 1;
        for(int a : num_list){
            if (len >= 11) {
                answer += a;
            } else {
                answer *= a;
            }
        }
        return answer;
    }
}
