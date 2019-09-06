package local.skylerwebdev;

public abstract class Money
{
    //set initial value and quantity
    double value;
    int qty;

    //setter for quantity
    Money(int qty)
    {
        this.qty = qty;
    }

    //set / get method for total
    public  abstract double getTotal();

    // getter for quantity
    int getQty()
    {
        return qty;
    }
}
