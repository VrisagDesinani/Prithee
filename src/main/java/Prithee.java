import java.util.Random;
import java.util.Scanner;

public class Prithee {

    private String[] words;

    public Prithee() {
        String sonnet =
                "Shall I compare thee to a summer’s day? " +
                        "Thou art more lovely and more temperate: " +
                        "Rough winds do shake the darling buds of May, " +
                        "And summer’s lease hath all too short a date; " +
                        "Sometime too hot the eye of heaven shines, " +
                        "And often is his gold complexion dimm’d; " +
                        "And every fair from fair sometime declines, " +
                        "By chance or nature’s changing course untrimm'd; " +
                        "But thy eternal summer shall not fade, " +
                        "Nor lose possession of that fair thou ow’st; " +
                        "Nor shall death brag thou wander’st in his shade, " +
                        "When in eternal lines to time thou grow’st: " +
                        "So long as men can breathe or eyes can see, " +
                        "So long lives this, and this gives life to thee.";

        words = sonnet.split(" ");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correct = 0;
        int incorrect = 0;

        while (correct < 3 && incorrect < 3) {

            int missingWordIndex = random.nextInt(words.length);

            printUntilWord(missingWordIndex);

            System.out.print("\nWhat is the next word? ");
            String answer = scanner.nextLine();

            if (checkAnswer(answer, words[missingWordIndex])) {
                System.out.println("Correct!\n");
                correct++;
            } else {
                System.out.println("Incorrect!");
                System.out.println("The word was: " + words[missingWordIndex] + "\n");
                incorrect++;
            }

            System.out.println("Correct: " + correct);
            System.out.println("Incorrect: " + incorrect);
            System.out.println();
        }

        if (correct == 3) {
            System.out.println("You got three words correct!");
        } else {
            System.out.println("You got three words incorrect.");
        }

        scanner.close();
    }

    public void printUntilWord(int missingWordIndex) {

        for (int i = 0; i < missingWordIndex; i++) {
            System.out.print(words[i] + " ");
        }

        System.out.println("_____");
    }

    public boolean checkAnswer(String answer, String actualWord) {
        return cleanWord(answer).equalsIgnoreCase(cleanWord(actualWord));
    }

    public String cleanWord(String word) {
        return word.replaceAll("[^a-zA-Z]", "");
    }
}