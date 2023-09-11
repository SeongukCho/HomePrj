package programmers;

public class prog181882 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int idx = 0;
        for (int a : arr){
            if ((a < 50)&&(a%2==1)){
                answer[idx]=a*2;
            } else if ((a >= 50)&&(a%2==0)){
                answer[idx]=a/2;
            } else {
                answer[idx]=a;
            }
            idx++;
        }
        return answer;
    }
}
