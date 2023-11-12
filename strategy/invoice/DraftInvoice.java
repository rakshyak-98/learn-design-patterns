package invoice;

public class DraftInvoice extends MainInvoice{
    public DraftInvoice(){
        behavior = new BehavieAsDraft();
    }
}
