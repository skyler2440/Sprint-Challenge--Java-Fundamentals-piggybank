package local.skylerwebdev;

public class Main {

    public static void main(String[] args) {
    PiggyBank myBank;

    myBank = new PiggyBank();

    myBank.addMoney(new Penny(1));

    myBank.totalCash();
    }

}
