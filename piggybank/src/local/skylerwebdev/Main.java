package local.skylerwebdev;

public class Main {

    public static void main(String[] args) {
    PiggyBank myBank;

    //Create New Piggy Bank
    myBank = new PiggyBank();

    //Add Money to Piggy Bank
    myBank.addMoney(new Quarter(1));
    myBank.addMoney(new Dime(1));
    myBank.addMoney(new Dollar(5));
    myBank.addMoney(new Nickel(3));
    myBank.addMoney(new Dime(7));
    myBank.addMoney(new Dollar(1));
    myBank.addMoney(new Penny(10));

    //Print Piggy Bank Total Cash
    myBank.totalCash();
    }

}
