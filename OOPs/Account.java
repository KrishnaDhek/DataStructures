package OOPs;

class BankAccount{
    private int AccountNum;
    private boolean Close;
    private String Name;
    private String Address;
    private String Phone;
    private double Balance;

    public BankAccount(int ac, boolean cl, String n, String ad, String p){
        this.AccountNum = ac;
        this.Close = cl;
        this.Name = n;
        this.Address = ad;
        this.Phone = p;
        this.Balance =0.0;
    }

    public int getAccountNum(){ 
        return AccountNum;
    }

    public boolean getClose(){
        return Close;
    }
    public String getName(){
        return Name;
    }
    public String getAddress( ){
        return Address;
    }
    public String getPhone(){
        return Phone;
    }

    public double getBalance(){
        return Balance;
    }

    public void setBalance(double b){
        this.Balance =b;
    }
    public void setAddress(String A){
         this.Address = A;
    }
    public void setPhone(String p){
        this.Phone = p;
    }

    public String Details(){
        return "AccNum :" +AccountNum+"\n"+"Status :"+(Close ? "Closed" : "Open")+"\n"+"Name :"+Name+"\n"+"Address :"+Address+"\n"+"Phone Num :"+Phone+"\n"+"Balance :"+Balance;
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(int ac, boolean al,String n, String ad, String p){
        super(ac, al, n, ad, p);
    }
    public void deposit(int a){
        if(a>0){
            setBalance(getBalance()+a);
        }
        else{
            System.out.println("Deposit amount should be positive");
        }
    }
    public void withdraw(int a){
        if(a>0 && a<=getBalance()){
            setBalance(getBalance()-a);
        }else{
            System.out.println("Invalid Withdrawl Amount");
        }
    }


}

class LoanAccount extends BankAccount{
    public LoanAccount(int a, boolean cl, String n, String ad, String p){
        super(a, cl, n, ad, p);
    }
    public void payEMI(double a){
        if(a>0){
            setBalance(getBalance()-a);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    
}
public class Account {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2305, false, "Somi",null , null);
        bankAccount.setAddress("A219,KV Society Noida");
        bankAccount.setPhone("9983740438");
        bankAccount.setBalance(2348620);
        System.out.println(bankAccount.Details());
        

        
    }
    
}
