import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in,"Please enter the year you were born in: ",1950,2010);
        birthMonth = SafeInput.getRangedInt(in,"Plese enter the month you were born in: ", 1,12);

        switch (birthMonth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in,"Please enter the day you were born on: ",1,31 );
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in,"Please enter the day you were born on: ",1,30 );
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in,"Please enter the day you were born on: ",1,28 );
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + birthMonth);
        }
        birthHour = SafeInput.getRangedInt(in,"Please enter the hour you were born in: ", 1,24);
        birthMinute = SafeInput.getRangedInt(in,"Please enter the minute you were born in: ",1,59);

        System.out.println("You were born in the year " + birthYear + ",in the " + birthMonth + "th month, on the " + birthDay + " day, in the " + birthHour + " hour, and in the " + birthMinute + " minute");



    }
}
