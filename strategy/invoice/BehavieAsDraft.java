package invoice;

public class BehavieAsDraft implements IBehaviAsInvoice {
    @Override
    public void createInvoice() {
        System.out.println("Creating draft invoice!!!");
    }
}
