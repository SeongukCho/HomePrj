package programmers;

public class prog181887 {
    public int solution(int[] num_list) {
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < num_list.length; i++){
            if(i%2 == 0){
                oddsum += num_list[i];
            } else{
                evensum += num_list[i];
            }
        }
        return Math.max(evensum, oddsum);
    }
}
