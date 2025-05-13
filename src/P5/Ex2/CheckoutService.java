package P5.Ex2;

public class CheckoutService {
    public CheckoutService(PaymentProvider PaymentProvider){

    }
    public void processPayment(double amount){

    }

    public static void main(String args[]){
        PayPalPayment PayPalPayment = new PayPalPayment();
        CreditCardPayment CreditCardPayment = new CreditCardPayment();
    }
}
