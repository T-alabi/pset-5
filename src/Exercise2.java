import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        if (num % 2 == 0 || (- num % 2) != 1){
            System.out.print("\n");
            System.out.println("Even.");
        } else  /*(num % 2 > 0  || (- num % 2) = -1)*/{
            System.out.print("\n");
            System.out.println("Odd.");
        }
        in.close();
    }
}
