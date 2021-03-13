//TODO:Write a program in Java to define a class,define instance methods for setting and retrieving values of instance variable & instantiate its objects.
import java.util.Scanner;

public class Problem2_OOP {
    //Main Method
    public static void main(String[] args) {
        System.out.println("Info of default player:");
        Player newPlayer=new Player();
        newPlayer.display();
        System.out.println("---Player Info---");
        Player firstPlayer=new Player("AB De Villiers","South Africa",35);
        firstPlayer.display();
        System.out.println("---Player Info---");
        Player secondPlayer=new Player();
        secondPlayer.set("Imran Tahir","South Africa",36);
        secondPlayer.display();
        System.out.println("---Third Player---");
        Player thirdPlayer=new Player();
        thirdPlayer.getData();
        thirdPlayer.display();

    }

}
class Player{
     String fullName,country;
     int age;
    Player(){
        this.fullName="undefined";
        this.country="undefined";
        this.age=0;
    }
    Player(String givenFullName,String givenCountry,int givenAge){
        this.fullName=givenFullName;
        this.country=givenCountry;
        this.age=givenAge;
    }
    void display(){
        System.out.println("Full Name:"+fullName);
        System.out.println("Country:"+country);
        System.out.println("Age:"+age);
    }
    void set(String givenFullName,String givenCountry,int givenAge){
        fullName=givenFullName;
        country=givenCountry;
        age=givenAge;

    }
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Full Name:");
        fullName=sc.nextLine();
        System.out.print("Enter Country:");
        country=sc.nextLine();
        System.out.print("Enter Age:");
        age=sc.nextInt();

    }

}
//PrameshKarki
//github.com/PrameshKarki
