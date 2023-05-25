import java.util.Scanner;

public class prog181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        int len = ch.length;

        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            } else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        for (char s : ch) {
            System.out.print(s);
        }
    }
}
