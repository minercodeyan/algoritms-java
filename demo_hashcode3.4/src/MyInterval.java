
public class MyInterval {

    public float aX;
    public float aY;

    public MyInterval(float ax, float ay) {
        this.aX = ax;
        this.aY = ay;
    }

    public float getInterval(){
        return (this.aY > this.aX)? this.aY-this.aX : this.aX - this.aY;
    }


    @Override
    public int hashCode() {
        int elementHash = (Float.floatToIntBits(getInterval()));
        return 31 + elementHash;
    }
}



