import java.util.Scanner;

public class AreaCalculator {
    
    // Method for Circle: Area = π * r^2
    public static float calculateArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    // Method for Rectangle: Area = l * b
    public static float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    // Method for Triangle: Area = 0.5 * b * h
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read input for Circle
        float radius = sc.nextFloat();
        
        // 2. Read input for Rectangle
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        
        // 3. Read input for Triangle
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        // Call methods and print results formatted to 2 decimal places
        // The different parameter types trigger the correct overloaded method
        System.out.printf("%.2f\n", calculateArea(radius));
        System.out.printf("%.2f\n", calculateArea(length, breadth));
        System.out.printf("%.2f\n", calculateArea(base, height));
        
        sc.close();
    }
}