package local.skylerwebdev;



public class Dollar extends Money
{
double value = 1.00;

    public Dollar(int qty)
    {
        super(qty);
    }

    @Override
    public double getTotal()
    {
        return value * this.getQty();
    }
}
