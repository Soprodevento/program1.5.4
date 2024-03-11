public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        getSubArrayBetween(numbers,1,11);
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
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
        return numbers;
    }
}
