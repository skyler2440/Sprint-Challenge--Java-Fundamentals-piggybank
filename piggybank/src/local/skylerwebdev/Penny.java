package local.skylerwebdev;


public class Penny extends Money
{
    //Set Coin Value
    double value = .01;

    //Create Constructor
    public Penny(int qty)
    {
        super(qty);
    }

    //Calculate Total
    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }

    //"toString" method that checks if there are multiple coins and adjusts printout
    @Override
    public String toString()
    {
        if (qty == 1)
        {
            return qty + " penny";
        } else
            return qty + " pennies";
    }
}
