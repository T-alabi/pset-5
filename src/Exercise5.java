import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);

       System.out.print("Enter a grade: ");
       double grade = in.nextDouble();
       grade =  Math.round(grade);
        System.out.print("\n");

       if(grade > 100){
           System.out.print("Grades above 100 are invalid.");
       }else if (grade < 0){
           System.out.print("Grades below 0 are invalid.");
       }else if(grade >= 90){
           System.out.print("You received an A.");
       }else if(grade >=80 && grade <=89){
           System.out.print("You received a B.");
       }else if(grade>=70 && grade<=79){
           System.out.print("You received a C.");
       }else if(grade>=60 && grade<=69){
           System.out.print("You received a D.");
       }else if(grade>=0 && grade<=59){
           System.out.print("You received a F.");
       }
        System.out.print("\n");
        in.close();
        System.out.print("\n");

    }
}
