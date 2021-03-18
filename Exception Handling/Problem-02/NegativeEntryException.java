//Definition of Negative Enter Exception
public class NegativeEntryException extends Exception {
    NegativeEntryException(){
        super("Amount cann't be negative");
    }
    NegativeEntryException(String msg){
        super(msg);
    }

}
