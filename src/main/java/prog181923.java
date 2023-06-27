public class prog181923 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];
            int idx = 0;
            for (int[] sek : queries){
                int s = sek[0];
                int e = sek[1];
                int k = sek[2];

                int min = 1000000;
                for (int i = s; i <= e; i++){
                    if(arr[i]>k){

                        min = Math.min(min,arr[i]);
                    }

                }
                answer[idx++] = (min == 1000000 ? -1:min);
            }


            return answer;
        }
    }
}
