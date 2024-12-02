package OpenForExtensionClosedForModification.WithoutPrinciple;

import SingleResponsibility.Invoice;

public class InvoiceDao {
    //before feature
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void dbconnection(){
        //method implementation.
    }


// the above class is already defined and it is working
// suddenly if we want to add a new feature to save invoice to localfile system
// so we directly modify this class and will add a function which is the case not following
// openforExtensionNotforModification Principle as we are modifying the existing one

//adding new feature
public void saveToLocal(){
        //method implementation.
}
}