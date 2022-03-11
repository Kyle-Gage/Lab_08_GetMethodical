import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String socSecNum;
        String mNum;
        String menuChoice;

        socSecNum = SafeInput.getRegExString(in,"Enter your social security Number: ","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("your social security number is " + socSecNum);

        mNum = SafeInput.getRegExString(in, "Enter in your UC M number: ", "(M|m)\\d{5}");
        System.out.println("Your UC M number is " + mNum);

        menuChoice = SafeInput.getRegExString(in, " O = Open \n S = Save \n V = View \n Q = Quit \n Enter your choice: ","[OoSsVvQq]");
        switch (menuChoice)
        {
            case "O":
            case "o":
                System.out.println("Open");
                break;
            case "S":
            case "s":
                System.out.println("Save");
                break;
            case "V":
            case "v":
                System.out.println("View");
                break;
            case "Q":
            case "q":
                System.exit(0);
                break;


        }
    }
}
