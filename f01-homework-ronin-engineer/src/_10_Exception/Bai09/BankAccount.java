package _10_Exception.Bai09;

public class BankAccount {
    private static double money = 10000000;

    public void withDraw(double amount) throws InsufficientFundsException {
        if(amount > this.money) throw new InsufficientFundsException("So tien vuot qua so du trong tai khoan");
        this.money -= amount;
    }

    public double getMoney() {
        return money;
    }
}