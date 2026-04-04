class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for(int i = 0; i < nums.length - c; )
        {
            if(nums[i] == val)
            {
                for(int j = i; j < nums.length - c - 1; j++)
                    nums[j] = nums[j + 1];
                c++;
            }
            else
                i++;
        }
        return nums.length - c;
    }
}