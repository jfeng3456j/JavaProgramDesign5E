package BuildJavaPrograms.Chapter_9_Inheritance.Interface;

public class ShapeMain {

    public static void main (String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(18, 18);
        shapes[1] = new Triangle(30, 30, 30);
        shapes[2] = new Circle(12);

        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("area = %s, perimeter = %s \n", shapes[i].getArea(), shapes[i].getPerimeter());
        }
    }
}
