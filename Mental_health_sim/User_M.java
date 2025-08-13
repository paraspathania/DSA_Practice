import java.util.LinkedList;

public class User_M {
    String name;
    LinkedList<Integer> scoreHistory;

    public User_M(String name) {
        this.name = name;
        this.scoreHistory = new LinkedList<>();
    }

    public void addScoreHistory(int score) {
        scoreHistory.add(score);
    }

    public void viewHistory() {
        if (scoreHistory.isEmpty()) {
            System.out.println("No history yet!");
            return;
        }
        System.out.println("Score history for " + name + ":");
        for (Integer s : scoreHistory) {
            System.out.println(s);
        }
    }
}
