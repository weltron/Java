import java.util.Scanner;
import java.util.Scanner.*;
public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time offset to GMT: ");
        int offset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = ((totalHours + offset) % 24);

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
