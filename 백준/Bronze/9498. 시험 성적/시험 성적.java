import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());

        if(A>=90){
            System.out.println("A");
        }else if(A>=80){
            System.out.println("B");
        }else if(A>=70){
            System.out.println("C");
        }else if(A>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}