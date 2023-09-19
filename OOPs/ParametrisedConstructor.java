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
            case "ambhibian":
            System.out.println("Animal belongs to ambhinian category");
            break;
            default:
            System.out.println("Animal category un-known");
            break;
        }
       
    }

}



public class ParametrisedConstructor {
    
}
