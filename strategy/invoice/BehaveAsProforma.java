package invoice;

public class BehaveAsProforma implements IBehaviAsInvoice{

    @Override
    public void createInvoice() {
        System.out.println("Creating proforma invoice!!!");
    }
    
}
