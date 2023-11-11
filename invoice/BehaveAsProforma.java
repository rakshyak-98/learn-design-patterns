package invoice;

public class BehaveAsProforma implements IBehaviAsInvoice{

    public void createProforma() {
        System.out.println("Creating proforma invoice!!!");
    }

    @Override
    public void createInvoice() {
        createProforma();
    }
    
}
