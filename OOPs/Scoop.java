package OOPs;

class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qnt;

    public Product(String itemno){
        itemNo = itemno;
    }
    public Product(String itemno, String name, double price, int qnt){
        itemNo = itemno;
        this.name = name;
        setprice(price);
        setqnt(qnt);
    }
    public void setprice(double price){
        this.price = price; 
    }
    public void setqnt(int q){
        this.qnt = q;
    }

    public String getitemNo(){
        return itemNo;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int qetQnt(){
        return qnt;
    }

    public String toString(){
        return "ItemName :"+itemNo+"\n"+"Name :"+name+"\n"+"Price :"+price+"\n"+"Quantity :"+qnt;
    }
}

public class Scoop {
    public static void main(String[] args) {
        Product p = new Product("AT1", "Sugar", 50.0, 1);
        p.setprice(62.0);
        System.out.println(p);

    }
}
