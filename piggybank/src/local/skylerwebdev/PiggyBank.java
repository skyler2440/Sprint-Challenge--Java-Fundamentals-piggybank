package local.skylerwebdev;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PiggyBank
{
    //Create Array List to hold money
    ArrayList<Money> cashArray = new ArrayList<>();

    //Decimal Format Converter
    DecimalFormat DF = new DecimalFormat("$###,###.00");

    //Constructor to add money to array
    void addMoney(Money addCash)
    {
        cashArray.add(addCash);
    }

    //Function to add total cash from array
    void totalCash()
    {
        //set initial array value
        double arrayValue = 0;

        //Foreach to loop through array
        for (Money cash : cashArray)
        {
            System.out.println(cash.toString());
            arrayValue += cash.getTotal();
        }

        //Final Printout
        System.out.println("This Piggy Bank Holds " +DF.format(arrayValue));
    }
}
