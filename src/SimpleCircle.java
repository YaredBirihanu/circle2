import java.util.Scanner;

public class SimpleCircle {
    public static void main(String[] args) {
        /*
        SimpleCircle circle1=new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        SimpleCircle circle2=new SimpleCircle(20);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        SimpleCircle circle3=new SimpleCircle(125);
        System.out.println("The area of the circle of radius " +circle3.radius + " is " + circle3.getArea());
        circle2.radius=100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
    double radius;
    SimpleCircle(){
        radius=1;
    }
    SimpleCircle(double newRadius){
        radius=newRadius;
    }
    double getArea(){
        return radius*radius*Math.PI;*/

       Scanner yared=new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        int var=yared.nextInt();
        double area=2*var*var*3.14;
        System.out.println("area of the circle of radius " + var + "  is 5" + area);
    }

}
