public class SpecialArrayProduct{
    private int[] in;
    private int[] out;
    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        SpecialArrayProduct demo = new SpecialArrayProduct(test);
        for(int i = 0; i < test.length; ++i){
            System.out.println(demo.in[i]+" -> "+demo.out[i]);
        }
    }
    public SpecialArrayProduct(int[] input){
        this.in = input;
        out = productExceptSelf(input);
    }
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        for(int i = 0; i < nums.length; ++i){
            out[i] = nums[(i+1)%nums.length];
        }
        return out;
    }
}