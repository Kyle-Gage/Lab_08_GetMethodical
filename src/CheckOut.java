import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        double totalPrice = 0;
        boolean anotherItem = false;
        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item[0.50-9.99]: ", 0.50, 9.99);
            totalPrice = totalPrice + itemPrice;
            anotherItem = SafeInput.getYNConfirm(in,"Do you have any more items? [Y/N]: ");
        }while(anotherItem);

        System.out.printf("%2f",totalPrice);

    }
}
