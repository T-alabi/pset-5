import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();
        System.out.print("\n");

        if(year < 0 ){
            System.out.print(year + " is not a leap year.");
        }
        if (year % 4 ==0){
            System.out.print(year + " is a leap year.");
        }else if (year % 4 > 0){
            System.out.print(year + " is not a leap year.");
        }

        in.close();
        System.out.print("\n");
    }
}
