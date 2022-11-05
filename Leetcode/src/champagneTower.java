public class champagneTower {
    private int poured;
    private int queryRow;
    private int queryGlass;
    private double output;
    public static void main(String[] args) {
        test(1,1,1);
        test(2,1,1);
        test(3,1,1);
        test(4,2,0);
        test(5,2,2);
        test(5,3,3);
        test(100000009, 33,17);
    }
    public static void test(int poured, int row, int glass){
        champagneTower demo = new champagneTower(poured, row, glass);
        System.out.println("After pouring "+demo.poured+" cups, ");
        System.out.println("the amount of champagne in glass on row: "+demo.queryRow);
        System.out.println("glass number: "+demo.queryGlass);
        System.out.println("is "+demo.output);
    }
    public champagneTower(int poured, int row, int glass){
        this.poured = poured;
        queryRow = row;
        queryGlass = glass;
        output = solve(poured, row, glass);
    }

    public double solve(int poured, int query_row, int query_glass) {
        if(poured < 1){
            return 0;
        }
        if(query_row == 0){
            return 1;
        }
        if(sumCount(query_row + 1) < poured ){
            return 1;
        }
        if(query_glass == 0 || query_glass == query_row ){
            double out = (poured-sumCount(query_row))*Math.pow(2,-1*query_row);
            if(out > 0){
                return out;
            }
            return 0;
        }
        return 0;
    }

    private int sumCount(int in) {
        if(in == 1){
            return 1;
        }
        int out = in;
        return out + sumCount(--in);
    }
}
