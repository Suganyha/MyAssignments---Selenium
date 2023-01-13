package JavaChallenge;

import java.util.Arrays;

public class Day4Assignmentoddoneout {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1};
		    Arrays.sort(nums);
		    System.out.println(Arrays.toString(nums));
		    for (int j = 0; j < nums.length; j++) {
		        if(j==0) {
		            if(nums[j]!=nums[j+1]) {
		                System.out.println("The unique number is :"+nums[j]);
		            }
		        }else
		        if(j==nums.length-1) {
		            if(nums[j]!=nums[j-1]) {
		                System.out.println("The unique number is :"+nums[j]);
		            }
		        }else
		        if(nums[j]!=nums[j+1] && nums[j]!=nums[j-1]) {
		            System.out.println("The unique number is :"+nums[j]);
		        }
		    }
		}
}

		

	


