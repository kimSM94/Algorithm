package S20230130;

import java.io.*;
import java.util.StringTokenizer;

public class A더하기B마이너스4 {

    /*
     * 주소 : https://www.acmicpc.net/problem/10951
     *
     * 이 번 문제의 키 포인트는 문제를 자세히 보면 몇 개를 입력받는지 알 수 없다는 것이다.
       이렇게 주어진 입력 파일만 갖고 입력을 받을 때 더이상 읽을 수 있는 데이터가 없는 경우
     * 즉, 파일의 끝일 때 이를 EOF(End Of File) 이라고 한다
     * 모든 줄 입력을 마친 뒤, 줄에 아무것도 없는 상태에서 Ctrl + D */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();

        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append("\n");
        }
        System.out.println(sb);


    }
}
