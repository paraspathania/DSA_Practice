import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    String text;
    ArrayList<String> options;
    HashMap<Integer, Integer> scores; // Option index → score

    public Question(String text) {
        this.text = text;
        this.options = new ArrayList<>();
        this.scores = new HashMap<>();
    }

    public void addOption(String option, int score) {
        options.add(option);
        scores.put(options.size() - 1, score);
    }
}
