package Day2.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(matrix));;

    }
}
