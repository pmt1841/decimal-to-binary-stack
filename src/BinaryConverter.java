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
        convertDecimalToBinary(18);
        convertDecimalToBinary(0);
        convertDecimalToBinary(4);
        convertDecimalToBinary(2001);
    }
}
