package OOPs;
class Student{
    int roll;
    String name;
    String course;
    int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public double avg(){
        return total()/3;
    }
    public char grade(){
        if(avg()>=60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    public String toString(){
        return "Roll Num: "+roll+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }
}

public class ClassStudent {

    
}
