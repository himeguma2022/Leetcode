public class PowerOfTwo {
    private int input;
    private boolean output;

    public static void main(String[] args) {
        int[] inputs = {1, 536870912};
        boolean[] expected = {true, true};

        for(int i = 0; i < inputs.length; ++i){
            PowerOfTwo testing = new PowerOfTwo(inputs[i]);
            System.out.println("Test 1 passed: " + (testing.output == expected[i]));
        }
    }
    public PowerOfTwo(int input){
        this.input = input;
        output = isPowerOfTwo(this.input);
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }
}
