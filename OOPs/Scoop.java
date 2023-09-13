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

public class Scoop {
    public static void main(String[] args) {
        Product p = new Product("AT1", "Sugar");
        p.setprice(-62.0);
        System.out.println(p);

    }
}
