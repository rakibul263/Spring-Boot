package ThisKeyword;

public class ThisExample {
    int x, y;

    ThisExample(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println(this.x+" "+this.y);
        add(this);
        System.out.println(this.x+" "+this.y);
    }

    void add(ThisExample other){
        other.x += 2;
        other.y += 2;
    }

    public static void main(String[] args) {
        ThisExample ex = new ThisExample(2,5);
    }
}
