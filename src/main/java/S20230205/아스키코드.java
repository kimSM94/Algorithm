package S20230205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아스키코드 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char num = br.readLine().charAt(0);

        System.out.println(solution(num));
        br.close();

    }

    static int solution(char num) {

        int num2 = (int) num;

        return num2;
    }

}
