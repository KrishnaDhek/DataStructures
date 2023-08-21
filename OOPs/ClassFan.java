package OOPs;
class Fan{
    private boolean isOn;
    public void turnOn(){
        isOn = true;
        System.out.println("Fan is spinning");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Fan is off");
    }
}

public class ClassFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
        
    }
    
}
