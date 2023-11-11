package invoice;

public class ProformaInvoice extends MainInvoice{
    public ProformaInvoice(){
        behavior = new BehaveAsProforma();
    }
}
