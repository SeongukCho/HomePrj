package baekjoon;

import java.util.Scanner;

public class bkj4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sta = sc.nextLine();
        int lenA = sta.length();
        String stb = sc.nextLine();
        int lenB = stb.length();

        if (lenA >= lenB) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
