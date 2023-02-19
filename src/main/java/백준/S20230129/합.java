package 백준.S20230129;


import java.util.Scanner;

public class 합 {

    public double solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        합 solution = new 합();
        Scanner sc = new Scanner(System.in);
        sc.close();
        int test = sc.nextInt();
        solution.solution(test);
    }



}
