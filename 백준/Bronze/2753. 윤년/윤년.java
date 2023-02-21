import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int A = Integer.parseInt(s);

        if(A%4 == 0 && A % 100 != 0 || A % 400 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }


    }
}