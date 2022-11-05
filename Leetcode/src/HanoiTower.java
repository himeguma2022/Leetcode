import java.util.Stack;

public class HanoiTower {
    private Stack<Integer> source;
    private Stack<Integer> spare;
    private Stack<Integer> target;
    private int moves;
    private boolean solved;
    private int size;

    public static void main(String[] args) {
        HanoiTower demo = new HanoiTower(5);
        demo.solve(0);
        System.out.println(demo.moves);
    }
    public HanoiTower(int size){
        this.size = size;
        moves = 0; 
        solved = false;
        source = new Stack<Integer>();
        spare = new Stack<Integer>();
        target = new Stack<Integer>();
        for(int i = size; i > 0; --i){
            source.push(i);
        }
    }
    public HanoiTower() {
    }
    public void solve(int lastMove){
        ++moves;
        if(moves == 1){
            if(size%2 == 1){
                target.push(source.pop());
                if(size > 2){
                    ++moves;
                    spare.push(source.pop());
                    lastMove = spare.peek();
                }
            } else{
                spare.push(source.pop());
                ++moves;
                target.push(source.pop());
                lastMove = target.peek();
            }
        } else if(bestMove(source, target, lastMove)){
            target.push(source.pop());
            lastMove = target.peek();
        } else if(bestMove(spare, target, lastMove)){
            target.push(spare.pop());
            lastMove = target.peek();
        } else if(bestMove(source, spare, lastMove)){
            spare.push(source.pop());
            lastMove = spare.peek();
        } else if(bestMove(spare, source, lastMove)){
            source.push(spare.pop());
            lastMove = source.peek();
        } else if(bestMove(target, spare, lastMove)){
            spare.push(target.pop());
            lastMove = spare.peek();
        } else if(bestMove(target, source, lastMove)){
            source.push(target.pop());
            lastMove = source.peek();
        } else if(target.isEmpty()){
            if(lastMove == spare.peek()){
                target.push(source.pop());
            } else{
                target.push(spare.pop());
            }
            lastMove = target.peek();
        } else if(source.isEmpty()){
            if(lastMove == target.peek()){
                source.push(spare.pop());
            } else{
                source.push(target.pop());
            }
            lastMove = source.peek();
        } else if(spare.isEmpty()){
            if(lastMove == target.peek()){
                spare.push(source.pop());
            } else{
                spare.push(target.pop());
            }
            lastMove = spare.peek();
        }
        else{
            moves = -1;
        }
        System.out.println(print());
        if(target.size() == size){
            solved = true;
        }
        if(solved == false && moves != -1){
            solve(lastMove);
        }
    }
    public boolean validMove(Stack<Integer> depFrom, Stack<Integer> arriveTo){
        if(depFrom.isEmpty()){
            return false;
        }
        if(arriveTo.isEmpty()){
            return true;
        }
        if(depFrom.peek() < arriveTo.peek()){
            return true;
        }
        return false;
    }
    public boolean unmatchedOddEven(Stack<Integer> depFrom, Stack<Integer> arrTo){
        if(depFrom.isEmpty()){
            return false;
        }
        if(arrTo.isEmpty()){
            return true;
        }
        if(depFrom.peek()%2 == arrTo.peek()%2){
            return false;
        }
        return true;
    }
    public boolean bestMove(Stack<Integer> from, Stack<Integer> to, int lastMove){
        return unmatchedOddEven(from, to)&&from.peek()!=lastMove&&!to.isEmpty()&&validMove(from,to);
    }
    public String print(){
        String out = "";
        HanoiTower copy = new HanoiTower();
        copy.source = (Stack<Integer>)source.clone();
        copy.spare = (Stack<Integer>)spare.clone();
        copy.target = (Stack<Integer>)target.clone();
        while(!copy.source.isEmpty()){
            out = out + "\t"+copy.source.pop();
        }
        out = out + "\n";
        while(!copy.spare.isEmpty()){
            out = out + "\t"+copy.spare.pop();
        }
        out = out + "\n";
        while(!copy.target.isEmpty()){
            out = out + "\t"+copy.target.pop();
        }
        out = out + "\n";
        return out;
    }
}
