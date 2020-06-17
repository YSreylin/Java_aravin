package Exception_assignment;

import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        try{
            System.out.println("Enter float number!");
            num = Double.parseDouble(sc.nextLine());

        }
        catch(NumberFormatException e){
            num = 0;
            System.out.println("The number is not a float number!");

        }
        System.out.println(num);
    }
}
//        System.out.println("Enter float number!");
//        String input = sc.nextLine();
//        double re = Double.parseDouble(input);
//
//        if(re == 0.0){
//            throw new NumberFormatException("The number you entered was not a floating point!");
//        }
//        else{
//            System.out.println("Number is floating point!");
//        }
//        System.out.println("Float is :" +re);
