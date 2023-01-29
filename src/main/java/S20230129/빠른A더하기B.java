package S20230129;

import java.io.*;
import java.util.StringTokenizer;

public class 빠른A더하기B {

    /*
     * 주소 : https://www.acmicpc.net/problem/15552
     * 백준 : 15552번
     * 문제 :
     * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
     * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된
     * 또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다.
     * 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
     * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
     * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
     * */



    public static void main(String[] args) throws IOException {
        빠른A더하기B solution = new 빠른A더하기B();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String total = br.readLine();

        int test = Integer.parseInt(total);

        StringTokenizer st;
        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());

            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");

        }
        bw.flush();  // 남아있는 데이터를 모두 출력시킴
        bw.close();  // 스트림을 닫음


    }
}
