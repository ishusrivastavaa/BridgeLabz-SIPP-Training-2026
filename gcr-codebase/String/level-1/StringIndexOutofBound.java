

import java.util.Scanner;

class Q5_StringIndexOutOfBounds {

    static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);
    }
}