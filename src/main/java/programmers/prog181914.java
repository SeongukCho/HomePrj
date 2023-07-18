package programmers;

public class prog181914 {
    public int solution(String number) {
        int answer = 0;
        String[] str = number.split("");
        for (int i = 0; i < str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        answer = answer%9;
        return answer;
    }
}
