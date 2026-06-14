
import java.util.Scanner;

class Q3_ToCharArray {

    static char[] getCharacters(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Arrays Equal? " +
                compareArrays(customArray, builtInArray));
    }
}