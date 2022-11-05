public class longestCommonPrefix{
    private String[] in;
    private String out;
    public static void main(String[] args) {
        String[] using = {"dog","racecar","car"};
        longestCommonPrefix demo = new longestCommonPrefix(using);
        System.out.println(demo.out);
    }
    public longestCommonPrefix(String[]in){
        this.in = in;
        out = solution(in);
    }
    public String solution(String[] strs) {
        String output = "";
        int maxPrefixLength = findSmall(strs);
        for(int i = 0; i < maxPrefixLength; ++i){
            if(allMatch(strs, i)){
                output = output+strs[0].charAt(i);
            } else{
                i = maxPrefixLength;
            }
        }
        return output;
    }
    private boolean allMatch(String[] strs, int index) {
        for(int i = 1;  i < strs.length; ++i){
            if(strs[0].charAt(index)!=strs[i].charAt(index)){
                return false;
            }
        }
        return true;
    }
    private int findSmall(String[] strs) {
        int out = strs[0].length();
        for(int i = 1; i < strs.length; ++i){
            if(out > strs[i].length()){
                out =  strs[i].length();
            }
        }
        return out;
    }
}