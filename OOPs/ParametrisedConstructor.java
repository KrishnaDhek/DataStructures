package OOPs;

class Animal{
    public Animal(){
        System.out.println("This is parent class");
    }
    public Animal(String type){
        switch(type.toLowerCase()){
            case "mammal":
            System.out.println("Animal belongs to mammal category");
            break;
            case "amphibian":
            System.out.println("Animal belongs to amphibian category");
            break;
            default:
            System.out.println("Animal category un-known");
            break;
        }
       
    }

}

class Dog extends Animal{
    public Dog(String type){
        super(type); 
    }
}

public class ParametrisedConstructor {
    public static void main(String[] args) {
        
    }
}
