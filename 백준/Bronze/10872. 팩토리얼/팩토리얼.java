import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int sum = factorial(num);
        System.out.println(sum);
    }

    static int factorial(int num) {
        if(num<2) return 1;
        return num * factorial(num - 1);
    }

}
