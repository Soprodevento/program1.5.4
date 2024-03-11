public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        getSubArrayBetween(numbers, 1, 20);

    }

    public static void getSubArrayBetween(int[] numbers, int start, int end) {
        System.out.print("[");
        boolean firstNumberPrinted = false;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                if (firstNumberPrinted) {
                    System.out.print(", ");
                }
                System.out.print(number);
                firstNumberPrinted = true;
            }
        }
        System.out.print("]");
    }
}