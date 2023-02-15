public class Rectangle extends Shapes{
//    Төрт бурчтук
    private int d;
    private int s;

    public Rectangle(int d, int s) {
        this.d = d;
        this.s = s;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "d=" + d +
                ", s=" + s +
                '}';
    }

    @Override
public void findArea() {
    System.out.println( d+s);
}
}
