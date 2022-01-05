package practice.oop.task1;

public class Rectangle {

    private Point left;
    private Point right;

    public Rectangle(Point left, Point right) {
        this.left = left;
        this.right = right;
    }

    public int getArea() {
        return (right.getX() - left.getX()) * (right.getY() - left.getY());
    }

    public double diagonal() {
        return left.distance(right);
    }

}
