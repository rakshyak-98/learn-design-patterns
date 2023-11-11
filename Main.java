import invoice.BehaveAsProforma;
import invoice.BehavieAsDraft;
import invoice.CreditNoteInvoice;
import invoice.DraftInvoice;
import invoice.MainInvoice;
import invoice.ProformaInvoice;

class Main {
    public static void main(String[] args) {
        MainInvoice draftInvoice = new CreditNoteInvoice();
        draftInvoice.setBehavior(new BehaveAsProforma());
        draftInvoice.createInvoice();
    }
}
