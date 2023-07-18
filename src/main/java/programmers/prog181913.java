package programmers;

public class prog181913 {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        char temp;
        for (int[] query : queries) {
            for (int i = query[0]; i <= (query[0] + query[1]) / 2; i++) {
                temp = arr[i];
                arr[i] = arr[query[0] + query[1] - i];
                arr[query[0] + query[1] - i] = temp;
            }
        }
        return String.valueOf(arr);
    }
}
