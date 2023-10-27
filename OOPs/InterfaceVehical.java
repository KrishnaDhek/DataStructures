package OOPs;

/**
 * InnerInterfaceVehical
 */
interface Vehical {
    void start();
    void stop();
    int getmaxSpeed();  
}

/**
 * Bike implements Vehiccal
 
 */
 class Bike implements Vehical {

    private int maxSpeed;

    Bike(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start(){
        System.out.println("Bike is starting");
    }

    @Override
    public void stop(){
        System.out.println("Bike has stopped");
    }

    @Override
    public int getmaxSpeed(){
        return maxSpeed;
    }


    
}

 
 class Car implements Vehical {
    private int maxSpeed;

    Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start(){
        System.out.println("Car is starting");
    }

    @Override
    public void stop(){
        System.out.println("Car has stopped");
    }

    @Override
    public int getmaxSpeed(){
        return maxSpeed;
    }

    
}
public class InterfaceVehical {
    public static void main(String[] args) {
        Vehical bike = new Bike(45);
        bike.start();
        bike.stop();
        System.out.println(bike.getmaxSpeed());


        Vehical car = new Car(110);
        car.start();
        car.stop();
        System.out.println(car.getmaxSpeed());

    }
    
}
