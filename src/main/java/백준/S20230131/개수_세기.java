package 백준.S20230131;

import java.io.*;
import java.util.StringTokenizer;

class 개수_세기 {

    /*
        * 주소 : https://www.acmicpc.net/problem/10807
        * 문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
        *      :  첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
        * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int count = 0;

        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
