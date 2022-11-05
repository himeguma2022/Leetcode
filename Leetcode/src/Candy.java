public class Candy {
    private int[] input;
    private int output;

    public static void main(String[] args) {
        int[] test0 = {0,0};
        int[] test1 = {0, 1};
        int[] test2 = {1, 0};
        int[] test3 = {1,0,2};
        int[] test4 = {1,2,2};
        test(test0, 2);
        test(test1, 3);
        test(test2, 3);
        test(test3, 5);
        test(test4, 4);
    }
    private static void test(int[] check, int correct) {
        Candy attempt = new Candy(check);
        boolean passed = correct == attempt.output;
        System.out.println("Passed test: "+passed);
    }
    public Candy(int[] in){
        this.input = in;
        output = candy(input);
    }

    public int candy(int[] ratings) {
        int sum = 1;
        if(ratings[0] > ratings[1]){
            return sum + candy(ratings, 1);
        } else if(ratings[0] == ratings[1]){
            return sum + candy(ratings, 2);
        } else{
            ++sum;
            return sum + candy(ratings, 1);
        }
    }

    public int candy(int[] ratings, int start){
        if(start > ratings.length - 1){
            return 1;
        }
        if(start == ratings.length - 1){
            if(ratings[start - 1] < ratings[start]){
                return 2;
            }
            else{
                return 1;
            }
        }
        int sum = 1;
        if(ratings[start - 1] > ratings[start]){
            ++sum;
            return sum + candy(ratings,++start);
        } 
        if(ratings[start - 1] == ratings[start]){
            
        }
        return sum;
    }
}
