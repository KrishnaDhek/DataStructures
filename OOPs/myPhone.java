package OOPs;
/**
 *  Phone
 */
 class  Phone {
    void call(){
        System.out.println("Phone call");
    }
    void sms(){
        System.out.println("Send message");
    }

    
}

interface Camera {
    void Click();
    void Record();
  
}

interface MusicPlayer{
    void play();
    void stop();

}
 class SmartPhone extends Phone implements Camera,MusicPlayer{
    public void videoCall(){
        System.out.println("Smart Phone Video calling");
    } 
    
    @Override
    public void Click(){
        System.out.println("Clicking photo");
    }
    @Override
    public void Record(){
        System.out.println("Video recording");
    }
    
    public void play(){
        System.out.println("Playing music");
    }

    public void stop(){
        System.out.println("Music Stopped");

    }
}


public class myPhone  {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.Click();
        sp.Record();
        sp.call();
        sp.sms();
        sp.videoCall();
        sp.stop();
        sp.play();
    }
    
}
