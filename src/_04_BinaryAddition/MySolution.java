package _04_BinaryAddition;

public class MySolution {
    public static String addBinary(int a, int b) {
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }

    static void printBinary(int[] binary, int id) {
        for (int i = id - 1; i >= 0; --i) {
            System.out.println(binary[i] + "");

        }
        printBinary(binary, id);
    }

    public static void decimalToBinary(int num) {
        int[] binary = new int[35];
        int id = 0;

        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
    }
}
