package Day2.Arrays;

import java.util.Arrays;

class Permutation {
    public static void main(String[] args) {
        // leet code 1920. Build Array from Permutation
        int[] array = { 0, 2, 1, 5, 3, 4 };
        Solution solution = new Solution();
        int[] result = solution.buildArray(array);
        System.out.println(Arrays.toString(result));
    }
}