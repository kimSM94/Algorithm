package 백준.S20230204;

import java.io.*;
import java.util.StringTokenizer;

class 평균은_넘겠지 {

    public static void main(String[] args) throws IOException {

        /*
        * 문제 : 백준 4344번
        * 주소 : https://www.acmicpc.net/problem/4344
        * 입력 : 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
                둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
                점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
          출력 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] firstArr;

        // 처음 각 케이스 받기
        int firstCase = Integer.parseInt(br.readLine());

        // 데이터 5
        for (int i = 0; i < firstCase; i++) {

            double sum = 0;
            double count = 0;
            String total;
            st = new StringTokenizer(br.readLine(), " ");

            // 그다음 학생수
            int secondCase = Integer.parseInt(st.nextToken());
            firstArr = new int[secondCase];

            for (int j = 0; j < secondCase; j++) {

                // 성적저장
                int score = Integer.parseInt(st.nextToken());

                // 그다음 평균 접수 받기
                firstArr[j] = score;
                sum += score;
            }
            double mean = (sum / secondCase);

            for (int j = 0; j < secondCase; j++) {
                if (firstArr[j] > mean) {
                    count++;
                }
            }
            total = String.format("%.3f", (count / secondCase) * 100) + "%";
            sb.append(total + "\n");


        }

        System.out.println(sb);


    }
}
