package programmers;

public class prog181904 {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = new String[(my_string.length()/m)];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = my_string.substring(m*i,m*(i+1));
            answer.append(strArr[i].charAt(c - 1));
        }
        return answer.toString();
    }
}
