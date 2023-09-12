package OOPs;
class stud{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

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
        return "RollNum :"+roll+"\n"+"Name :"+name+"\n"+"Course :"+course+"\n"+"Total :"+total()+"\n"+"Average :"+avg();
    }
}
public class classStud {
    public static void main(String[] args) {
        stud S = new stud();
        S.roll =12;
        S.name = "John";
        S.course ="CS";
        S.m1 =50;
        S.m2 =49;
        S.m3 =45;
    
        System.out.println("Details :\n"+ S);
    }
}
