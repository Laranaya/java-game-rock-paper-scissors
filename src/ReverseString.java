public class ReverseString {
    public static void main(String[] args){

        String originalWord = "laranaya";
        String reversedWord = "";

       // for (int i=0; i < originalWord.length(); i++){

         //   reversedWord = originalWord.charAt(i) + reversedWord;

        for (int i = originalWord.length()-1; i>=0; i--){
            System.out.println(i);
            reversedWord += originalWord.charAt(i);
            System.out.println("inside the loop " + reversedWord);

        }

       System.out.println("The reversed string is: " + reversedWord);



    }
}
