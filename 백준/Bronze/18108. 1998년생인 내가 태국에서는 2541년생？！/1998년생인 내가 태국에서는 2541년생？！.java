import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int year = Integer.parseInt(s);
        
        System.out.println(year-543);
    }
}
