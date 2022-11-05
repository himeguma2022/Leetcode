public class TwoSum {
    private int[] in;
    private int target;
    private int[] out;

    public TwoSum(int[] input, int target){
        in = input;
        this.target = target;
        out = twoSum(input, target);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for(int i = 0; i < nums.length - 1; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }
    public int[] twoSumSorted(int[] numbers, int target) {
        int[] solution = new int[2];
        for(int i = 0; i < numbers.length; ++i){
            int j = i + 1;
            while(j < numbers.length && numbers[i] + numbers[j] < target){
                ++j;
            }
            if(j < numbers.length && numbers[i] + numbers[j] == target){
                solution[0] = i;
                solution[1] = j;
                return solution;
            }
        }
        return solution;
    }
    public int[] twoSumSorted2(int[] numbers, int target){
        return shrinkSearch(numbers, target, 1, numbers.length );
    }
    public int[] shrinkSearch(int[] numbers, int target, int indexA, int indexB) {
        if(numbers[indexA - 1]+numbers[indexB - 1] > target){
            return shrinkSearch(numbers, target, indexA, --indexB);
        }
        if(numbers[indexA - 1]+numbers[indexB - 1] < target){
            return shrinkSearch(numbers, target, ++indexA, indexB);
        }
        int[] solution = {indexA,indexB};
        return solution;
    }
}
