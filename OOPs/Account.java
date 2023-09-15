package OOPs;

import java.util.HashMap;

import java.util.ArrayList;

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

    public String toString(){
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
        ArrayList<BankAccount> accountList = new ArrayList<>();  // Create an ArrayList to hold BankAccount objects

        BankAccount somiAccount = new BankAccount(2305, false, "Somi", "Address1", "9983740438");
        somiAccount.setAddress("A219, KV Society Noida");
        somiAccount.setPhone("9983740438");
        somiAccount.setBalance(2348620);
        accountList.add(somiAccount);
        
        BankAccount johnAccount = new BankAccount(2306, false, "John", "Address2", "9983740439");
        johnAccount.setAddress("4k09, Patel Sadan, Jammu");
        johnAccount.setPhone("98764432");
        johnAccount.setBalance(73629);
        accountList.add(johnAccount);

        BankAccount tomAccount = new BankAccount(2308, false, "Tom", "Address2", "9983740439");
        tomAccount.setAddress("4k09, Patel Sadan, Jammu");
        tomAccount.setPhone("98764432");
        tomAccount.setBalance(73629);
        accountList.add(johnAccount);
        System.out.println("---------");
        for (BankAccount account : accountList) {
            System.out.println(account);
            System.out.println("----------");


        }
        
    }
    
}
