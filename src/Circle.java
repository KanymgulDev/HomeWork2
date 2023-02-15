public class Circle extends Shapes{
//    кург
    private  int e;
    private int r;

    public Circle(int e, int r) {
        this.e = e;
        this.r = r;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "e=" + e +
                ", r=" + r +
                '}';
    }

    @Override
public void findArea() {
    System.out.println(e/r);
}
}
