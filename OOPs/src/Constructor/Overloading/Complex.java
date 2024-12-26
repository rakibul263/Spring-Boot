package Constructor.Overloading;

public class Complex {
    private int a, b;

    private Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    private Complex(int a){
        this(a,a);
    }

    private Complex(){
        this(0);
    }

    @Override
    public String toString(){
        return "(" + a + ", " + b + ")";
    }

    public static void main(String[] args) {
        Complex c = new Complex(2,3);
        System.out.println(c);

        Complex c2 = new Complex(2);
        System.out.println(c2);

        Complex c3 = new Complex();
        System.out.println(c3);

    }
}
