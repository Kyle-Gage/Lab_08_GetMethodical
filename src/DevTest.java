import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {

        // getNonZeroLenString test
        /*
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;


        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

         */

        // getInt test
        /*
        Scanner in = new Scanner(System.in);
        int userInt;

        userInt = SafeInput.getInt(in, "Enter your favorite integer: ");
        System.out.println("\n Your favorite integer is " + userInt);

         */

        // getDouble test
        /*
        Scanner in = new Scanner(System.in);
        double userDouble;

        userDouble = SafeInput.getDouble(in, "Enter a double: ");
        System.out.println("The double you entered was " + userDouble);

         */

        // getRangedInt test
        /*
        Scanner in = new Scanner(System.in);
        int rangedInt;

        rangedInt = SafeInput.getRangedInt(in, "Enter an integer within the range 5-25: ", 5,25);
        System.out.println("The integer you entered was " + rangedInt + " and is in range!");

         */

        // getRangedDouble test
        /*
        Scanner in = new Scanner(System.in);
        double rangedDouble;

        rangedDouble = SafeInput.getRangedDouble(in, "Enter a double within the range 20.00-20.50: ",20.00,20.50);
        System.out.println("The double you entered was " + rangedDouble + " and is in range!");

         */

        // getYNConfirm test
        /*
        Scanner in = new Scanner(System.in);
        boolean userYNResponse;

        userYNResponse = SafeInput.getYNConfirm(in, "Would You like to continue? [Y/N]: ");
        System.out.println(userYNResponse);

         */

        // getRegExString test
        /*
        Scanner in = new Scanner(System.in);
        String socSecNum;

        socSecNum = SafeInput.getRegExString(in,"Enter your social security number","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You SSN is " + socSecNum);

         */


    }
}
