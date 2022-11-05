public class binaryStringAddition {
    private String agentA;
    private String agentB;
    private String result;
    public static void main(String[] args) {
        test("0","0");
        test("1","1");
        test("11","11");
        
        test("11","1");
        
        test("1010","1011");
        test("1100101","1001101");
        test("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
    }
    public static void test(String c, String d){
        binaryStringAddition test = new binaryStringAddition(c,d);
        System.out.println(test.agentA + " + "+ test.agentB + " = " + test.result);
    }
    public binaryStringAddition(String a, String b){
        agentA = a;
        agentB = b;
        result = addBinary(a,b);
    }
    public String addBinary(String a, String b) {
        int resultMaxLength = Math.max(a.length(), b.length())+1;
        for(int i = 0; i < resultMaxLength; ++i){
            if(a.length()<resultMaxLength){
                a = "0"+a;
            }
            if(b.length()<resultMaxLength){
                b ="0"+b;
            }
        }
        String sum = "";
        String carry = "";
        for(int i = resultMaxLength - 1; i > -1; --i){
            if(a.charAt(i)==b.charAt(i)){
                sum = "0"+sum;
                if(a.charAt(i)=='1'){
                    carry = "1"+carry;
                } else{
                    carry = "0"+carry;
                }
            }
            else{
                carry="0"+carry;
                sum="1"+sum;
            }
        }
        if(InitialOne(carry).equals("0")){
            return InitialOne(sum);
        }
        return addBinary(sum, carry+"0");
    }
    public String InitialOne(String dealWith){
        if(dealWith.equals("0")){
            return "0";
        }
        else{
            if(dealWith.startsWith("0")){
                return InitialOne(dealWith.substring(1));
            } 
            else{
                return dealWith;
            }
        }
    }
    
}
