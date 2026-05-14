class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, k = people.length - 1, ans = 0;
        while(l <= k)
        {
            if(people[l] + people[k] <= limit)
            {
                ans++;
                l++;
                k--;
            }
            else
            {
                k--;
                ans++;
            }
        }
        return ans;
    }
}