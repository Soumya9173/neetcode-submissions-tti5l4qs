class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int res = 1, max = 1;
        int n = arr.length;
        if(arr.length == 0)
            return 0;
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] == arr[i + 1])
                continue;
            if(arr[i] + 1 == arr[i + 1])
            {
                res++;
            }
            else
            {
                max = Math.max(res, max);
                res = 1;
            }
        }
        return (int)Math.max(res, max);

    }
}
