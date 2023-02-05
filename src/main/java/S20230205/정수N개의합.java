package S20230205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정수N개의합 {
    /*
    * 주소 : https://www.acmicpc.net/problem/15596
    * 문제 : 정수 N개의 합
    * */

    public long sum(int[] a){
        long sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        정수N개의합 soluiton = new 정수N개의합();
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num];

        for (int i = 0; i <num; i++) {
            a[i] = i+1;
        }
        soluiton.sum(a);
    }
}
