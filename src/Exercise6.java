import java.util.Scanner;
import java.util.Arrays;


public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] suits = {"C", "D", "H", "S","c","d","h","s"};
        String[] rank = {"2","3","4","5","6","7","8","9","T", "J", "Q", "K", "A"};

        System.out.print("Enter a playing card: "); //A9
        String cardInfo = in.nextLine();
        System.out.print("\n");

        String rankval = "";
        String suitval = "";

        //test card if real
        if(Arrays.asList(suits).contains(cardInfo.substring(0,1))  && Arrays.asList(rank).contains(cardInfo.substring(1))){

            //suit switch
            switch (cardInfo.substring(0,1)){
                case "C":
                     suitval = "Clubs";
                case "c":
                    suitval = "Clubs";
                    break;
                case "D":
                    suitval = "Diamonds";
                case "d":
                    suitval = "Diamonds";
                    break;
                case "H":
                    suitval = "Hearts";
                case "h":
                    suitval = "Hearts";
                    break;
                case "S":
                    suitval = "Spades";
                case "s":
                    suitval = "Spades";
                    break;
             }

            switch (cardInfo.substring(1)){
                case "2":
                     rankval = "Two of ";
                     break;
                case "3":
                    rankval = "Three of ";
                    break;
                case "4":
                    rankval = "Four of ";
                    break;
                case "5":
                    rankval = "Five of ";
                    break;
                case "6":
                    rankval = "Six of ";
                    break;
                case "7":
                    rankval = "Seven of ";
                    break;
                case "8":
                    rankval = "Eight of ";
                    break;
                case "9":
                    rankval = "Nine of ";
                    break;
                case "T":
                    rankval = "Ten of ";
                    break;
                case "J":
                    rankval = "Two of ";
                    break;
            }
                System.out.print(rankval + suitval + ".");

        }
        else if ( !Arrays.asList(suits).contains(cardInfo.substring(0,1))  && !Arrays.asList(rank).contains(cardInfo.substring(1)) || cardInfo.length > 2){
            System.out.print("That's not a valid card.");

        }else if( (!Arrays.asList(suits).contains(cardInfo.substring(0,1))) && Arrays.asList(rank).contains(cardInfo.substring(1)) ){
            System.out.print("That's not a valid suit.");
        }else if(!Arrays.asList(rank).contains(cardInfo.substring(1)) && Arrays.asList(suits).contains(cardInfo.substring(0,1)) ){
            System.out.print("That's not a valid rank.");
        }
        System.out.print("\n");



        System.out.print("\n");
        in.close();
    }
}
