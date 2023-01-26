// Bhavesh Kumar
// 25 January, 2023
// CSE 123 BC with Ton
// Creative Project 1 - Survivor Challenge
import java.util.*;

// Precision Task class manages the creation of an precision type task in the survivor game.
// The class handles methods to display actions user can do, the game logic behind each action 
// and if the task is complete or not. This class is a subclass of EnduranceTask class.
public class PrecisionTask extends EnduranceTask {
    private List<String> actionsDone;
    private List<String> requiredActions;
    
    // This constructor initializes all the needed fields to create
    // the Precision Task object. It uses it's parent class's constructor too.
    // @params Takes in a List of String for the type of actions that should be done inorder
    // to complete the task and a description for the endurance task.
    public PrecisionTask(List<String> requiredActions, String description){
        super("", requiredActions.size(), description);
        this.requiredActions = requiredActions;
        this.actionsDone = new ArrayList<>();
    }

    // The isComplete method determines whether or not the user completed the task.
    // This method overrides it's parent method because Precision task is completed
    // differently from the Endurance task
    // @returns a boolean value of if the task is complete. True means task is complete.
    public boolean isComplete() {
        if (actionsDone.size() == requiredActions.size()){
            return true;
        }
        return false;
    }

    // Runs the logic behind each action of the user to return if the action is 
    // the correct action inorder to complete the task. Calls the take action method
    // of its parent class because the logic behind throwing exceptions is the same, thus
    // ensuring that the same logic is not repeated. 
    // @params takes in a string input which is the action the user provides and converts it to 
    // lower case to match with the correct action that should happen.
    // @exception throws an IllegalArgumentException if the action taken is not an action
    // that the user can take.
    // @returns A boolean value of whether or not the action taken is the correct one.
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
