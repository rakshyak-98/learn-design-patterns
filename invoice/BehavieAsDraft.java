package invoice;

public class BehavieAsDraft implements IBehaviAsInvoice {

    public void createDraft(){
        System.out.println("Creating draft invoice!!!");
    }

    @Override
    public void createInvoice() {
        createDraft();
    }
}
