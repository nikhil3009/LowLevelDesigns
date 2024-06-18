package SingleResponsibility;


public class Invoice {
    private Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculatePrice(){
        int totalPrice = marker.price * this.quantity;
        return totalPrice;
    }
}
