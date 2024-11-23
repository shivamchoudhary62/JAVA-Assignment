package quiz;

public class QuizGrader {

    private static final char[] correctAnswers = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};
    private static final int PASS_MARKS = 5;

    public static QuizResult gradeAnswer(char submitted, char correct) {
        if (submitted == 'X') {
            return QuizResult.NOT_ANSWERED;
        } else if (submitted == correct) {
            return QuizResult.CORRECT;
        } else {
            return QuizResult.WRONG;
        }
    }

    public static void main(String[] args) {
        char[] submittedAnswers = {'C', 'B', 'B', 'D', 'B', 'C', 'C', 'A'}; // Example submitted answers

        int correctCount = 0;

        System.out.printf("%-10s%-16s%-15s%-10s%n", "QUESTION", "SUBMITTED ANS", "CORRECT ANS", "RESULT");

        for (int i = 0; i < correctAnswers.length; i++) {
            QuizResult result = gradeAnswer(submittedAnswers[i], correctAnswers[i]);
            if (result == QuizResult.CORRECT) {
                correctCount++;
            }

            System.out.printf("%-10d%-16c%-15c%-10s%n", i + 1, submittedAnswers[i], correctAnswers[i], result);
        }

        System.out.printf("%nTotal Correct: %d%n", correctCount);
        if (correctCount >= PASS_MARKS) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}
