//Todo:Write a program in Java to show the use of try,catch and finally which show the system defined exceptions

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int number;
        Scanner scan = new Scanner(System.in);
        Calculation obj = new Calculation();
        System.out.println("Enter any number:");
        number=scan.nextInt();
        try{
            obj.divide(number);
        }catch (ArithmeticException e){
            System.out.println("OOPS!!!!!!!!Exception Occurred:=>>"+e.getMessage());
        }finally {
            System.out.println("Enter another number except 0:");
            number=scan.nextInt();
            obj.divide(number);


        }

    }
}
