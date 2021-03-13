//TODO:Write a program in Java to demonstrate the concepts of Sub Class
public class Problem4_OOP {
    public static void main(String[] args) {
        MedicalUser newUser=new MedicalUser("Pramesh Karki",19,"Doctor");
        newUser.display();
        newUser.greet();

    }
}
class User{
    String fullName;
    int age;
    User(){
        fullName="undefined";
        age=0;
    }
    User(String givenFullName,int givenAge){
        fullName=givenFullName;
        age=givenAge;
    }
     void display(){
        System.out.println("Full Name:"+fullName);
        System.out.println("Age:"+age);
    }
    void greet(){
        System.out.println("Hello!I am from base class");
    }
}
class MedicalUser extends User{
    String department;
    MedicalUser(){
        department="undefined";
    }
    MedicalUser(String givenFullName,int givenAge,String givenDepartment){
        super(givenFullName,givenAge);
        department=givenDepartment;
    }
     void display(){
        super.display();
        System.out.println("Department:"+department);
         System.out.println("Thank You!!!");
    }

}
