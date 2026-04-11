class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(curr != nums[i])
            {
                curr = nums[i];
                nums[j++] = nums[i];
            }
        }
        return j;

    }
}