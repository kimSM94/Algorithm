import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int M = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {

            int number = i;
            int tmp = 0;
            // 브루트포스 방식

            while (number != 0) {
                tmp += number % 10;
                number /= 10;
                /*System.out.println("i =" + i +", tmp = "+tmp);*/
            }
            // 생성자 찾았을때
            if (tmp + i == num) {
                M = i;
                break;
            }

        }
        System.out.print(M);
    }
}
