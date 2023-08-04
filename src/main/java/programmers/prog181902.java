package programmers;

public class prog181902 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if ((int) my_string.charAt(i) == 65 + j) {
                    answer[j]++;
                }
            }
        }
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if ((int) my_string.charAt(i) == 97 + j) {
                    answer[j + 26]++;
                }
            }
        }
        return answer;
    }
}
