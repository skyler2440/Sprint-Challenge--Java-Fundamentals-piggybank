package local.skylerwebdev;

public abstract class Money
{
    double value;
    int qty;

    public Money(int qty)
    {
        this.qty = qty;
    }

    public  abstract double getTotal();

    public int getQty()
    {
        return qty;
    }
}
