package S20230211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = br.readLine();

        // lj, nj, dz는 한 단어

        char[] arr = new char[alphabet.length()];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] =alphabet.charAt(i);
            count++;

            if (arr[i] == '=') {
                count--;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {

            if (String.valueOf(arr[i]+""+arr[i+1]).equals(String.valueOf("l"+"j"))){
                count--;
            }else if( String.valueOf(arr[i]+""+arr[i+1]).equals(String.valueOf("n"+"j"))){
                count--;
            }else if(String.valueOf(arr[i]+""+arr[i+1]).equals(String.valueOf("d"+"z"))) {
                count--;
            }else{
                count += 0;
            }

        }
        System.out.println(count);
    }
}
