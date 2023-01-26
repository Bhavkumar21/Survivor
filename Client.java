// Bhavesh Kumar
// 25 January, 2023
// CSE 123 BC with Ton
// Creative Project 1 - Survivor Challenge
import java.util.*;

// The Client class handles running all the tasks and the main gain logic of how the game should flow.
public class Client {

    // The main method creates the challenges and calls a function
    // to initiate the challenge on the command line for the user to attempt.
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        List<Task> challenge = new ArrayList<>();

        challenge.add(new EnduranceTask("jump", 3, "A set of three hurdles."));
        challenge.add(new EnduranceTask("swim", 1, "A small lake."));
        challenge.add(new PrecisionTask(new ArrayList<>(Arrays.asList("crawl", "climb", "run")), 
        "A low crawl net, then a wall with a rope, then a dash to the end."));
        challenge.add(new PuzzleTask("4", new ArrayList<>(Arrays.asList("It's 4.", "No really, it's 4!")), "What is 2 + 2?"));
        challenge.add(new AnagramTask(new ArrayList<>(Arrays.asList("tortilla", "loop")), "Solve Anagram: Littoral, Polo"));

        attemptChallenge(challenge, console);
    }

    // Attempt Challenge method runs the game logic of the survivor challenge by 
    // running each Challenge. It gives all the challenge's description and runs 
    // the action the user take and concludes if the challenge is completed or not.
    // @exception If any challenge throws an IllegalArgumentException this function handles it
    // @params A list of obsticle courses and a scanner object to get the user's action.
    public static void attemptChallenge(List<Task> course, Scanner console) {
        List<String> prevActions = new ArrayList<>();

        while (!course.isEmpty()) {
            Task current = course.get(0);
            System.out.println("Current task: " + current.getDescription());
            System.out.println("Previous actions: " + prevActions);
            System.out.println("Possible actions: " + current.getActionOptions());
            System.out.print("Your action? ");
            String action = console.nextLine();

            try {
                boolean result = current.takeAction(action);
                if (result) {
                    System.out.println("  Action successful!");
                    prevActions.add(0, action); 
                    if (current.isComplete()) {
                        System.out.println("  Task completed!");
                        course.remove(0);
                        prevActions.clear();
                    }
                } else {
                    System.out.println("  Action not successful.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("  " + ex.getMessage());
            }
            System.out.println();
        }
        System.out.println("Challenge complete. Congratulations!!!");
    }
}