package OOPs;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private int age;
    private String grade;
    private List<Double> scores;
    // constructor
    public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.scores = new ArrayList<>();
    }

    public void takeTest(double score){
        if(score<0 || score>100){
            System.out.println("ERROR : Invalid score");
            return;
        }

        scores.add(score);
        System.out.println(name+" took exam and score is "+score);

    }

    public double average(){
        if(scores.isEmpty()){
            System.out.println("Score is not availabe");
            return 0;
        }
         
        double total =0;
        for(double s : scores){
            total +=s;
        }

        double avg = total/ scores.size();
        return avg;
    }

    public static void main(String[] args) {
        Student s = new Student("David", 13, "8th grade");
        s.takeTest(70);
        s.takeTest(89);
        System.out.println( "David's average score is :"+ s.average());

    }
    
}
