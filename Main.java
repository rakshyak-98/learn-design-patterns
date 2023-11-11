import invoice.BehaveAsProforma;
import invoice.ProformaInvoice;

class Main {
    public static void main(String[] args) {
        BehaveAsProforma draftInvoice = new ProformaInvoice();
        draftInvoice.createInvoice();
    }
}
