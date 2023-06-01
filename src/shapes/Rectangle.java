package shapes;

public class Rectangle extends Quadrilateral {
    protected double length;
    protected double width;



    @Override
    public double getArea() {
        return length* width;
    }

    public Rectangle(double length, double width){
        super(length,width);
        this.length = length;
        this.width = width;
    }
}
