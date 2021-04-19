public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(){
        super("Insufficient Balance");
    }
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
