public class prog181915 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        String[] ms = my_string.split("");
        for (int i : index_list) {
            answer.append(ms[i]);
        }
        return answer.toString();
    }
}
