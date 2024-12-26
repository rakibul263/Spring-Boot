package Constructor;

public class Main {
    private String name;
    /*Non-Parameterised Constructor*/
    Main(){
        System.out.println("Constructor called...");
        name = "OOPs";
    }
    /*Parameterised Constructor*/
    Main(String lang){
        name = lang;
        System.out.println("Name is "+name);
    }


    public static void main(String[] args) {
        Main m = new Main();
        Main m2 = new Main("shuvo");
    }
}
