import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] scaleOptions = {"C","c","F","f"};

        System.out.print("Enter a temperature: ");
        double temp = in.nextDouble();
        String scale = in.next();
        System.out.print("\n");

        if (!Arrays.asList(scaleOptions).contains(scale)){
            System.out.print("That's not a valid scale.");
        }

        if( (temp <= 32 && (scale.equals("F") || scale.equals("f") )) || temp <= 0 && (scale.equals("C") || scale.equals("c")) ){
            System.out.print("Solid.");
        }else if ( (temp >= 212 && (scale.equals("F") || scale.equals("f") )) || temp >= 100 && (scale.equals("C") || scale.equals("c")) ){

            System.out.print("Gas.");
        }else if ( (temp > 32 && temp < 212 && (scale.equals("F") || scale.equals("f"))) || (temp > 0 && temp < 100 && (scale.equals("C") || scale.equals("c"))) ){
            // (temp > 0 && temp < 100 && (scale.equals("C") || scale.equals("c")))

            System.out.print("Liquid.");
        }

        System.out.print("\n");
        in.close();
        System.out.print("\n");
    }
}
