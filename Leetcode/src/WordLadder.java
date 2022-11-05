import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordLadder {
    //inputs
    String startOff;
    String end;
    List<String> dict;
    //output
    int out;
    public static void main(String[] args) {
        String beginWith = "hit";
        String endWith = "cog";
        String[] listedOut = {"hot","dot","dog","lot","log","cog"};
        List<String> inputList = new LinkedList<String>(Arrays.asList(listedOut));
        WordLadder demo = new WordLadder(beginWith, endWith, inputList);
        System.out.println(demo.out);
        beginWith = "hot";
        endWith = "dog";
        String[] listedOut2 = {"hot","cog","dog","tot","hog","hop","pot","dot"};
        inputList = new LinkedList<String>(Arrays.asList(listedOut2));
        demo = new WordLadder(beginWith, endWith, inputList);
        System.out.println(demo.out);
        beginWith = "hit";
        endWith = "cog";
        String[] listedOut3 = {"hot","dot","tog","cog"};
        inputList = new LinkedList<String>(Arrays.asList(listedOut3));
        demo = new WordLadder(beginWith, endWith, inputList);
        System.out.println(demo.out);
        beginWith = "hot";
        endWith = "dog";
        String[] listedOut4 = {"hot","dog"};
        inputList = new LinkedList<String>(Arrays.asList(listedOut4));
        demo = new WordLadder(beginWith, endWith, inputList);
        System.out.println(demo.out);
        beginWith = "ymain";
        endWith = "oecij";
        String[] listedOut5 = {"ymann","yycrj","oecij","ymcnj","yzcrj","yycij","xecij","yecij","ymanj","yzcnj","ymain"};
        inputList = new LinkedList<String>(Arrays.asList(listedOut5));
        demo = new WordLadder(beginWith, endWith, inputList);
        System.out.println(demo.out);
        beginWith = "qa";
        endWith = "sq";
        String[] listedOut6 = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
        inputList = new LinkedList<String>(Arrays.asList(listedOut6));
        demo = new WordLadder(beginWith, endWith, inputList);
        System.out.println(demo.out);
    }
    public WordLadder(String start, String end, List<String> dictionary){
        this.startOff = start;
        this.end = end;
        dict = dictionary;
        out = ladderLength(start, end, dict);
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        int maxSim = similar(beginWord, endWord);
        if(maxSim == 0){
            return 1;
        }
        String potentialStart = "";
        wordList.remove(beginWord);
        int minSim = maxSim;
        int maxCheck = wordList.size() - 1;
        for(int i = maxCheck; i > -1; --i){
            int startWordRank = similar(beginWord,wordList.get(i));
            int endWordSimRank = similar(endWord,wordList.get(i));
            if(endWordSimRank > maxSim){
                if(potentialStart.equals("")&&startWordRank==1){
                    potentialStart = wordList.get(i);
                }
                wordList.remove(i);
            }
            else if(startWordRank==1&&(potentialStart.equals("")||minSim > endWordSimRank)){
                potentialStart = wordList.get(i);
                minSim = similar(potentialStart, endWord);
            }
        }
        int potentialResult;
        if(potentialStart.equals("")){
            return 0;
        } else{
            potentialResult = ladderLength(potentialStart, endWord, wordList);
            if(potentialResult != 0){
                return potentialResult + 1;
            }
            return potentialResult;
        }
    }
    public int similar(String wordA, String wordB){
        int differentChars = 0;
        if(wordA.length()!=wordB.length()){
            return 0;
        }
        for(int i = 0; i < wordA.length(); ++i){
            if(wordA.charAt(i)!=wordB.charAt(i)){
                ++differentChars;
            }
        }
        return differentChars;
    }
    
}
