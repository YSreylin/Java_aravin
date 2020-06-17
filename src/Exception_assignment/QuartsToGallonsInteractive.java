package Exception_assignment;
import java.sql.SQLOutput;
import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {

        int q,g = 0;

        Scanner sc = new Scanner(System.in);

        while (g == 0) {
            try
            {
                System.out.print("Enter quarts : ");
                q = sc.nextInt();
                int gallon = q/4;
                int re     = q%4;
                System.out.println(gallon + " Gallons " + re +" Quarts ");
                g = 1;
            }
            catch (Exception localException)
            {
                sc.nextLine();
                System.out.println("Invalid data");
            }
        }
    }
}
