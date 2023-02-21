import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer hr = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(hr.nextToken());  //시간
        int b = Integer.parseInt(hr.nextToken()); //분

        if(b<45){
            a--;
            b = 60 - (45 - b);
            if(a<0){
                a = 23;
            }
            System.out.println(a + " " + b);
        }
        else{
            System.out.println(a+ " " + (b-45));
        }

    }
}