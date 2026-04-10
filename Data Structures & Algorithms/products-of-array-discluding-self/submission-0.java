class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, c = 0, l = nums.length;
        for(int i : nums)
        {
            if(i == 0)
                c++;
            else
                prod *= i;
        }
        if(c > 1)
            return new int[l];
        int ans[] = new int[l];
        for(int i = 0; i < l; i++)
        {
            if(c == 1 && nums[i] != 0)
                ans[i] = 0;
            else if(nums[i] == 0)
                ans[i] = prod;
            else
                ans[i] = prod / nums[i];
        }
        return ans;

    }
}  
