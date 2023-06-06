public class prog181932 {
    class Solution {
        public String solution(String code) {
            String answer = "";
            boolean mode = false;
            for (int i = 0; i < code.length();i++){
                if(code.charAt(i)== '1'){
                    if(mode == false) mode = true;
                    else mode = false;
                } else if(mode == true&&i%2!=0) {
                    answer += code.charAt(i);
                } else if(mode == false&&i%2==0) {
                    answer += code.charAt(i);
                }
            }
            if(answer == ""){
                return "EMPTY";
            }
            return answer;
        }
    }
}
