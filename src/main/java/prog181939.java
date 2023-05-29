public class prog181939 {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s11 = s1 + s2;
        int s22 = 2*a*b;
        answer = Math.max(Integer.parseInt(s11), s22);
        return answer;
    }
}
