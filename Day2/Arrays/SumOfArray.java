package Day2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; array[i++] = scanner.nextInt())
            ;
            scanner.close();
        int[] result = solution.runningSum(array);
        System.out.println(Arrays.toString(result));
    }
}
