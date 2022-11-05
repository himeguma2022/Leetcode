import java.util.LinkedList;
import java.util.Queue;

public class WordDictionary {
    private Queue<String> WordList;
    private Queue<String> UnfitForSearch;
    private int minLength;
    private int maxLength;
    public WordDictionary() {
        WordList = new LinkedList<String>();
        UnfitForSearch = new LinkedList<String>();
        minLength = 0;
        maxLength = 0;
    }
    
    public void addWord(String word) {
        if(WordList.isEmpty()){
            minLength = word.length();
            maxLength = word.length();
        }
        WordList.add(word);
        if(word.length()<minLength){
            minLength = word.length();
        }
        if(word.length()>maxLength){
            maxLength = word.length();
        }
    }
    
    public boolean search(String word) {
        int maxFilters = WordList.size();
        if(word.length() < minLength){
            return false;
        }
        if(word.length() > maxLength){
            return false;
        }
        filter(word, 0, maxFilters);
        if(WordList.size()>0){
            reuse();
            return true;
        } else{
            reuse();
            return false;
        }
    }

    private void filter(String word, int listProgress, int max) {
        if(max>listProgress){
            if(!fitPattern(word, WordList.peek())){
                UnfitForSearch.add(WordList.poll());
            }
            filter(word, ++listProgress, max);
        }
    }

    private boolean fitPattern(String word, String noPeriod) {
        if(word.length()!=noPeriod.length()){
            return false;
        }
        if(!word.contains(".")){
            if(word.equals(noPeriod)){
                return true;
            } else{
                return false;
            }
        }
        for(int i = 0; i < word.length(); ++i){
            if(word.charAt(i)!='.'&&word.charAt(i)!=noPeriod.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public void reuse(){
        if(!UnfitForSearch.isEmpty()){
            WordList.add(UnfitForSearch.poll());
            reuse();
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */