package programmers;

public class prog181865 {
    class Solution {
        public int solution(String binomial) {
            int answer = 0;
            int idx1 = 0;
            int idx2 = 0;
            int idx3 = 0;
            idx1 = binomial.indexOf("+");
            idx2 = binomial.indexOf("-");
            idx3 = binomial.indexOf("*");
            int a, b;
            if(idx1 > 0){
                a = Integer.parseInt(binomial.substring(0 , idx1-1));
                b = Integer.parseInt(binomial.substring(idx1+2,binomial.length()));
                answer = a + b;
            } else if(idx2 > 0){
                a = Integer.parseInt(binomial.substring(0 , idx2-1));
                b = Integer.parseInt(binomial.substring(idx2+2,binomial.length()));
                answer = a - b;
            } else if(idx3 > 0){
                a = Integer.parseInt(binomial.substring(0 , idx3-1));
                b = Integer.parseInt(binomial.substring(idx3+2,binomial.length()));
                answer = a * b;
            }

            return answer;
        }
    }
}
