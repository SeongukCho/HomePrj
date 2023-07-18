package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bkj10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int len = st.length();
        String reverse = "";

        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + st.charAt(i);
        }

        if (st.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
