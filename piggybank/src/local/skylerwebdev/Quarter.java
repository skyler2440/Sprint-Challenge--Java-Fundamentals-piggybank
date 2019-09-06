package local.skylerwebdev;



public class Quarter extends Money
{
double value = .25;

    public Quarter(int qty)
    {
        super(qty);
    }

    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }
}
