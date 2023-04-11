import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bkj5522 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        sc = new Scanner(sc.nextLine()).useDelimiter(",\\s*");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
        System.out.println("평균 값 : " + sum / (float) arr.length);
    }
}