package 백준.old;

import java.util.Scanner;

public class 약수의_합 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int sum = 0;
        int a = sc.nextInt();


        sc.close();


        for(int i=1; i<=a; i++){
            if((a%i) ==0) {
                //System.out.print(i);
                sum += i;
            }
        }
        System.out.println(sum);

    }

}
