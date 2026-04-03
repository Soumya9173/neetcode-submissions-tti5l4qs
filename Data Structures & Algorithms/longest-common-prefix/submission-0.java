class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prev = "", curr = "";
        for(int i = 0; i < strs[0].length(); i++)
        {
            curr = curr + strs[0].charAt(i);
            for(String str : strs)
                if(!str.startsWith(curr))
                    return prev;
            prev = curr;
        }
        return prev;
    }
}