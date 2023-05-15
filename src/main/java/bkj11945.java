import java.util.Scanner;

public class bkj11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            while (sc.hasNext()) {
                StringBuilder sb = new StringBuilder(sc.next());
                System.out.println(sb.reverse());
            }
        }
    }
}
