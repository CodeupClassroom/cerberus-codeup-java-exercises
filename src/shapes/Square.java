package shapes;

public class Square extends Quadrilateral{

    protected double side;
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side *side;
    }

    public Square(double side){
        super(side,side);
        this.side = side;
    }
}
