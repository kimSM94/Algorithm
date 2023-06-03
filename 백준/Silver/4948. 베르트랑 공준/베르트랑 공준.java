

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();



        while (true) {
            int count = 0;
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            make_prime(num);


            for (int i = num + 1; i <= num* 2; i++) {
                if (prime[i] == false) {    // 소수(false)일 경우 출력
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }

    public static void make_prime(int num) {

        prime = new boolean[num*2 + 1];	// 0 ~ N
		/*
		소수가 아닌 index = true
		소수인 index = false
		*/

        // 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
        prime[0] = prime[1] = true;

        // 제곱근 함수 : Math.sqrt()
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {

            // 이미 체크된 배열이면 다음 반복문으로 skip
            if (prime[i] == true) {
                continue;
            }

            // i 의 배수들을 걸러주기 위한 반복문
            for (int j = i * i; j < prime.length; j +=  i) {
                prime[j] = true;
            }
        }

    }


}
