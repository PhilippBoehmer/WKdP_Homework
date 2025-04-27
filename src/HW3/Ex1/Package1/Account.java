package HW3.Ex1.Package1;

public class Account {
    public String Owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, double initialBalance, int pin) {
        this.Owner = owner;
        this.balance = initialBalance;
        this.pin = pin;
        this.internalNote = "This is an internal note.";
    }

    public double getBalance() {
        return balance;
    }
    public void changePin(int oldPin, int newPin) {
        if(oldPin==this.pin) {
            this.pin = newPin;
            System.out.println("Pin changed successfully.");
        } else {
            System.out.println("Old pin is incorrect.");
        }

    }
}
