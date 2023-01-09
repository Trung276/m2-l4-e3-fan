import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int status = 0;
        Fan fan = new Fan();
        while (status != 3) {
            System.out.println("Choose the fan:");
            System.out.println("1. FAN 1st");
            System.out.println("2. FAN 2nd");
            System.out.println("3. Exit program");
            status = sc.nextInt();
            if (status == 1) {
                fan.setOn(true);
                fan.setSpeed(Fan.FAST);
                fan.setRadius(10);
                fan.setColor("yellow");
                System.out.println(fan.toString());
            }
            if (status == 2) {
                fan.setOn(false);
                fan.setSpeed(Fan.MEDIUM);
                fan.setRadius(5);
                fan.setColor("blue");
                System.out.println(fan.toString());
            }
        }
    }
}
