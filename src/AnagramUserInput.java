import java.util.Scanner;
import java.util.Arrays;

public class AnagramUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two words and I will tell you if they are anagrams or not. ");
        System.out.println("Enter your first word: ");

        String word1 = scanner.nextLine();
        char[] charWord1 = word1.toCharArray();
        Arrays.sort(charWord1); //pass by ref = charWord contents have changed

        System.out.println("Enter your second word: ");
        String word2 = scanner.nextLine();
        char[] charWord2 = word2.toCharArray();
        Arrays.sort(charWord2); //pass by ref = charWord contents have changed

        if(Arrays.equals(charWord1, charWord2)){ //use Arrays.equals() for comparing arrays
            System.out.println("This is an anagram!");
        }

        else{
            System.out.println("This is not an anagram.");
        }












    }

}
