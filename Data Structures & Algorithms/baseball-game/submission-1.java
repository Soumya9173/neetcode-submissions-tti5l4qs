class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stk = new ArrayDeque<>();
        for(int i = 0; i < operations.length; i++)
        {
            if(operations[i].equals("C"))
                stk.pop();
            else if(operations[i].equals("D"))
                stk.push(2 * stk.peek());
            else if(operations[i].equals("+"))
            {
                int f = stk.pop();
                int s = stk.pop();
                stk.push(s);
                stk.push(f);
                stk.push(s + f);
            }
            else
                stk.push(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        for(int x : stk) 
            sum += x;
        return sum;
    }
}