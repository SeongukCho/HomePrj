package programmers;

public class prog181875 {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < answer.length; i++){
            if(i%2 == 0) answer[i] = strArr[i].toLowerCase();
            else answer[i] = strArr[i].toUpperCase();
        }
        return answer;
    }
}
