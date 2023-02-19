package 백준.S20230130;

import java.util.Scanner;

public class 별찍기2 {
    public static void main(String[] args) {

        /*
        * https://www.acmicpc.net/problem/2439
        * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = a; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}