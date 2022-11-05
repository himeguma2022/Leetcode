import java.util.*;
public class containsDuplicate {
    private int[] input;
    private boolean hasDuplicate;

    public static void main(String[] args) {
        int[] test1 = {1,2,3,1};
        int[] test2 = {1,2,3,4};
        int[] test3 = {1,1,1,3,3,4,3,2,4,2};
        test(test1);
        test(test2);
        test(test3);
    }
    private static void test(int[] in) {
        containsDuplicate tryOut = new containsDuplicate(in);
        System.out.println("Array starting with "+tryOut.input[0]+" has duplicates: "+tryOut.hasDuplicate);
    }
    public containsDuplicate(int[] nums){
        input = nums;
        hasDuplicate = BetterContainsDuplicate(nums);
    }
    public boolean containsDuplicate(int[] nums) {
        Set numList = new HashSet();
        for(int i = 0; i < nums.length; ++i){
            if(numList.contains(nums[i])){
                return true;
            }
            numList.add(nums[i]);
        }
        return false;
    }
    public boolean BetterContainsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numList = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i){
            if(!numList.containsKey(nums[i])){
                numList.put(nums[i],0);
            }
            int currNum = numList.get(nums[i]);
            currNum++;
            numList.put(nums[i],currNum);
            /*if(currNum == 3){
                return true;
            }*/
        }
        return false;
    }
}