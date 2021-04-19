//TODO:
// 1>Write a program in Java to show the concepts of User defined exception(InsufficientBalanceException).
// 2>Write a program in java to show the concepts of User defined exception(NegativeEntryException).
// 3>Write a program in Java to show the concepts of USer defined exception(NumberNotInRangeException).
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Amount obj=new Amount();

        double money;

        System.out.println("Enter amount to deposite:");
        money=scan.nextDouble();
        try {
            obj.deposit(money);
        }catch (NegativeEntryException e){
            System.out.println("OOPS!!! Exception occured:=>"+e.getMessage());
        }

        obj.display();

        System.out.println("Enter amount to withdraw:");
        money=scan.nextDouble();
        try{
            obj.withdraw(money);
        }catch(InsufficientBalanceException e){
            System.out.println("OOPS!!!! Exception Occurred:=>"+e.getMessage());
        }catch(NegativeEntryException e){
            System.out.println("OOPS!!! Exception Occurred:=>"+e.getMessage());
        }
        catch(NumberNotInRangeException e){
            System.out.println("OOPS!!! Exception Occurred:=>"+e.getMessage());
        }
        finally {
            obj.display();
        }

    }
}
