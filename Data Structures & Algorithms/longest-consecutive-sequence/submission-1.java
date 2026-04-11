class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int res = 0;
        for(int val : nums)
            st.add(val);
        for(int val : nums)
        {
            if(st.contains(val) && !st.contains(val - 1))
            {
                int cur = val, cnt = 0;
                while(st.contains(cur))
                {
                    st.remove(cur);
                    cur++;
                    cnt++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}
