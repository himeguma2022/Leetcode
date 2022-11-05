import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Subsets {
    private int[] in;
    private List<List<Integer>> out;

    public static void main(String[] args) {
        int[] test = {1,2,3};
        Subsets demo = new Subsets(test);
        for(int i = 0; i < demo.out.size(); ++i){
            for(int j = 0; j < demo.out.get(i).size(); ++j){
                System.out.print(demo.out.get(i).get(j)+ ", ");
            }
            System.out.print("\n");
        }
    }
    public Subsets(int[] input){
        in = input;
        out = subsets(in);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        Set<Set<Integer>> count = new HashSet<Set<Integer>>();
        List<List<Integer>> output = new LinkedList<List<Integer>>();
        for(int i = 0; i < nums.length; ++i){
            Set<Integer> addTo = new HashSet<Integer>();
            addTo.add(nums[i]);
            count.add(addTo);
            List<Integer> Collected = new LinkedList<Integer>();
            Collected.addAll(addTo);
            output.add(Collected);
            for(int j = i + 1; j < nums.length; ++j){
                addTo.add(nums[j]);
                count.add(addTo);
                Collected = new LinkedList<Integer>();
                Collected.addAll(addTo);
                output.add(Collected);
            }
        }
        output.add(new LinkedList<Integer>());
        return output;
    }
}
