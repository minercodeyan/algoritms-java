
public class Main {

    public static void main(String[] args) {
        MyInterval myInterval = new MyInterval(3,5);
        MyInterval2D myInterval2D = new MyInterval2D(0,100,30,0);
        MyPoint2D myPoint2D = new MyPoint2D();
        MyDate myDate = new MyDate();
        myPoint2D.x = 20;
        myPoint2D.y= 10;
        System.out.println(myInterval.hashCode());
        System.out.println(myPoint2D.hashCode());
        System.out.println(myDate.hashCode());
        System.out.println(myInterval2D.hashCode());
    }
}
