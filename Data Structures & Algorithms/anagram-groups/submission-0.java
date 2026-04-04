class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String str : strs)
        {
            char[] arr =  str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(set.contains(sorted))
                continue;
            List<String> temp = new ArrayList<>();
            for(String s : strs)
            {
                if(isAnagram(str, s))
                    temp.add(s);
            }
            ans.add(temp);
            set.add(sorted);
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++)
            if(alphabet[i] != 0)
                return false;
        return true;
    }
}
