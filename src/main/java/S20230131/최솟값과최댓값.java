package S20230131;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최솟값과최댓값 {

    /*
     * 주소 : https://www.acmicpc.net/problem/10818
     * 문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     * 입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
     *       둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
     *        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
     * 출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 0;
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);

        bw.write(arr[0] + " " + arr[N-1]);

        bw.flush();
        bw.close();
        br.close();
    }
}
