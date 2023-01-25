import java.util.*;

public class PrecisionTask extends EnduranceTask {
    private List<String> actionsDone;
    private List<String> requiredActions;

    public PrecisionTask(List<String> requiredActions, String description){
        super("", requiredActions.size(), description);
        this.requiredActions = requiredActions;
        this.actionsDone = new ArrayList<>();
    }

    public boolean isComplete() {
        if (actionsDone.size() == requiredActions.size()){
            return true;
        }
        return false;
    }

    public boolean takeAction(String action) {
        super.takeAction(action);
        int currentIndex = actionsDone.size();
        if (requiredActions.get(currentIndex).equals(action.toLowerCase())){
            actionsDone.add(action);
            return true;
        }
        return false;

    }
    
}
