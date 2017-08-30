package FirstPackage;

public class OrderShipping extends Order{
    private double shippingFee = 4.00;
    OrderShipping(){
        System.out.println("This is the sub class constructor");
    }
    @Override
    public void computeTotalPrice() {
        //super.computeTotalPrice();
        totalPrice = totalPrice + shippingFee;
        System.out.println("Total Price with S & H fee is $" + totalPrice);
    }

    public void printShipping(){
            System.out.println("printing the shipping");

    }
}
