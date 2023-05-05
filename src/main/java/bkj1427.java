import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bkj1427 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] str = st.split("");

        Arrays.sort(str, Comparator.reverseOrder());
        for (String s : str) {
            System.out.print(s);
        }
    }
}
