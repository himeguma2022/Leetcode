public class MinStack {
    MinStack covered;
    int topVal;
    int min;
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
    public MinStack() {
        covered = null;
    }
    
    public void push(int val) {
        if(covered == null){
            min = val;
        }
        covered = this;
        topVal = val;
        if(min > val){
            min = val;
        }
    }
    
    public void pop() {
        if(topVal == min){
            min = covered.min;
        }
        this.topVal = covered.topVal;
        this.covered = covered.covered;
    }
    
    public int top() {
        return topVal;
    }
    
    public int getMin() {
        return min;
    }
}