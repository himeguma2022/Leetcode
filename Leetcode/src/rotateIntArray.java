import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class rotateIntArray {
    private int[] in;
    private int rotationNumber;
    private int[] out;
    public static void main(String[] args) {
        int[] arrayIn = {1,2,3,4,5,6,7};
        rotateIntArray test1 = new rotateIntArray(arrayIn,3);
        for(int i = 0; i < test1.out.length; ++i){
            System.out.print("["+test1.out[i]+"]");
        }
    }
    public rotateIntArray(int[] in, int rotationNumber){
        this.in = in;
        this.rotationNumber = rotationNumber;
        rotate3(in, rotationNumber);
    }
        public void rotate(int[] nums, int k) {
                List<Integer> numbers = Arrays.stream(nums).boxed().toList();
                for(int i = 0; i < nums.length; ++i){
                    nums[(i+k)%nums.length] = numbers.get(i);
                }
                out = nums;
        }
        public void rotate2(int[] nums, int k) {
            int[] newNums= new int[nums.length];
            for(int i = 0; i < nums.length; ++i){
                newNums[(i+k)%nums.length] = nums[i];
            }
            out = newNums;
        }
        public void rotate3(int[] nums, int k) {
            int[] copy = nums.clone();
            for(int i = 0; i < nums.length; ++i){
                nums[(i+k)%nums.length] = copy[i];
            }
            out = nums;
        }
    }
