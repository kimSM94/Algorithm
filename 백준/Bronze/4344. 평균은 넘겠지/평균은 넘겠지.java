import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] firstArr;


        // 처음 각 케이스 받기
        int firstCase = Integer.parseInt(br.readLine());

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
                firstArr[j] =score;
                sum += score;
            }
            double mean = (sum / secondCase);

            for (int j = 0; j < secondCase; j++) {
                if (firstArr[j] > mean) {
                    count++;
                }
            }
            total =String.format("%.3f",(count/ secondCase)*100)+"%";
            sb.append(total +"\n");


        }

        System.out.println(sb);


    }
}
