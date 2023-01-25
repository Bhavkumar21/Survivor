import java.util.*;

public class EnduranceTask extends Task{
    private String action;
    private int numOfActions;
    private static List<String> actionOption;
    private int actionsDone;

    public EnduranceTask(String type, int duration, String description){
        super(description);
        this.action = type;
        this.numOfActions = duration;
        this.actionsDone = 0;
        actionOption = Arrays.asList("jump", "run", "swim", "crawl", "climb");
        
    }
    
    @Override
    public List<String> getActionOptions() {
        return actionOption;
    }

    @Override
    public boolean isComplete() {
        if (actionsDone == numOfActions){
            return true;
        }
        return false;
    }

    @Override
    public boolean takeAction(String action) {
        if (!actionOption.contains(action)){
            throw new IllegalArgumentException("**Invalid action: " + action + "**");
        }
        if (this.action.equals(action.toLowerCase())){
            actionsDone++;
            return true;
        }
        return false;
    }

}