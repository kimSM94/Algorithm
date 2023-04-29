import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());

        int count = 0;

        while(true){
            if(num%5 == 0) {
                count += num/5;
                break;
            }

            num -= 3;
            count++;

            if(num < 0) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}