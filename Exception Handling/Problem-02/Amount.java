public class Amount {
    double currentBalance;
    Amount(){
        currentBalance=0.0;
    }
    public void deposit(double depostiedMoney) throws NegativeEntryException{
        if(depostiedMoney<0){
            throw new NegativeEntryException();
        }else{
            currentBalance+=depostiedMoney;
            System.out.println("Balance Deposited Sucessfully");
        }
        currentBalance+=depostiedMoney;
    }
    public void withdraw(double withdrawnMoney) throws InsufficientBalanceException,NegativeEntryException,NumberNotInRangeException{
       if(withdrawnMoney>100000){
           throw new NumberNotInRangeException();
       }

        else if(withdrawnMoney<0){
           throw new NegativeEntryException();
       }

        else if(withdrawnMoney>currentBalance){
            throw new InsufficientBalanceException();
        }else {
            currentBalance-=withdrawnMoney;
            System.out.println("Balance Withdrawn Sucessfully");
        }
    }
    public void display(){
        System.out.println("Current Balance:"+currentBalance);
    }
}
