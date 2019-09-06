package local.skylerwebdev;


public class Nickel extends Money
{
    double value = .05;

    public Nickel(int qty)
    {
        super(qty);
    }

    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }
}
