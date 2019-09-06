package local.skylerwebdev;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PiggyBank
{
    ArrayList<Money> cashArray = new ArrayList<>();
    DecimalFormat DF = new DecimalFormat("$###,###.00");

    void addMoney(Money addCash)
    {
        cashArray.add(addCash);
    }

    void totalCash()
    {
        double arrayValue = 0;
        for (Money cash : cashArray)
        {
            System.out.println(cash.toString());
            arrayValue += cash.getTotal();
        }
        System.out.println("This Piggy Bank Holds " +DF.format(arrayValue));
    }
}
