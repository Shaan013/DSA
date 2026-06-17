package math;
public class Main {

    public static int findLargestElement(int[] numbers) {
        int big = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > big) {
                big = numbers[i];
            }
        }
        return big;
    }

    public static int findSecondLargestElement(int[] numbers) {
        int first = 0, second = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first) {
                second = first;
                first = numbers[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        // Test your code here
        int[] testArray = { 3, 5, 7, 2, 8, 1, 14 };
        System.out.println("Largest element: " + findLargestElement(testArray));
        System.out.println("Largest second  element: " + findSecondLargestElement(testArray));
    }
}