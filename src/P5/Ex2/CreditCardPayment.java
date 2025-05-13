package P5.Ex2;

public class CreditCardPayment implements PaymentProvider{
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card:"+amount);
    }
}
