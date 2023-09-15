package OOPs;

class Bank{
    private int AccountNum;
    private boolean Close;
    private String Name;
    private String Address;
    private int Phone;
    private double Balance;
}

class SavingsAccount extends Account{
    public double Deposit;
    public double Withdraw;


}

class LoanAccount extends Account{
    public double payEMI;
    
}
public class Account {
    
}
