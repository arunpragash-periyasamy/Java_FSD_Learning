package Day2.Arrays;

import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
    

// 1672. Richest Customer Wealth
public int maximumWealth(int[][] accounts) {
    int richestWealth = 0;
    for (int i = 0; i < accounts.length; i++) {
        int totalWealth = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            totalWealth += accounts[i][j];
        }
        richestWealth = Math.max(richestWealth, totalWealth);
        // richestWealth = (richestWealth < totalWealth)? totalWealth : richestWealth; // alternative for Math.max
    }
    return richestWealth;
}
    
// 54. Spiral Matrix
public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;
        List<Integer> list = new ArrayList<Integer>();
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart; i <= colEnd; i++){
                list.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i = rowStart; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd && colStart <= colEnd){
                for(int i = colEnd; i >= colStart; i--){
                    list.add(matrix[rowEnd][i]);
                }
                rowEnd--;
                for(int i = rowEnd; i >= rowStart; i--){
                    list.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return list;
    }
}
