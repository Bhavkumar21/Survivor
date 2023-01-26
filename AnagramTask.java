import java.util.*;

public class AnagramTask extends PuzzleTask{
    private List<String> solutions;
    private List<String> actionOption;
    private int actionsDone;

    public AnagramTask(List<String> solutions, String description){
        super(solutions.get(0), description);
        this.solutions = solutions;
        this.actionOption = Arrays.asList( "solve <solution>");
        this.actionsDone = 0;
    }

    public List<String> getActionOptions() {
        return actionOption;
    }

    public boolean isComplete() {
        if (actionsDone == solutions.size()){
            return true;
        }
        return false;
    }


    public boolean takeAction(String action) {
        super.takeAction(action);
        String answer = "solve " + solutions.get(actionsDone);
        System.out.println(answer);
        if (answer.equals(action.toLowerCase())){
            actionsDone++;
            return true;
        }
        return false;
        
    }
}
