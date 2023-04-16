import java.io.*;
import java.util.StringTokenizer;

public class bkj5522 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        sc = new Scanner(sc.nextLine()).useDelimiter(",\\s*");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼리더 클래스로 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine(), ", ");

        int arr[] = new int[5]; // 5의 크기를가진 정수형 배열 생성

        for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 반복문 실행
            arr[i] = Integer.parseInt(st.nextToken()); // StringTokenizer로 토큰화된 문자열들을
            //  정수형으로 변환하여arr[i] 배열에 대입함
        }
        br.close();

        int max = arr[0]; // 정수형 변수 max를 선언하고 배열의 첫번째 원소를 대입함

        for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 반복문 실행
            if (arr[i] > max) { // i+1번째 원소의 값이 max값보다 크다면
                max = arr[i]; // 그 원소를 max 변수에 대입함
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