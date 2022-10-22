package GroupProject2;
public class GroupProjectTask2 {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
     Provide implementation of abstract method in classes 'A' and 'B'.
     The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects
     as its parameters for student B. Test your code
     */
    public static void main(String[] args) {
        Marks [] taks={new studentA(70,75,80),new studentB(70,75,80,85)};
        for(Marks mark:taks){
            System.out.println("avarage % " + mark.getPercentage());
        }
    }
}
abstract class Marks{
    abstract double getPercentage();
}
class studentA extends Marks{
    double subject1;
    double sunject2;
    double sunject3;
    studentA(double subject1, double sunject2, double sunject3){
        this.subject1=subject1;
        this.sunject2=sunject2;
        this.sunject3=sunject3;
    }

    @Override
    double getPercentage() {
        return (subject1+sunject2+sunject3)/3;
    }
}
class studentB extends Marks{
    double subject1;
    double sunject2;
    double sunject3;
    double sunject4;

    studentB(double subject1, double sunject2, double sunject3, double sunject4){
        this.subject1=subject1;
        this.sunject2=sunject2;
        this.sunject3=sunject3;
        this.sunject4=sunject4;
    }

    @Override
    double getPercentage() {
        return (subject1+sunject2+sunject3+sunject4)/4;
    }
}


