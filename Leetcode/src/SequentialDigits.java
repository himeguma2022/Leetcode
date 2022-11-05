import java.util.*;

public class SequentialDigits {
    private int low;
    private int high;
    private List <Integer> out;
    public static void main(String[] args) {
        test(100,300);
        test(1000,13000);
        test(10,1000000000);
        int divideTest = 5/3;
        System.out.println(divideTest);
    }
    private static void test(int min, int max) {
        SequentialDigits demo = new SequentialDigits(min, max);
        demo.results(min, max);
    }
    private void results(int min, int max) {
        System.out.println("Between numbers "+min+ " to "+max+", here are the numbers that are sequential in acending order");
        for(int i = 0; i < out.size(); ++i){
            System.out.print(out.get(i)+"\t");
        }
        System.out.print("\n");
    }
    public SequentialDigits(int low, int high){
        this.low = low;
        this.high = high;
        out = solution();
    }
    private List<Integer> solution() {
        List<Integer> result = new LinkedList<Integer>();
        for(int i = 1; i < 9; ++i){
            int initial = genSequence(i, 0);
            for(int j = 1; j < 10 - i; ++j){
                initial = initial + allOnes(i);
                if(initial >= low && initial <= high){
                    result.add(initial);
                }
            }
        }
        return result;
    }
    private int allOnes(int i) {
        if(i == 0){
            return 1;
        }
        return (int)Math.pow(10, i)+allOnes(--i);
    }
    private int genSequence(int i, int addIn) {
        if(i == 0){
            return addIn;
        }
        return addIn*(int)Math.pow(10, i)+genSequence(--i,++addIn);
    }
}
