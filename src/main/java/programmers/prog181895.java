package programmers;

public class prog181895 {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
        int[] answer = new int[length];

        int count = 0;
        int a;

        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[count++] = arr[i];
        }

        for(int i = intervals[1][0]; i <= intervals[1][1]; i++){
            answer[count++] = arr[i];
        }


        return answer;
    }
}
