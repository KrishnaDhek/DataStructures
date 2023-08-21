package OOPs;
class Fan{
    // instance variable
    // initialised everytime we create object, can be accessed from anywhere

    private boolean isOn;
    public void turnOn(){
        isOn = true;
        System.out.println("Fan is spinning");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Fan is off");
    }

    public void checkStatus(){
        if(isOn){
            System.out.println("Fan is ON");
        }
        System.out.println("Fan is OFF");
    }
}

public class ClassFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan2 = new Fan();
        fan.turnOn();
        fan.checkStatus();
        fan2.checkStatus();
        fan2.turnOff();
        
    }
    
}
