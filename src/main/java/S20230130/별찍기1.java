package S20230130;

import java.util.Scanner;

public class 별찍기1 {
    public static void main(String[] args) {
        /*
        * https://www.acmicpc.net/problem/2438
        * */

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0; i<N; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }

        scan.close();
    }
}
