import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        if (num > 0) {
            System.out.print("\n");
            System.out.println("Positive.");
        } else if (num < 0) {
            System.out.print("\n");
            System.out.println("Negative.");
        } else {
            System.out.print("\n");
            System.out.print("Zero.");
        }
        System.out.print("\n");
        in.close();
    }

}