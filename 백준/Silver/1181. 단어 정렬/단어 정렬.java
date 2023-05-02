import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            treeSet.add(br.readLine());
        }

        treeSet.stream().sorted()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);


    }
}
