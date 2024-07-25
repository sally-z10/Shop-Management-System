// CSE 314: Advanced Programming
// Final Project
// Names & ID: 
//              Menna Alaa Eldin Abdelgayed Rasslan - 120210311
//              Sally Reda Eldosouky Zeineldeen - 120210008

public class Supplier extends User{
    private String product_type;
    private String Shipping_time;
    public Supplier(String id, String name, String address, String email, String phone,String product_type, String shipping_time) {
        super(id,name, address, email, phone);
        this.product_type=product_type;
        this.Shipping_time=shipping_time;
    }


    public String getProduct_type() {
        return product_type;
    }

    public String getShipping_time() {
        return Shipping_time;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public void setShipping_time(String shipping_time) {
        Shipping_time = shipping_time;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Product Type: "+getProduct_type());
        System.out.println("Delivers on: "+getShipping_time());

    }
}










