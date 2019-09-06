package local.skylerwebdev;


public class Nickel extends Money
{
    //Set Coin Value
    double value = .05;

    //Create Constructor
    public Nickel(int qty)
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
            return qty + " nickel";
        }else
            return qty + " nickels";
    }
}
