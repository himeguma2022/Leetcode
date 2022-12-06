import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EqualizeFrequency {
    private String word;
    private boolean out;

    public static void main(String[] args) {
        String[] inputs = { 
                            "zz",
                            "aabcbb",
                            "abbcc",
                            "cccaa",
                            "abcc", 
                            "aazz",
                            "bac"
                        };
        boolean[] expects = {   
                                true,
                                false,
                                true,
                                true,
                                true, 
                                false,
                                true,
                                };
        for(int i = 0; i < inputs.length; ++i){
            EqualizeFrequency A = new EqualizeFrequency(inputs[i]);
            System.out.println("Test #"+i+" Passed: "+(A.out == expects[i]));
        } 
    }
    public EqualizeFrequency(String input){
        word = input;
        out = equalFrequency(word);
    }
    public boolean equalFrequency(String word) {
        Map<Character,Integer> frequencyCounter = new HashMap<Character, Integer>();
        for(int i = 0; i < word.length(); ++i){
            char check = word.charAt(i);
            if(!frequencyCounter.containsKey(check)){
                frequencyCounter.put(check, 1);
            } else{
                int count = frequencyCounter.get(check);
                frequencyCounter.remove(check);
                ++count;
                frequencyCounter.put(check,count);
            }
        }
        if(frequencyCounter.size() == 1){
            return true;
        }
        int highFreq = 1;
        int lowFreq = Integer.MAX_VALUE;
        int highFreqCount = 1;
        int lowFreqCount = 1;
        Set<Character> register = frequencyCounter.keySet();
        Object[] letters = register.toArray();
        ArrayList<Integer> vals = new ArrayList();
        for(int i = 0; i < register.size(); ++i){
            int checkVal = frequencyCounter.get(letters[i]);
            if(!vals.contains(checkVal)){
                vals.add(checkVal);
            }
            if(vals.size() > 2){
                return false;
            }
            if(checkVal > highFreq){
                highFreq = checkVal;
                highFreqCount = 1;
            } else if(checkVal == highFreq){
                ++highFreqCount;
            }
            if(checkVal < lowFreq){
                lowFreq = checkVal;
                lowFreqCount = 1;
            } else if(lowFreq == checkVal){
                ++lowFreqCount;
            }
            
            if(checkVal != highFreq && checkVal != lowFreq){
                return false;
            }
        }
        if(highFreq == 1 && lowFreq == 1){
            return true;
        }
        if(lowFreq == 1 && lowFreqCount == 1){
            return true;
        }
        if(highFreqCount != 1){
            return false;
        }
        if(highFreq != lowFreq + 1){
            return false;
        }
        return true;
    }
}
