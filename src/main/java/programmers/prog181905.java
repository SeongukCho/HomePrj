package programmers;

public class prog181905 {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (s <= i && i <= e) {
                answer.append(my_string.charAt(e + s - i));
            } else {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}
