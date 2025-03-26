package Taskprogram;
import java.util.Scanner;
public class Vowels {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

            int vowelCount = 0, consonantCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
                // Check if the character is a consonant (a letter that is not a vowel)
                else if (ch >= 'a' && ch <= 'z') {
                    consonantCount++;
                }
            }

            // Print the results
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Consonants: " + consonantCount);

            scanner.close(); // Close the scanner resource
        }
    }













