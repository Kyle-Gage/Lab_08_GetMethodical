import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt;
        double favDouble;

        favInt = SafeInput.getInt(in, "Enter your favorite integer: ");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("your favorite integer is " + favInt + " and your favorite double is " + favDouble);
    }
}
