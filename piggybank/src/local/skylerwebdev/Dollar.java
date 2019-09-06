package local.skylerwebdev;



public class Dollar extends Money
{
    //Set Dollar Value
    double value = 1.00;

    //Create Constructor
    public Dollar(int qty)
    {
        super(qty);
    }

    //Calculate total
    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }

    //"toString" method that prints a "$" in front of the quantity
    @Override
    public String toString()
    {
        return "$" + qty;
    }
}
