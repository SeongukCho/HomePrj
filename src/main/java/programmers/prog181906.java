package programmers;

public class prog181906 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] preStr = new String[my_string.length()];
        for (int i = 0; i < my_string.length()-1; i++) {
            preStr[i] = my_string.substring(0,i+1);
        }
        for (String a : preStr) {
            if (is_prefix.equals(a)) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}
