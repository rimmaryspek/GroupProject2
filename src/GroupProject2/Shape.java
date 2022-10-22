package GroupProject2;

public interface Shape {
    void calculateArea(double length);
    void calculatePerimeter(double length);
}

class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        System.out.println(radius*radius*Math.PI); }
    @Override
    public void calculatePerimeter(double radius) {
        System.out.println(2*radius*Math.PI); }
}
class Square implements Shape{
    @Override
    public void calculateArea(double length) {
        System.out.println(length*length); }
    @Override
    public void calculatePerimeter(double length) {
        System.out.println(4*length); }
}
