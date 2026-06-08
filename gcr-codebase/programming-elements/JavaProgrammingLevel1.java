import java.util.Scanner;

public class Level1Programs {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        question1_HarryAge();
        question2_AveragePCM();
        question3_KmToMiles();
        question4_ProfitLoss();
        question5_PensDistribution();
        question6_UniversityFeeDiscount();
        question7_EarthVolume();

        // Uncomment these methods one by one when testing user input programs

        // question8_KmToMilesInput();
        // question9_FeeDiscountInput();
        // question10_HeightConverter();
        // question11_BasicCalculator();
        // question12_TriangleArea();
        // question13_SquareSide();
        // question14_FeetToYardsMiles();
        // question15_TotalPurchasePrice();
        // question16_MaximumHandshakes();
    }

    // Question 1 - Harry Age
    public static void question1_HarryAge() {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }

    // Question 2 - Average PCM Marks
    public static void question2_AveragePCM() {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is " + average);
    }

    // Question 3 - Kilometer to Miles
    public static void question3_KmToMiles() {
        double km = 10.8;
        double miles = km / 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    // Question 4 - Profit and Loss
    public static void question4_ProfitLoss() {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage + "%");
    }

    // Question 5 - Pens Distribution
    public static void question5_PensDistribution() {
        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " +
                pensPerStudent +
                " and the remaining pen not distributed is " +
                remainingPens);
    }

    // Question 6 - University Fee Discount
    public static void question6_UniversityFeeDiscount() {
        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " +
                discount +
                " and final discounted fee is INR " +
                finalFee);
    }

    // Question 7 - Volume of Earth
    public static void question7_EarthVolume() {
        double radiusKm = 6378;

        double volumeKm =
                (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double volumeMiles =
                volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm +
                " and cubic miles is "
                + volumeMiles);
    }

    // Question 8 - Kilometer to Miles (User Input)
    public static void question8_KmToMilesInput() {

        System.out.print("Enter km: ");
        double km = sc.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " +
                miles +
                " mile for the given " +
                km +
                " km");
    }

    // Question 9 - Fee Discount (User Input)
    public static void question9_FeeDiscountInput() {

        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " +
                discount +
                " and final discounted fee is INR " +
                finalFee);
    }

    // Question 10 - Height Converter
    public static void question10_HeightConverter() {

        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " +
                cm +
                " while in feet is " +
                feet +
                " and inches is " +
                remainingInches);
    }

    // Question 11 - Basic Calculator
    public static void question11_BasicCalculator() {

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
    }

    // Question 12 - Area of Triangle
    public static void question12_TriangleArea() {

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);
    }

    // Question 13 - Side of Square
    public static void question13_SquareSide() {

        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " +
                side +
                " whose perimeter is " +
                perimeter);
    }

    // Question 14 - Feet to Yards and Miles
    public static void question14_FeetToYardsMiles() {

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " +
                yards +
                " and distance in miles is " +
                miles);
    }

    // Question 15 - Total Purchase Price
    public static void question15_TotalPurchasePrice() {

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice +
                " if the quantity "
                + quantity +
                " and unit price is INR "
                + unitPrice);
    }

    // Question 16 - Maximum Handshakes
    public static void question16_MaximumHandshakes() {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum possible handshakes = " +
                handshakes);
    }
}