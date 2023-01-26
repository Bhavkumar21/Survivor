// Bhavesh Kumar
// 25 January, 2023
// CSE 123 BC with Ton
// Creative Project 1 - Survivor Challenge
import java.util.*;

// Puzzle Task class manages the creation of an puzzle type task in the survivor game.
// The class handles methods to display actions user can do, display the discription
//  the game logic behind each action  and if the task is complete or not. 
//  This class is a subclass of the Task abstract class.
public class PuzzleTask extends Task {
    private String solution;
    private List<String> hints;
    private List<String> actionOption;
    private String description;
    private boolean isComplete;

    // This constructor initializes all the needed fields to create
    // the Puzzle Task object. It uses it's parent class's constructor too.
    // @params Takes in a String which is the solution of the task, List of String
    // for hints needed by user and a description for the endurance task.
    public PuzzleTask(String solution, List<String> hints, String description){
        super(description);
        this.description = description;
        this.solution = "solve " + solution;
        this.hints = hints;
        this.isComplete = false;
        actionOption = new ArrayList<>(Arrays.asList("hint", "solve <solution>"));
    }

    // This constructor is made incase the task has no hints assigned.
    // This constructor initializes all the needed fields to create
    // the Puzzle Task object. It uses it's parent class's constructor too.
    // @params Takes in a String which is the solution of the task, List of String
    // for hints needed by user and a description for the endurance task.
    public PuzzleTask(String solution, String description){
        super(description);
        this.solution = "solve " + solution;
        this.description = description;
        this.hints = new ArrayList<>();
        this.isComplete = false;
        actionOption = Arrays.asList( "solve <solution>");
    }

    // This is a getter method to return the description of the class
    // @returns a String which is the description for this class.
    public String getDescription() {
        return description;
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
        return isComplete;
    }


    // Runs the logic behind each action of the user to return if the action is 
    // the correct action inorder to complete the task. If the action are hints
    // they are provided (if they exist) until the list of hints is empty 
    // @params takes in a string input which is the action the user provides and converts it to 
    // lower case to match with the correct action that should happen.
    // @exception throws an IllegalArgumentException if the action taken is not an action
    // that the user can take.
    // @returns A boolean value of whether or not the action taken is the correct one.
    public boolean takeAction(String action) {
        if (action.toLowerCase().equals("hint")){
            if (hints.size() == 0){
                actionOption.remove("hint");
                return false;
            }
            this.description += "\n  " + hints.remove(0);
            return true;
        }

        if (!action.toLowerCase().contains("solve")){
            throw new IllegalArgumentException("**Invalid action: " + action + "**");
        }

        if (action.toLowerCase().equals(solution)){
            this.isComplete = true;
            return true;
        }

        return false;
    }
    
}
