import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String[] word1 = {"c", "r", "i", "e", "d"};
        System.out.println((Arrays.toString(word1)));

        String[] word2 = {"c", "i", "d", "e", "r"};
        System.out.println((Arrays.toString(word2)));

        Arrays.sort(word1);

        System.out.println("Sorted list: " + (Arrays.toString(word1)));
        Arrays.sort(word2);

        System.out.println("Sorted list: " + (Arrays.toString(word2)));

        if (Arrays.toString(word1).length() == Arrays.toString(word2).length())
            if (Arrays.toString(word1).equals(Arrays.toString(word2)))
                System.out.println("This is an anagram!");
            else
                System.out.println("This is not anagram.");
        else
            System.out.println("This isn't anagram.");







    }
}