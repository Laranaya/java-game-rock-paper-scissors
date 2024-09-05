import java.util.Random;
import java.util.Scanner;

public class Game {

    int computerScore;
    int playerScore;
    String playerChoice = "";
    String computerChoice = "";
    Scanner player;

    Game(){
        computerScore = 0;
        playerScore= 0;
        player = new Scanner(System.in);
    }


    public void playerOption(){
        System.out.println("Rock, Paper, Scissors, shoot! ");
        playerChoice = player.nextLine();

    }

    public void computerOption(){
        String[] options = {"r", "p", "s"};
        Random random = new Random();
        int randomIndex = random.nextInt(options.length);
        computerChoice = options[randomIndex];
        System.out.println("L4R4 chooses: "+computerChoice);

    }

    public void gameLogic() {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a draw, no one wins this round hehe!");
        } else if (playerChoice.equals("r") && computerChoice.equals("s") ||
                playerChoice.equals("p") && computerChoice.equals("r") ||
                playerChoice.equals("s") && computerChoice.equals("p")){

            System.out.println("*gasp* You beat me! Well done :)");
            playerScore += 1;

        }
         else if (computerChoice.equals("r") && playerChoice.equals("s") ||
                computerChoice.equals("p") && playerChoice.equals("r") ||
                computerChoice.equals("s") && playerChoice.equals("p")){

            System.out.println("I win! *L4R4 is doing a victory dance*");
            computerScore += 1;
        }

//create method for score comparison

    }


    }