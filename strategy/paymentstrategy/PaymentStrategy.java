package paymentstrategy;

interface PaymentStrategy {
    void processPayment(double amount);
}


class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
    }

}

class PayPalPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}