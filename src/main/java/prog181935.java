public class prog181935 {
    public int solution(int n) {
        int a = 2;
        int b = 1;
        int answer = 0;
        if (n % 2 == 1) {
            while (b <= n) {
                answer += b;
                b += 2;
            }
        } else {
            while (a <= n) {
                answer += a * a;
                a += 2;
            }
        }
        return answer;
    }
}
