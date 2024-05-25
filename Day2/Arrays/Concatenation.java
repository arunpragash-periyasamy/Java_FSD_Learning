package Day2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; array[i] = scanner.nextInt(), i++);
        scanner.close();
        int[] result = solution.getConcatenation(array);
        System.out.println(Arrays.toString(result));
    }
}
