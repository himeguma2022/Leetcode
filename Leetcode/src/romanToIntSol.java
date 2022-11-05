public class romanToIntSol {
    private String romanNum;
    private int num;
    public static void main(String[] args) {
        test("M");
        test("MM");
        test("MCM");
        test("MMCM");
        test("CM");
        test("CD");
        test("MCD");
        test("MC");
        test("MD");
        test("MDC");
        test("MMMXLV");
    }
    public romanToIntSol(String a){
        romanNum = a;
        num = romanToInt(a);
    }
    public int romanToInt(String s) {
        if(s.equals("")){
            return 0;
        }
        if(s.length()>1&&s.substring(0,2).equals("CM")){
            return 900 + romanToInt(s.substring(2));
        }
        if(s.charAt(0) == 'M'){
            return 1000 + romanToInt(s.substring(1));
        }
        if(s.length()>1&&s.substring(0,2).equals("CD")){
            return 400 + romanToInt(s.substring(2));
        }
        if(s.charAt(0) == 'D'){
            return 500 + romanToInt(s.substring(1));
        }
        if(s.charAt(0) == 'C'){
            return 100 + romanToInt(s.substring(1));
        }
        if(s.length()>1&&s.substring(0,2).equals("XC")){
            return 90 + romanToInt(s.substring(2));
        }
        if(s.length()>1&&s.substring(0,2).equals("XL")){
            return 40 + romanToInt(s.substring(2));
        }
        if(s.length()>1&&s.substring(0,2).equals("IX")){
            return 9 + romanToInt(s.substring(2));
        }
        if(s.length()>1&&s.substring(0,2).equals("IV")){
            return 4 + romanToInt(s.substring(2));
        }
        if(s.charAt(0) == 'L'){
            return 50 + romanToInt(s.substring(1));
        }
        if(s.charAt(0) == 'X'){
            return 10 + romanToInt(s.substring(1));
        }
        if(s.charAt(0) == 'V'){
            return 5 + romanToInt(s.substring(1));
        }
        if(s.charAt(0) == 'I'){
            return 1 + romanToInt(s.substring(1));
        }
        return 0;
    }
    public static void test(String attempt){
        romanToIntSol test = new romanToIntSol(attempt);
        System.out.println(test.romanNum + " -> "+test.num);
    }
}