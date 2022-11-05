public class LyrchelSolve {
    private long input;
    private long output;
    private long steps;
    private boolean solutionFound;
    private boolean analysis;
public static void main(String[] args) {
    boolean analysis = true;
    if(!analysis){
    for(int i = 0; i < 200; ++i){
        LyrchelSolve a = new LyrchelSolve(i,analysis);
        if(!a.solutionFound){
            System.out.println(a.input +" turns into "+a.output + " after "+ a.steps+ " steps.");
        }
    }
}
    if(analysis){
        LyrchelSolve analysis1 = new LyrchelSolve(196,analysis);
        System.out.println("\n"+analysis1.input +" turns into "+analysis1.output + " after "+ analysis1.steps+ " steps.");
    }
}
public LyrchelSolve(long input,boolean analysis) {
        this.input = input;
        steps = 0;
        this.analysis = analysis;
        output = solver(input);
        solutionFound = false;
        validateSolution();
    }
    private void validateSolution() {
        if(output < 0){
            System.out.println("Solution for " +input +" is out of long range.");
        }
        else{
            solutionFound = true;
        }
}
    private long solver(long number) {
        long solution = number;
        if(analysis){
            System.out.print(solution + " -> ");
        }
        if(palindrome(solution)){
            return solution;
        }
        solution = solution + reverseNum(solution);
        steps++;
        return solver(solution);
}
    public boolean palindrome(long number){
        String in = ""+number;
        for(int i = 0; i < in.length(); ++i){
            if(in.charAt(i)!=in.charAt(in.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public long reverseNum(long number){
        long remainder;
        long reversedNum = 0;
    // get the reverse of originalNum
    // store it in variable
    while (number != 0) {
      remainder = number % 10;
      reversedNum = reversedNum * 10 + remainder;
      number /= 10;
        }
    return reversedNum;
    }
}
