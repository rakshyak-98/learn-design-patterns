package invoice;

interface IBehaviAsInvoice {
    void createInvoice();
}

public abstract class MainInvoice {
    IBehaviAsInvoice behavior;

    public void createInvoice() {
        behavior.createInvoice();
    }

    public void setBehavior(IBehaviAsInvoice ib){
        behavior = ib;
    }
}