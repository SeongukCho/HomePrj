package programmers;

public class prog181892 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[n-1];
            n++;
        }
        return answer;
    }
}