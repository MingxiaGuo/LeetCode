# 001.Two Sum  

## question
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

### example
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].

## Solution
### Approach #1 (Brute Forece)
	public int[] twoSum(int[] nums, int target) {
    	for (int i = 0; i < nums.length; i++) {
       		for (int j = i + 1; j < nums.length; j++) {
            	if (nums[j] == target - nums[i]) {
                	return new int[] { i, j };
            	}
        	}
    	}
    	throw new IllegalArgumentException("No two sum solution");
	}

时间复杂度: O(n^2)

空间复杂度：O(1)
### Approach #2(Two-pass Hash Table)
	public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
        	map.put(nums[i], i);
    	}
    	for (int i = 0; i < nums.length; i++) {
        	int complement = target - nums[i];
        	if (map.containsKey(complement) && map.get(complement) != i) {
            	return new int[] { i, map.get(complement) };
        	}
   		}
    	throw new IllegalArgumentException("No two sum solution");
	}

时间复杂度: O(n)

空间复杂度：O(n)
### Approach #3 (One-pass Hash Table)
	public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
        	int complement = target - nums[i];
        	if (map.containsKey(complement)) {
            	return new int[] { map.get(complement), i };
        	}
        	map.put(nums[i], i);
    	}
    	throw new IllegalArgumentException("No two sum solution");
}
时间复杂度: O(n)

空间复杂度：O(n)
##Tag
Hash Table , Array