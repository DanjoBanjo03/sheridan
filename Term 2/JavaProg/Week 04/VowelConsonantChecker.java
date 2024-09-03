import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for simplicity

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The entered letter '" + letter + "' is a vowel.");
                break;
            default:
                if (Character.isLetter(letter)) {
                    System.out.println("The entered letter '" + letter + "' is a consonant.");
                } else {
                    System.out.println("Please enter a valid letter.");
                }
        }

        scanner.close();
    }
}
