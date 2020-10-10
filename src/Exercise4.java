import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //grade array
        String[] possibleGrades = {"A", "A+", "A-", "B", "B+", "B-", "C", "C+", "C-", "D", "D+", "D-", "F"};

        System.out.print("Enter a letter grade: ");
        String lettergrade = in.nextLine();

        String gpaText = "Your GPA is ";
        //not valid letter grade
        if (Arrays.asList(possibleGrades).contains(lettergrade)) {
            if (lettergrade.equals(possibleGrades[0]) || lettergrade.equals(possibleGrades[1])) {
                System.out.print("\n");
                System.out.print("Your GPA is 4.00.");
            } else {
                switch (lettergrade) {
                    case "A-":
                        System.out.print("\n");
                        System.out.println(gpaText + "3.67.");
                        break;
                    case "B":
                        System.out.print("\n");
                        System.out.println(gpaText + "3.00.");
                        break;
                    case "B+":
                        System.out.print("\n");
                        System.out.println(gpaText + "3.33.");
                        break;
                    case "B-":
                        System.out.print("\n");
                        System.out.println(gpaText + "2.67.");
                        break;
                    case "C":
                        System.out.print("\n");
                        System.out.print(gpaText + "2.00.");
                    case "C-":
                        System.out.print("\n");
                        System.out.print(gpaText + "1.67.");
                    case "C+":
                        System.out.print("\n");
                        System.out.print(gpaText + "2.33");
                    case "D":
                        System.out.print("\n");
                        System.out.print(gpaText + "1.00.");
                    case "D+":
                        System.out.print("\n");
                        System.out.print(gpaText + "1.33.");
                    case "D-":
                        System.out.print("\n");
                        System.out.print(gpaText + "0.67.");
                    case "F":
                        System.out.print("\n");
                        System.out.print(gpaText + "0.00.");
                   /* default:
                        System.out.print("\n");
                        System.out.println("That's not a valid letter grade.");*/
                }
            }}else{
                System.out.print("\n");
                System.out.println("That's not a valid letter grade.");
            }

            System.out.print("\n");
            in.close();
        }
    }
