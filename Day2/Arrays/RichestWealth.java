package Day2.Arrays;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 }, { 5, 8 } };
        Solution solution = new Solution();
        int richestWealth = solution.maximumWealth(accounts);
        System.out.println(richestWealth);
    }
}
