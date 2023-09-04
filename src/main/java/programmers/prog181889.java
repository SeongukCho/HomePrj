package programmers;

public class prog181889 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
