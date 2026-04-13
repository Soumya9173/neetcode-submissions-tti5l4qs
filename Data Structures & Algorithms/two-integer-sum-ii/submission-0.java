class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        for(int i = 0; i < l; i++)
        {
            int req = target - numbers[i];
            int left = i + 1;
            int right = l - 1;
            while (left <= right)
            {
                int mid = (left + right) / 2;
                if(numbers[mid] == req)
                    return new int[] {i + 1, mid + 1};
                else if(numbers[mid] > req)
                    right = mid - 1;
                else 
                    left = mid + 1; 
            }
        }
        return new int[] {0, 0};
    }
}
