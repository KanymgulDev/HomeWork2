public class Main {
    public static void main(String[] args) {

        Shapes[] shapes = {
                new Triangle(2, 3),
                new Rectangle(5, 6),
                new Circle(3, 5),
                new Square(4, 8),
        };

        for (Shapes sha : shapes) {
            if (sha.getClass().equals(Rectangle.class)) {
                sha.findArea();
            }
            if (sha.getClass().equals(Triangle.class)) {
                sha.findArea();
            }
            if (sha.getClass().equals(Circle.class)) {
                sha.findArea();
            }
            if (sha.getClass().equals(Square.class)) {
                sha.findArea();
            }

            System.out.println(sha);

        }
    }
}


