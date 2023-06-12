package in.ineuron;

import java.util.Arrays;

public class Seventh {
	    public static int[] searchRange(int[] nums, int target) {
	        int[] ans = {-1, -1};
	        int start = 0, end = nums.length - 1;
	        int mid = (start + end) / 2;
	        while (start <= end) {
	            mid = (start + end) / 2;
	            if (target == nums[mid]) {
	                ans[0] = mid;
	                end = mid - 1;
	            } else if (target < nums[mid]) {
	                end = mid - 1;
	            } else if (target > nums[mid]) {
	                start = mid + 1;
	            }
	        }
	        start = 0;
	        end = nums.length - 1;
	        while (start <= end) {
	            mid = (start + end) / 2;
	            if (target == nums[mid]) {
	                ans[1] = mid;
	                start = mid + 1;
	            } else if (target < nums[mid]) {
	                end = mid - 1;
	            } else if (target > nums[mid]) {
	                start = mid + 1;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		int []nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(searchRange(nums, target)) );
	}

}
