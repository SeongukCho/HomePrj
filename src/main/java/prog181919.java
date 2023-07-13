import java.util.ArrayList;

public class prog181919 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while ( n != 1) {
            list.add(n);
            if ( n % 2 == 0){
                n = n / 2;
            } else {
                n = 3* n + 1;
            }
        }
        list.add(1);
        int[] answer = new int[list.size()];
        int idx = 0;
        for (int i : list){
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}
