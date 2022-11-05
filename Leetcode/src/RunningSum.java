public class RunningSum {
    private int[] nums;
    private int[] output;
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5,6,7}; 
        int[] test2 = new int[1000];
        for(int i = 0; i < test2.length; ++i){
            test2[i] = (int)(10000*Math.random());
        }
        displayOutput(test1);
        displayOutput(test2);

        
    }
    public RunningSum(int[] input){
        nums = input;
        output = runningSum(nums);
    }
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; ++i){
            sum = sum + nums[i];
            output[i] = sum;
        }
        return output;
    }
    public static void displayOutput(int[] input){
        RunningSum attempt1 = new RunningSum(input);
        for(int i = 0; i < attempt1.nums.length; ++i){
            System.out.println("Term number "+(i+1)+":\t"+attempt1.nums[i] +"->"+attempt1.output[i] );
        }
    }
}