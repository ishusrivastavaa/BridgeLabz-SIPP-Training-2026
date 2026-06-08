import java.util.Scanner;

public class Level2Programs {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Uncomment and run the required question

        // question1_BasicCalculator();
        // question2_TriangleArea();
        // question3_SquareSide();
        // question4_DistanceConverter();
        // question5_TotalPurchasePrice();
        // question6_QuotientAndRemainder();
        // question7_IntOperation();
        // question8_DoubleOperation();
    }

    // Question 1 - Basic Calculator
    public static void question1_BasicCalculator() {

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", "
                + subtraction + ", "
                + multiplication + ", and "
                + division);
    }

    // Question 2 - Area of Triangle in Square Inches and Square Centimeters
    public static void question2_TriangleArea() {

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaSqCm = 0.5 * base * height;

        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaSqIn
                + " and sq cm is "
                + areaSqCm);
    }

    // Question 3 - Side of Square from Perimeter
    public static void question3_SquareSide() {

        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side
                + " whose perimeter is "
                + perimeter);
    }

    // Question 4 - Distance in Yards and Miles
    public static void question4_DistanceConverter() {

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is "
                + yards
                + " while the distance in miles is "
                + miles);
    }

    // Question 5 - Total Purchase Price
    public static void question5_TotalPurchasePrice() {

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice
                + " if the quantity "
                + quantity
                + " and unit price is INR "
                + unitPrice);
    }

    // Question 6 - Quotient and Remainder
    public static void question6_QuotientAndRemainder() {

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is "
                + quotient
                + " and Reminder is "
                + remainder
                + " of two numbers "
                + number1
                + " and "
                + number2);
    }

    // Question 7 - IntOperation Program
    public static void question7_IntOperation() {

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("Result of a + b * c = " + result1);
        System.out.println("Result of a * b + c = " + result2);
        System.out.println("Result of c + a / b = " + result3);
        System.out.println("Result of a % b + c = " + result4);

        System.out.println("The results of Int Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", "
                + result4);
    }

    // Question 8 - DoubleOperation Program
    public static void question8_DoubleOperation() {

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("Result of a + b * c = " + result1);
        System.out.println("Result of a * b + c = " + result2);
        System.out.println("Result of c + a / b = " + result3);
        System.out.println("Result of a % b + c = " + result4);

        System.out.println("The results of Double Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", "
                + result4);
    }
}