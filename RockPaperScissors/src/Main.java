import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("");
        player.setName();

        Scanner amount = new Scanner(System.in);
        int z = 0;
        while (z == 0) {
            System.out.println("How many times would you like to play?");
            if (amount.hasNextInt()) { //checks if input is integer
                int num = amount.nextInt();
                if (num > 0) {
                    z = 1;
                    for (int i=0; i<num; i++) {
                        System.out.println("As you know in this game, there are three options: rock, paper and scissors.");
                        System.out.println("We are going to use the following letters for the 3 options: ");
                        System.out.println("r = rock, p = paper and s = scissors");
                        System.out.println("Let's play :) You are going first!");
                        Game play = new Game();
                        play.playerOption();
                        play.computerOption();
                        play.gameLogic();


                    }
                } else {
                    System.out.println("Invalid, please type a positive integer!");
                }
            } else {
                System.out.println("Invalid input, please type an integer!");
                amount.next(); // consumes the invalid input (e.g., 3.14) to avoid an infinite loop
            }
        }
    }
}
