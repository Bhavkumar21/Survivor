// Bhavesh Kumar
// 25 January, 2023
// CSE 123 BC with Ton
// Creative Project 1 - Survivor Challenge
import java.util.*;

// Endurance Task class manages the creation of an endurance type task in the survivor game.
// The class handles methods to display actions user can do, the game logic behind each action 
// and if the task is complete or not. This class is a subclass of the Task abstract class.
public class EnduranceTask extends Task{
    private String action;
    private int numOfActions;
    private static List<String> actionOption;
    private int actionsDone;

    // This constructor initializes all the needed fields for to create
    // the Endurance Task object. It uses it's parent class's constructor too.
    // @params Takes in a String for the type of action that should be done, integer
    // value of how many times and a description for the endurance task.
    public EnduranceTask(String type, int duration, String description){
        super(description);
        this.action = type;
        this.numOfActions = duration;
        this.actionsDone = 0;
        actionOption = Arrays.asList("jump", "run", "swim", "crawl", "climb");
    }
    
    // The getActionOptions method returns the actions that are available
    // to the user to complete the endurance task
    // @returns A list of string that are all the options open to user.
    public List<String> getActionOptions() {
        return actionOption;
    }

    // The isComplete method determines whether or not the user completed the task.
    // @returns a boolean value of if the task is complete. True means task is complete.
    public boolean isComplete() {
        if (actionsDone == numOfActions){
            return true;
        }
        return false;
    }

    // Runs the logic behind each action of the user to return if the action is 
    // the correct action inorder to complete the task 
    // @params takes in a string input which is the action the user provides and converts it to 
    // lower case to match with the correct action that should happen.
    // @exception throws an IllegalArgumentException if the action taken is not an action
    // that the user can take.
    // @returns A boolean value of whether or not the action taken is the correct one.
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