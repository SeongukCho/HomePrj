public class prog181927 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length+1];
            int a = num_list[num_list.length-2];
            int b = num_list[num_list.length-1];

            for(int i = 0; i<num_list.length; i++){
                answer[i] = num_list[i];
            }
            answer[answer.length-1] = a < b ? b-a : b*2;
            return answer;
        }
    }
}
