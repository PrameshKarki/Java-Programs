//TODO:Write a program in Java to define a class,describe the Constructor,overload the constructor & instantiate the Object
//Main Class
public class Problem1_OOP {
    //Main Method
    public static void main(String[] args) {
        System.out.println("Information of first student:");
        //Instantiate object
        Student newStudent=new Student("Pramesh Karki","Science And Technology","Computer",19,false);
        newStudent.display();
        System.out.println("Information of undefined student:");
        //Instantiate object
        Student undefinedStudent=new Student();
        undefinedStudent.display();

    }

}
//Student Class
class Student{
    //Instance variable
     String name,faculty,department;
     int age;
     boolean isHandicapped;
    //Default Constructor
    Student(){
        this.name="undefined";
        this.faculty="undefined";
        this.department="undefined";
        this.isHandicapped=false;
        this.age=0;
    }
    //Parameterized Constructor
    Student(String givenName,String givenFaculty,String givenDepartment,int givenAge,boolean givenIsHandicapped ){
        this.name=givenName;
        this.faculty=givenFaculty;
        this.department=givenDepartment;
        this.isHandicapped=givenIsHandicapped;
        this.age=givenAge;
    }
    //Method for displaying information
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Faculty:"+faculty);
        System.out.println("Department:"+department);
        System.out.println("IsHandicapped:"+isHandicapped);
    }

}
//Pramesh Karki
//github.com/Prameshkarki
