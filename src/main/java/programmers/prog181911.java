package programmers;

public class prog181911 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int a, b;
        for (int i = 0; i < parts.length; i++) {
            a = parts[i][0];
            b = parts[i][1];
            answer += my_strings[i].substring(a,b+1);
        }
        return answer;
    }
}
