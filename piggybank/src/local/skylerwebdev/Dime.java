package local.skylerwebdev;



public class Dime extends Money
{
double value = .1;

    public Dime(int qty)
    {
        super(qty);
    }

    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }
}
