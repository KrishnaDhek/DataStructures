package OOPs;

class Product{
    private String itemNo;
    private String Name;
    private double price;
    private int qnt;

    public Product(String itemno, String name){
        itemNo = itemno;
        Name = name;
    }
    public Product(String itemno, String name, double price, int qnt){
        itemNo = itemno;
        this.Name = name;
        setprice(price);
        setqnt(qnt);
    }
    public void setprice(double price){
        if(price>0.0){
            this.price = price;
        }
        else{
            System.out.println("ERROR : Price cant be negative");
        }
    }
    public void setqnt(int q){
        this.qnt = q;
    }

    public String getitemNo(){
        return itemNo;
    }

    public String getName(){
        return Name;
    }

    public double getPrice(){
        return price;
    }

    public int qetQnt(){
        return qnt;
    }

    public String toString(){
        return "ItemName :"+itemNo+"\n"+"Name :"+Name+"\n"+"Price :"+price+"\n"+"Quantity :"+qnt;
    }
}

class Customer{
    private int custID;
    private String Name;
    private String Address;
    private int Number;

    public Customer(int id){
        custID = id;
    }
    public Customer(int id, String name){
        this.custID =id;
        this.Name =name;
    }
    public Customer(int id, String name, String address, int num){
        custID =id;
        this.Name =name;
        setAddress(address);
        setNumber(num);
    }
    public String setAddress(String address){
        return address;
    }
    public int setNumber(int num){
        return num;
    }
    public String getName(){
        return Name;
    }
    public int getcustID(){
        return custID;
    }
    public String getAddress(){
        return Address;
    }
    public int getNumber(){
        return Number;
    }
    public String toString(){
        return"CustID :"+custID+"\n"+"Name :"+Name+"\n"+"Address :"+Address+"\n"+"Phone Num. :"+Number;
    }
}

public class Scoop {
    public static void main(String[] args) {
        Product p = new Product("AT1", "Sugar");
        p.setprice(62.0);
        System.out.println("Product Details :");
        System.out.println(p);
        Customer c = new Customer(101, "Phill");
        c.setAddress("A209,Power Tower,Pune");
        c.setNumber(5085960);
        System.out.println("Customer Details :");
        System.out.println(c);

    }
}
