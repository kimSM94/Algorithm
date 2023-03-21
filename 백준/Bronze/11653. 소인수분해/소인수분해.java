
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int number = 2;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            if(num==1) break;

            if (num%number==0){
                num = num / number;
                list.add(number);
                number = 2;
            }else{
                number++;
            }
        }

        for(int factorization : list){
            System.out.println(factorization);
        }




    }
}
