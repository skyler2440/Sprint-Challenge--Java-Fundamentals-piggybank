package local.skylerwebdev;



public class Quarter extends Money
{
    //Set Coin Value
    double value = .25;

    //Create Constructor
    public Quarter(int qty)
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
            return qty + " quarter";
        }else
            return qty + " quarters";
    }
}
