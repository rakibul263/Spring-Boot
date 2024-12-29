package Inheritance;

public class AdminUser extends User{
    public AdminUser(String username, String email){
        super(username, email);
    }

    public void manageProduct(){
        System.out.println("Admin is managing product");
    }

    @Override
    public void showDashboard(){
        System.out.println("Admin user personal Dashboard");
    }

    public static void main(String[] args) {
        AdminUser adminUser = new AdminUser("admin", "admin@gmail.com");
        //adminUser.manageProduct();
        adminUser.login();
        adminUser.showDashboard();
    }
}
