package Inheritance;

public class SellerUser extends User{
    public SellerUser(String username, String email){
        super(username, email);
    }

    public void AddProduct(){
        System.out.println("Seller is adding a new product");
    }

    @Override
    public void showDashboard(){
        System.out.println("Seller user personal Dashboard");
    }
}
