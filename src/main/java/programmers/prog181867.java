package programmers;

public class prog181867 {
    public int[] solution(String myString) {
        String[] xSplit = myString.split("x",-1);
        int[] answer = new int[xSplit.length];
        for(int i = 0; i < xSplit.length; i++){
            answer[i] = xSplit[i].length();
        }
        return answer;
    }
}
