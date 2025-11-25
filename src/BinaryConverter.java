import java.util.Scanner;
import java.util.Stack;

public class BinaryConverter {
    public static void convertDecimalToBinary(int decimal) {
        if (decimal != 0) {
            Stack<Integer> binaryStack = new Stack<>();

            while (decimal != 0) {
                binaryStack.push(decimal % 2);
                decimal /= 2;
            }

            while (!binaryStack.isEmpty()) {
                System.out.print(binaryStack.pop());
            }
            System.out.println();

        } else
            System.out.println(decimal);
    }

    public static void main(String[] args) {
        System.out.println("Binary Converter");
        System.out.print("Enter decimal number: ");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        convertDecimalToBinary(decimal);
    }
}
