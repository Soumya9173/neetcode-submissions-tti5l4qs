class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int n : nums)
            ans.add(n);
        return ans.size() != nums.length;
        
    }
}