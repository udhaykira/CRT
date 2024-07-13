import java.util.*;
public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r  = sc.nextInt();
        double area = Math.PI*(r*r);
        System.out.println("Area of circle is "+area);
    }
}