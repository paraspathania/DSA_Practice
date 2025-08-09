import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MentalHealthSimulator simulator = new MentalHealthSimulator();

        // Adding sample questions
        Question q1 = new Question("How often do you feel stressed?");
        q1.addOption("Rarely", 1);
        q1.addOption("Sometimes", 3);
        q1.addOption("Often", 5);

        Question q2 = new Question("How often do you have trouble sleeping?");
        q2.addOption("Rarely", 1);
        q2.addOption("Sometimes", 3);
        q2.addOption("Often", 5);

        Question q3 = new Question("How often do you feel overwhelmed?");
        q3.addOption("Rarely", 1);
        q3.addOption("Sometimes", 3);
        q3.addOption("Often", 5);

        simulator.addQuestion(q1);
        simulator.addQuestion(q2);
        simulator.addQuestion(q3);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Mental Health Simulator ---");
            System.out.println("1. Register User");
            System.out.println("2. Take Assessment");
            System.out.println("3. View Score History");
            System.out.println("4. Exit");
            System.out.println("5. Show Leaderboard");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    simulator.registerUser(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    simulator.takeAssessment(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    simulator.viewUserHistory(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                case 5:
                    simulator.showLeaderboard();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
