package Exception_assignment;
import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args)
    {
        String[] names = {"Sreylin", "Sreyka","Sreyvy", "Sreyta","Vanry", "Sambath", "Sokha", "Sreymey", "Theara", "Sokly"};


        try
        {
            System.out.println("Please, enter an integer from 1 to 10 to display a name");
            Scanner input= new Scanner(System.in);
            int i = input.nextInt();
            i = i-1;
            System.out.println(names[i]);
            input.close();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your number is out of range");
        }

    }
}
