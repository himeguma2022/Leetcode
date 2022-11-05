public class AddDigits {
    private int in;
    private int out;

    public static void main(String[] args) {
        test(3134258);
    }
    public static void test(int input) {
        AddDigits demo = new AddDigits(input);
        System.out.println(input + " -> " + demo.out);
    }
    public AddDigits(int input){
        in = input;
        out = addDigits(input);
    }
    public int addDigits(int num) {
        String in = num+"";
        int sum = 0;
        for(int i = 0; i < in.length(); ++i){
            sum = sum + in.charAt(i)-48;
        }
        if(sum > 9){
            return addDigits(sum);
        }
        return sum;
    }
    public int addDigits2(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}
