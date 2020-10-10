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

        String rankVal = "";
        String suitVal = "";

        //test card if real
        if(Arrays.asList(suits).contains(cardInfo.substring(1))  && Arrays.asList(rank).contains(cardInfo.substring(0,1))){

            //suit switch
            switch (cardInfo.substring(1)){
                case "C":
                case "c":
                    suitVal = "Clubs";
                    break;
                case "D":
                case "d":
                    suitVal = "Diamonds";
                    break;
                case "H":
                case "h":
                    suitVal = "Hearts";
                    break;
                case "S":
                case "s":
                    suitVal = "Spades";
                    break;
             }

            switch (cardInfo.substring(0,1)){
                case "2":
                     rankVal = "Two of ";
                     break;
                case "3":
                    rankVal = "Three of ";
                    break;
                case "4":
                    rankVal = "Four of ";
                    break;
                case "5":
                    rankVal = "Five of ";
                    break;
                case "6":
                    rankVal = "Six of ";
                    break;
                case "7":
                    rankVal = "Seven of ";
                    break;
                case "8":
                    rankVal = "Eight of ";
                    break;
                case "9":
                    rankVal = "Nine of ";
                    break;
                case "T":
                case "t":
                    rankVal = "Ten of ";
                    break;
                case "J":
                case "j":
                    rankVal = "Jack of ";
                    break;
                case "Q":
                case "q":
                    rankVal = "Queen of ";
                    break;
                case "K":
                case "k":
                    rankVal = "King of ";
                    break;
                case "A":
                case "a":
                    rankVal = "Ace of ";
                    break;
            }
                System.out.print(rankVal + suitVal + ".");

        }
        else if ( !Arrays.asList(suits).contains(cardInfo.substring(1))  && !Arrays.asList(rank).contains(cardInfo.substring(0,1)) || cardInfo.length() > 2){
            System.out.print("That's not a valid card.");

        }else if( (!Arrays.asList(suits).contains(cardInfo.substring(1))) && Arrays.asList(rank).contains(cardInfo.substring(0,1)) ){
            System.out.print("That's not a valid suit.");
        }else if(!Arrays.asList(rank).contains(cardInfo.substring(0,1)) && Arrays.asList(suits).contains(cardInfo.substring(1)) ){
            System.out.print("That's not a valid rank.");
        }

        System.out.print("\n");
        in.close();
        System.out.print("\n");

    }
}
