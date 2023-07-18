public class Circle {

   private static final  double pi= 3.14;
    protected  double circumference;

    public Circle() {

    }

    public Circle( double circumference) {
        this.circumference = circumference;
    }
    public static double area(double radius){
        double res=pi *(radius*radius);
        return res;
    }
public static  void circumference(double res2){
    System.out.println(pi * 2 * res2);
}
    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", circumference=" + circumference +
                '}';
    }
}
