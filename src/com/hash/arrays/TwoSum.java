package com.hash.arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i != j && (nums[i] + nums[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }return ans;
    }
}
