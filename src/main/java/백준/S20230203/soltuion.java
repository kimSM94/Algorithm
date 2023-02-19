package 백준.S20230203;

import java.util.Scanner;

public class soltuion {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String startTime = sc.nextLine();
        int cookingTime = sc.nextInt();

        sc.close();

        int startHour = Integer.parseInt(startTime.substring(0, 2));
        int startMinute = Integer.parseInt(startTime.substring(3));
        System.out.println("startHour + startMinute");
        System.out.println(startHour + " " + startMinute);
        int minuteTime = startMinute + cookingTime;

        int endHour = startHour + (minuteTime / 60);
        int endMinute = (minuteTime % 60);
        System.out.println(50/60);
        if (endHour >= 24) {
            endHour = endHour % 24;
        }

        System.out.print(endHour + " " + endMinute);

    }

}
