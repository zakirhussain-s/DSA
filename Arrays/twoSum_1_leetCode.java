/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i]))
                map.put(target - nums[i], i);
            else {
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            }
        }
        return result;
}
}