package Inheritance;

public class User {
    private String username;
    private String email;

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login(){
        System.out.println(username + " login");
    }

    public void showDashboard(){
        System.out.println(username + " show dashboard");
    }
}
