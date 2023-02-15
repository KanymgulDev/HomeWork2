public class Square extends Shapes{
//     Square
    private int t;
    private int f;

    public Square(int t, int f) {
        this.t = t;
        this.f = f;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "Square{" +
                "t=" + t +
                ", f=" + f +
                '}';
    }

    @Override
public void findArea() {
    System.out.println();
}
}
