package programmers;

public class prog181908 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] strArr = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            strArr[i] = my_string.substring(i);
        }

        for (String s : strArr) {
            if (s.equals(is_suffix)) {
                answer = 1;
                break;
            } else answer = 0;
        }

        return answer;
    }
}
