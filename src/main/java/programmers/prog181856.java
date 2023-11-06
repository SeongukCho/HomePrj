package programmers;

public class prog181856 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int aSum = 0;
        for (int i : arr1) {
            aSum += i;
        }
        int b = arr2.length;
        int bSum = 0;
        for (int i : arr2) {
            bSum += i;
        }
        if (a != b) {
            if (a > b) answer = 1;
            else answer = -1;
        } else {
            answer = Integer.compare(aSum, bSum);
        }
        return answer;
    }
}
