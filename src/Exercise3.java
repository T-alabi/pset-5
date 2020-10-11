import  java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three integers.");
        System.out.println("\n");
        System.out.print("Enter integer 1: ");
        int integer1 = in.nextInt();
        System.out.print("Enter integer 2: ");
        int integer2 = in.nextInt();
        System.out.print("Enter integer 3: ");
        int integer3 = in.nextInt();

        if(integer1 == integer2 && integer1 == integer3  ){
            System.out.print("\n");
            System.out.println("Same.");
        }else if(integer1 < integer2 && integer2 < integer3){
            System.out.print("\n");
            System.out.println("Strictly increasing.");
        }else if(integer1 <= integer2 && integer2 <= integer3){
            System.out.print("\n");
            System.out.println("Increasing.");
        } else if(integer1 > integer2 && integer2 > integer3){
            System.out.print("\n");
            System.out.println("Strictly decreasing.");
        }else if (integer1 >= integer2 && integer2 >= integer3){
            System.out.print("\n");
            System.out.println("Decreasing.");
        }else{
            System.out.print("\n");
            System.out.println("Unordered.");
        }

        in.close();
    }

}
