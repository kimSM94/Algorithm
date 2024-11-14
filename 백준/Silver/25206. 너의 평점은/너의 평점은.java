import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double number = 0;
        for (int i = 0; i < 20; i++) {

            String text = br.readLine();
            String word = text.substring(text.length() - 6, text.length()).trim();
            String word2 = text.substring(text.length() - 5, text.length()).trim();
            double score = 0;
            String grade = word.substring(3).trim();
                score = Double.parseDouble(word.substring(0, 3));

            Map<String, Object> stringObjectMap = scoreGrade(score, grade);
            if (Double.parseDouble(stringObjectMap.get("number").toString())!=0) {
                sum += Double.parseDouble(stringObjectMap.get("score").toString());
                number += Double.parseDouble(stringObjectMap.get("number").toString());
            }

        }

        System.out.println(String.format("%.6f",sum/number));


    }

    private static Map<String, Object> scoreGrade(double score, String grade) {
        Map<String, Object> map = new HashMap<>();
        double result = 0;
        int b = 0;
        if (grade.equals("A+")) {
            map.put("score", 4.5 * score);
            map.put("number", score);
        } else if (grade.equals("A0")) {
            result = 4.0 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("B+")) {
            result = 3.5 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("B0")) {
            result = 3.0 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("C+")) {
            result = 2.5 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("C0")) {
            result = 2.0 * score;
            map.put("score", result);
            map.put("number",score);
        } else if (grade.equals("D+")) {
            result = 1.5 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("D0")) {
            result = 1.0 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("F")) {
            result = 0 * score;
            map.put("score", result);
            map.put("number", score);
        } else if (grade.equals("P")) {
            map.put("score", 0);
            map.put("number", 0);
        }
        return map;
    }


}
