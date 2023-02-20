import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());


        int hr = Integer.parseInt(st1.nextToken());  //시간
        int mm = Integer.parseInt(st1.nextToken()); //분

        int time = Integer.parseInt(st2.nextToken());


        int test = hr*60 + mm;

        test +=time;

        int hour = (test / 60) % 24;
        int minute = test % 60;

        System.out.println(hour+ " " + minute);
    }
}