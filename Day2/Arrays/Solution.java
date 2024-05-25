package Day2.Arrays;

public class Solution {
    // leet code 1920. Build Array from Permutation
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
    

    //leetcode 1929. Concatenation of Array
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] result = new int[size * 2];
        for (int i = 0; i < size; i++) {
            result[i] = nums[i];
            result[size + i] = nums[i];
        }
        return result;
    }
    

    //1480. Running Sum of 1d Array
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
