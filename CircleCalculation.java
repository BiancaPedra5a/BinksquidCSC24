import java.util.Scanner;

public class CircleCalculation {
    //Ask user for input for the radius

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        //print out results for diameter, area & circumference
        System.out.println("The diameter of this circle is: " + circleDiameter(radius));
        System.out.println("The area of this circle is: " + circleArea(radius));
        System.out.println("The circumference of this circle is: " + circleCircumference(radius));

    }

    // method area
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;

    }

    //method circumference
    public static double circleCircumference(double radius) {
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }

    //method diameter
    public static double circleDiameter(double radius) {
        double diameter = 2 * radius;
        return diameter;

    }
}
