public class prog181939 {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s11 = s1 + s2;
        String s22 = s2 + s1;
        answer = Math.max(Integer.parseInt(s11), Integer.parseInt(s22));
        return answer;
    }
}
