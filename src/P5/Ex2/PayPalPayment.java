package P5.Ex2;

public class PayPalPayment implements PaymentProvider{
    @Override
    public void pay(double amount) {
        System.out.println("PayPal:"+amount);
    }
}
