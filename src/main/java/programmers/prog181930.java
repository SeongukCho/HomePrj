package programmers;

public class prog181930 {
    class Solution {
        public int solution(int a, int b, int c) {
            int answer = 0;
            if( a==b&&b==c) {
                answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            } else if (a==b&&b!=c){
                answer = (a+b+c)*(a*a+b*b+c*c);
            } else if (b==c&&c!=a){
                answer = (a+b+c)*(a*a+b*b+c*c);
            } else if (c==a&&a!=b){
                answer = (a+b+c)*(a*a+b*b+c*c);
            } else if(a!=b&&b!=c){
                if(a!=c){
                    answer = a+b+c;
                }
            }

            return answer;
        }
    }
}
