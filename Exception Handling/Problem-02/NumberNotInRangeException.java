public class NumberNotInRangeException extends Exception{
    NumberNotInRangeException(){
        super("You cann't withdraw more than 1 lakh at a time");
    }
    NumberNotInRangeException(String msg){
        super(msg);
    }
}
