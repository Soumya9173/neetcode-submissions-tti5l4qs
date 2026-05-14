class MinStack {
    List<Integer> stk;
    List<Integer> minstk;
    public MinStack() {
        stk = new ArrayList<>();
        minstk = new ArrayList<>();
    }
    
    public void push(int val) {
        stk.add(val);
        if(minstk.size() == 0)
        {
            minstk.add(val);
            return;
        }
        if(minstk.get(minstk.size() - 1) >= val)
            minstk.add(val);
    }
    
    public void pop() {
        int val = stk.get(stk.size() - 1);
        stk.remove(stk.size() - 1);
        if(val == minstk.get(minstk.size() - 1))
            minstk.remove(minstk.size() - 1);
    }
    
    public int top() {
        return stk.get(stk.size() - 1);
    }
    
    public int getMin() {
        return minstk.get(minstk.size() - 1);
    }
}
