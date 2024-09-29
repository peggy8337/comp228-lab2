package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private String[] questions = {
            "Which one of the following symbols indicates a single line comment in Java application source code?",
            "Which one of the following symbols indicates a multi-line comment in Java application source code?",
            "Which of the following components does a Java application need to have at least one of?",
            "Which of the following typically groups related classes so that they could be imported into programs and reused?",
            "Method arguments may be ___"
    };

    private String[][] options = {
            {"//", "#!", "\\", "##"},
            {"||         ||", "//         \\", "/*         */", "##"},
            {"Local variable", "Non-static Method", "Class", "Instance variable"},
            {"Package", "Method", "Function", "IDE"},
            {"only variables.", "only strings.", "only constants.", "constants, variables, or expressions."}
    };

    private int[] correctAnswers = {
            0, 2, 2, 0, 3
    };

    private int correctCount = 0;
    private int incorrectCount = 0;

    private void simulateQuestion(int questionIndex) {
        String question = questions[questionIndex];
        String[] questionOptions = options[questionIndex];
        String message = question + "\n";
        for (int i = 0; i < questionOptions.length; i++) {
            message += (i + 1) + ". " + questionOptions[i] + "\n";
        }
        String answer = JOptionPane.showInputDialog(null, message, "Question " + (questionIndex + 1), JOptionPane.QUESTION_MESSAGE);
        if (answer == null) return;
        checkAnswer(questionIndex, answer);
    }


    private void checkAnswer(int questionIndex, String answer) {
        int answerIndex = Integer.parseInt(answer) - 1;
        if (answerIndex == correctAnswers[questionIndex]) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true), "Correct!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, generateMessage(false) + "\nThe correct answer is " + (correctAnswers[questionIndex] + 1) + ". " + options[questionIndex][correctAnswers[questionIndex]], "Incorrect", JOptionPane.ERROR_MESSAGE);
        }
    }


    private String generateMessage(boolean correct) {
        Random random = new Random();
        int messageIndex = random.nextInt(4);
        String message = "";
        switch (messageIndex) {
            case 0:
                message = correct ? "Excellent!" : "No. Please try again.";
                break;
            case 1:
                message = correct ? "Good!" : "Wrong. Try once more.";
                break;
            case 2:
                message = correct ? "Keep up the good work!" : "Don't give up!";
                break;
            case 3:
                message = correct ? "Nice work!" : "No. Keep trying.";
                break;
        }
        return message;
    }

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        displayResults();
    }

    private void displayResults() {
        int totalQuestions = correctCount + incorrectCount;
        double percentage = ((double) correctCount / totalQuestions) * 100;
        String resultMessage = "Correct Answers: " + correctCount + "\nIncorrect Answers: " + incorrectCount + "\nPercentage of the correct: " + String.format("%.2f", percentage) + "%";
        JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
    }

}

