public class Solution{
	private int[] twoSum(int[] nums,int target){
		int[] two = new int[2];
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					two[0]=i;
					two[1]=j;
				}

			}
		}
		return two;
	}
	private void print(int[] two){
		for(int i=0;i<two.length;i++){
			System.out.print(two[i]+"\t");
		}
	}

	public static void main(String []args){
		//System.out.println("请输入一个数组:");
		//System.out.println("请输入target:");
		Solution s = new Solution();
		int nums[] = {2,7,11,15};
		int target = 13;
		int two[] = s.twoSum(nums,target);
		s.print(two);
	}

}
