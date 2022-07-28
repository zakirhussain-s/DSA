/*
problem no: 26
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores). The input should be in given format even after removing/shifting
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int j=0;j<nums.length;j++){
            if( nums[k] != nums[j]){
                k++;
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
            }
        }
        return k+1;
    }
}
