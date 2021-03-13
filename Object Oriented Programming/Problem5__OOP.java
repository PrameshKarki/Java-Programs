//TODO:Write a program in to demonstrate the concepts of inner class.
//Main Class
public class Problem5__OOP {
    //main Method
    public static void main(String[] args) {
    //Instantiating outer class
    OuterClass obj=new OuterClass();
    //Instantiating inner class
    OuterClass.InnerClass innerObj=obj.new InnerClass();
    innerObj.innerMethod();
    obj.outerMethod();


    }
}
//Outer Class
class OuterClass{
    void outerMethod(){
        System.out.println("Hy there!I am outer method");
    }
    //Inner Class
    class InnerClass{
        void innerMethod(){
            System.out.println("Hy there! I am inner method");
        }
    }
}
//PrameshKarki
//github.com/PrameshKarki
