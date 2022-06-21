package BuildJavaPrograms.Chapter_9_Inheritance.Interface;

public class Circle  implements  Shape {

    private double radius;

    //constructor
    public Circle (double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
