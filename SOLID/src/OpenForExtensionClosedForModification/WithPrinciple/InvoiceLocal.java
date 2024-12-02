package OpenForExtensionClosedForModification.WithPrinciple;

public class InvoiceLocal implements InvoiceDao {
    void save(){
        System.out.println("save to local");
    }
}
