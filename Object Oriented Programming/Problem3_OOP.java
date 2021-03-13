//TODO:Write a program in Java to define a class,define instance methods overload then & use them for dynamic invocation
//Main Class
public class Problem3_OOP {
    //Main Method
    public static void main(String[] args) {
        //Instantiating Objects
        Utility utils=new Utility();
        double result=utils.sum(12,12);
        System.out.println("Sum is:"+result);
        result=utils.sum(12.12,12.22);
        System.out.println("Sum is:"+result);


    }


}
//Utility Class
class Utility{
    int sum(int firstNumber,int secondNumber){
        System.out.println("First Method");
        return (firstNumber+secondNumber);
    }
    double sum(double firstNumber,double secondNumber){
        System.out.println("Second Method");
        return (firstNumber+secondNumber);
    }
}
