import java.util.Scanner;


public class 크기가_작은_부분문자열 {

    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);


        String t =  sc.next();
        String p =  sc.next();

        // 문자열을 p의 길이만큼 a를 자르고 그 자른 값을 int 값으로 변경해 t<=p  result +=1

        int anwser = 0;

        for(int i=0; i<t.length()-p.length();i++){
            if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)){
                anwser++;
            }

        }
        System.out.println(anwser);

    }
}
