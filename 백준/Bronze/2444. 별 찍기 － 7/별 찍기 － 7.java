
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int result = 2 * (num - 1);

        for (int i = 1; i <= num; i++) {

            for (int j = num; j >= i; j--) {

                if(j==i){
                    if(j==1){
                        System.out.print("*");
                    }else {
                        System.out.print("*".repeat(j * 2 - 1));
                    }

                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        for (int i = num-1; i >= 1; i--) {

            for (int j = num; j >= i; j--) {
                    //j =  5, 5
                if(j==i){
                    if(j==1){
                        System.out.print("*");
                    }else {
                        System.out.print("*".repeat(j * 2 - 1));
                    }

                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }


    }


}
