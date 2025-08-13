import java.util.*;

public class MentalHealthSimulator {
    ArrayList<Question> questions;
    HashMap<String, User_M> users; // Changed from User to User_M

    public MentalHealthSimulator() {
        questions = new ArrayList<>();
        users = new HashMap<>();
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void registerUser(String username) {
        if (!users.containsKey(username)) {
            users.put(username, new User_M(username)); // Changed
            System.out.println("User registered: " + username);
        } else {
            System.out.println("User already exists!");
        }
    }

    // Updated with Stack for undo feature
    public void takeAssessment(String username) {
        Scanner sc = new Scanner(System.in);
        User_M user = users.get(username); // Changed
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        Stack<Integer> answersStack = new Stack<>();
        int currentScore = 0;

        for (int i = 0; i < questions.size(); ) {
            Question q = questions.get(i);
            System.out.println(q.text);
            for (int j = 0; j < q.options.size(); j++) {
                System.out.println(j + ": " + q.options.get(j));
            }
            System.out.println("Enter your choice or -1 to undo last answer:");
            int choice = sc.nextInt();

            if (choice == -1) {
                if (!answersStack.isEmpty()) {
                    int lastScore = answersStack.pop();
                    currentScore -= lastScore;
                    i--; // Go back to previous question
                    System.out.println("Last answer undone. Please answer again.");
                } else {
                    System.out.println("No answer to undo.");
                }
            } else if (choice >= 0 && choice < q.options.size()) {
                int score = q.scores.getOrDefault(choice, 0);
                answersStack.push(score);
                currentScore += score;
                i++;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        user.addScoreHistory(currentScore);
        System.out.println("Your total score: " + currentScore);
        giveFeedback(currentScore);
    }

    private void giveFeedback(int score) {
        if (score < 5) {
            System.out.println("You seem to be in a low-stress state. Keep it up!");
        } else if (score < 10) {
            System.out.println("Moderate stress detected. Consider some relaxation techniques.");
        } else {
            System.out.println("High stress levels. Please reach out to a counselor.");
        }
    }

    public void viewUserHistory(String username) {
        User_M u = users.get(username); // Changed
        if (u != null) {
            u.viewHistory();
        } else {
            System.out.println("User not found!");
        }
    }

    // Leaderboard method with sorting
    public void showLeaderboard() {
        List<Map.Entry<String, Double>> userAverages = new ArrayList<>();

        for (Map.Entry<String, User_M> entry : users.entrySet()) { // Changed
            LinkedList<Integer> scores = entry.getValue().scoreHistory;
            if (!scores.isEmpty()) {
                double avg = scores.stream().mapToInt(Integer::intValue).average().orElse(0);
                userAverages.add(new AbstractMap.SimpleEntry<>(entry.getKey(), avg));
            }
        }

        // Sort descending by average score
        userAverages.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        if (userAverages.isEmpty()) {
            System.out.println("No scores yet to display.");
            return;
        }

        System.out.println("\n--- Leaderboard (User - Average Score) ---");
        for (Map.Entry<String, Double> entry : userAverages) {
            System.out.printf("%s - %.2f\n", entry.getKey(), entry.getValue());
        }
    }
}
