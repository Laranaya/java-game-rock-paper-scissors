import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word and I will tell you if it is a palindrome or not: ");
        String word = scanner.nextLine();

        String reversedWord = "";

        for (int i=word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }

        if (word.equals(reversedWord))
            System.out.println("This is a palindrome!");

        else
            System.out.println("This isn't a palindrome.");








    }
}
