import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String enteredMonth = in.nextLine();
        enteredMonth = enteredMonth.toLowerCase();
        System.out.print("\n");

        if (enteredMonth.equals("january") || enteredMonth.equals("jan") || enteredMonth.equals("janu") ){
            System.out.print("31 days.");
        }else if ( enteredMonth.equals("february") || enteredMonth.equals("feb") || enteredMonth.equals("febu") ){
            System.out.print("28 or 29 days.");
        }else if ( enteredMonth.equals("march") || enteredMonth.equals("mar") || enteredMonth.equals("marc") ) {
            System.out.print("31 days.");
        } else if ( enteredMonth.equals("april") || enteredMonth.equals("apr") || enteredMonth.equals("apri") ) {
            System.out.print("30 days.");
        }else if ( enteredMonth.equals("may")  ) {
            System.out.print("31 days.");
        }else if ( enteredMonth.equals("june") || enteredMonth.equals("jun")  ) {
            System.out.print("30 days.");
        }else if ( enteredMonth.equals("july") || enteredMonth.equals("jul")  ) {
            System.out.print("31 days.");
        }else if ( enteredMonth.equals("august") || enteredMonth.equals("aug") || enteredMonth.equals("augu") ) {
            System.out.print("31 days.");
        }else if ( enteredMonth.equals("september") || enteredMonth.equals("sep") || enteredMonth.equals("sept") ) {
            System.out.print("30 days.");
        }else if ( enteredMonth.equals("october") || enteredMonth.equals("oct") || enteredMonth.equals("octo") ) {
            System.out.print("31 days.");
        }else if ( enteredMonth.equals("november") || enteredMonth.equals("nov") || enteredMonth.equals("nove") ) {
            System.out.print("30 days.");
        }else if ( enteredMonth.equals("december") || enteredMonth.equals("dec") || enteredMonth.equals("dece") ) {
            System.out.print("31 days.");
        }else {
            System.out.print("That's not a valid month.");
        }

        in.close();
        System.out.print("\n");
    }
}
