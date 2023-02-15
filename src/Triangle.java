public class Triangle extends Shapes{
//    Треуголь
    private int i;
    private  int d;


    public Triangle(int i, int d) {
        this.i = i;
        this.d = d;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "i=" + i +
                ", d=" + d +
                '}';
    }

    @Override
    public void findArea() {
        System.out.println( i*d);
    }
}
