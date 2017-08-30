package FirstPackage;

public class Order {
    private String custName;
    private int itemNo;
    private int quantityOrder;
    private double unitprice;
    protected double totalPrice;

    //constructor
    Order(){
        custName = "Buying Customer";
        itemNo = 12345;
        quantityOrder = 19;
        unitprice = 17.99;
        System.out.println("This is the base class constructor");
        //totalPrice = quantityOrder*unitprice;
    }
    public void setCustName(String cname){
        custName = cname;
    }
    public void setItemNo(int num){
        itemNo = num;
    }
    public void setQuantityOrder(int quan){
        quantityOrder = quan;
        }
    public void setUnitprice(double p){
        unitprice = p;
    }
    public void computeTotalPrice(){
        totalPrice = quantityOrder * unitprice;
        System.out.println("The Customer Name is "+custName);
        System.out.println("The Item ordered is "+ itemNo);
        System.out.println("The Quantity ordered is "+quantityOrder);
        System.out.println("The unit price charge for the item purchased is "+unitprice);
        System.out.println("The Total price need to be paid by the customer is "+totalPrice);

    }
    public String getCustName(){
         return custName;
    }
    public int getItemNo(){
        return itemNo;
    }
    public int getQuantityOrder(){
        return quantityOrder;
    }
    public double getUnitprice(){
        return unitprice;
    }
}

