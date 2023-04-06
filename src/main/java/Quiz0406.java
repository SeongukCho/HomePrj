import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Quiz0406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = str.charAt(i) - 48;
        }

        Arrays.sort(arr);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }
}
