package S20230209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 다이얼 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//        System.out.println((char)65);

        String word = br.readLine();
        int count =0;
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            for (int k = 1; k <= 10; k++) {

                for (int a = 0; a < 3; a++) {
                    if(word.charAt(i)==(char)(65+a)){
                        System.out.println("word.charAt(i) = "+word.charAt(i));
                        System.out.println("(char)(65+a)"+(char)(65+a));
                        sum += (k+2);
                        System.out.println(sum);
                    }
                }

            }

        }
//        System.out.println(sum);
    }




}
