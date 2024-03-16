import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int[] resultArray = getSubArrayBetween(numbers, 4, 10);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                count++;
            }
        }
        int[] resultArray = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                resultArray[index] = number;
                index++;
            }
        }
        return resultArray;
    }
}
