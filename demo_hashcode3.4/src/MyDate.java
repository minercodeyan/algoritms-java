import java.util.Date;

public class MyDate extends Date {

    @Override
    public int hashCode() {
        long ht = this.getTime();
        return (int) ht ^ (int) (ht >> 32);
    }
}
