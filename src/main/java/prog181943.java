public class prog181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String a = my_string.substring(0,s);
        String b = my_string.substring(overwrite_string.length()+s);

        answer = a + overwrite_string + b;

        return answer;
    }
}
