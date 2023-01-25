import java.util.*;

public class PuzzleTask extends Task {
    private String solution;
    private List<String> hints;
    private List<String> actionOption;
    private String description;
    private boolean isComplete;


    public PuzzleTask(String solution, List<String> hints, String description){
        super(description);
        this.description = description;
        this.solution = "solve " + solution;
        this.hints = hints;
        this.isComplete = false;
        actionOption = new ArrayList<>(Arrays.asList("hint", "solve <solution>"));
    }

    public PuzzleTask(String solution, String description){
        super(description);
        this.solution = "solve " + solution;
        this.description = description;
        this.isComplete = false;
        actionOption = Arrays.asList( "solve <solution>");
    }

    public String getDescription() {
        return description;
    }

    public List<String> getActionOptions() {
        return actionOption;
    }

    public boolean isComplete() {
        return isComplete;
    }

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
