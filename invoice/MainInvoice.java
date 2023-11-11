package invoice;

interface IBehaviAsInvoice {
    void createInvoice();
}

public class MainInvoice {
    IBehaviAsInvoice behavior;
    void createInvoice(){
        behavior.createInvoice();
    }
}