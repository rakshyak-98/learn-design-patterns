package invoice;

public class CreditNoteInvoice extends MainInvoice{
    public CreditNoteInvoice(){
        behavior = new BehaveAsProforma();
    }
}
