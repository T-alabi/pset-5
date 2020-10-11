import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = in.nextDouble();
        System.out.print("Enter hours worked: ");
        double hoursWorked = in.nextDouble();
        double overTimePay = 0;

        if ( hoursWorked < 0) {
            System.out.print("Your hours must be greater than or equal to 0.0.");
        }else if ( wage < 0 ) {
            System.out.print("Your wage must be greater than or equal to $0.00/hour.");
        }
        if (hoursWorked > 40) {
             overTimePay = hoursWorked - 40;
            overTimePay = overTimePay * (wage * 1.5);
        }

        System.out.print("\n");

        System.out.print("You'll make $");
        System.out.printf("%,.2f", ((wage * hoursWorked) + overTimePay));
        System.out.print(" this week.");
      //  System.out.printf("You'll make  %,.2f", ((wage * hoursWorked) + overTimePay) + " this week." );

        System.out.print("\n");
        in.close();
        System.out.print("\n");
    }
}
