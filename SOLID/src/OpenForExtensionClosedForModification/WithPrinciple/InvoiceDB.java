package OpenForExtensionClosedForModification.WithPrinciple;

public class InvoiceDB implements InvoiceDao {
    void save(){
        System.out.println("save to db");
    }
}
