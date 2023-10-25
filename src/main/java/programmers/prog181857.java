package programmers;

public class prog181857 {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int x = 0;
        while(len > Math.pow(2,x)){
            x++;
        }
        int[] answer = new int[(int)Math.pow(2,x)];
        for(int i = 0; i < len;i++){
            answer[i] = arr[i];
        }

        return answer;
    }
}
