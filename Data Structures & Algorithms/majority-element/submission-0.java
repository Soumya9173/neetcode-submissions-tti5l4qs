class Solution {
    public int majorityElement(int[] nums) {
        int k = nums[0], c = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(k == nums[i])
                c++;
            else
            {
                c--;
                if(c == -1)
                {
                    k = nums[i];
                    c = 0;
                }
            }
        }
        return k;
    }
}