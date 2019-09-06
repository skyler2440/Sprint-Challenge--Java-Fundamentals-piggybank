package local.skylerwebdev;



public class Dime extends Money
{
    //Set Coin Value
    double value = .1;

    //Create Constructor
    public Dime(int qty)
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
            return qty + " dime";
        }else
            return qty + " dimes";
    }
}
