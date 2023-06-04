import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    /*
    * 메모리 : 100524KB
    * 시간:	868ms
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            long num2 = Long.parseLong(br.readLine());
            BigInteger bi = new BigInteger(String.valueOf(num2));

            if (bi.isProbablePrime(10)) {
                sb.append(num2).append("\n");
            } else {
                sb.append(bi.nextProbablePrime()).append("\n");
            }
        }
        System.out.println(sb);

    }
    // : 숫자는 음수가 아니어야 하며 너무 크지 않아야 합니다
    // https://www.geeksforgeeks.org/biginteger-nextprobableprime-method-in-java-with-examples/
}

