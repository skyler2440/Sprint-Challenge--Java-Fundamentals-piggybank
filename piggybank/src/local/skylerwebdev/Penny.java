package local.skylerwebdev;



public class Penny extends Money
{
double value = .01;

    public Penny(int qty)
    {
        super(qty);
    }

    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }
}
