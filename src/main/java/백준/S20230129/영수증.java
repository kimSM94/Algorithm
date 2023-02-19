package 백준.S20230129;

import java.util.Scanner;

public class 영수증 {


    /*
     * 주소 : https://www.acmicpc.net/problem/25304
     * 백준 : 25304번
     * 문제 : 구매한 각 물건의 가격과 개수,구매한 물건들의 총 금액을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
     * 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
     * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
     * 이후 N개의 줄에는 각 물건의 가격 a와 개수  b가 공백을 사이에 두고 주어진다.
     * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다
     * */
    public String solution(int total, int sum){
        String answer;

        if (sum == total) {
            answer = "Yes";
        }else{
            answer = "No";
        }

        System.out.println(answer);

        return (String)answer;
    }

    public static void main(String[] args) {
        영수증 soluton = new 영수증();

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();

        int sum = 0;
        for (int i= 0; i <count;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum += A * B;
        }
        sc.close();

        soluton.solution(total,sum);


    }

}
