import java.awt.geom.Point2D;
import java.util.Objects;

public class MyPoint2D extends Point2D {

    public float x;

    public float y;


    @Override
    public double getX() {
        return (double) x;
    }

    @Override
    public double getY() {
        return (double) y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    @Override
    public int hashCode() {
        long bits = java.lang.Double.doubleToLongBits(getX());
        bits ^= java.lang.Double.doubleToLongBits(getY()) * 31;
        return (((int) bits) ^ ((int) (bits >> 32)));
    }
}
