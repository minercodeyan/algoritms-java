public class MyInterval2D extends MyInterval{

    public float bX;
    public float bY;

    public MyInterval2D(float ax, float ay,float bX,float bY) {
        super(ax, ay);
        this.bX = bX;
        this.bY = bY;
    }

    public float getInterval2D(){
        return (float) Math.sqrt(Math.pow(aX-bX,2)+Math.pow(aY-bY,2));
    }


    @Override
    public int hashCode() {
        int elementHash = (Float.floatToIntBits(getInterval2D()));
        return 31 + elementHash;
    }
}
