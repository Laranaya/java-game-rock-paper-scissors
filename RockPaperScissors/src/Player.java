import java.util.Scanner;

public class Player {

    String name;

    Player(String name){
        this.name = name;

    }

    void setName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my Rock Paper Scissors game! :)");
        System.out.println("Please enter your name: ");

        this.name = input.nextLine();
        System.out.println("Hello "+this.name+", my name is L4R4, I look forward to playing with you!");
    }

    String getName(){
        return this.name;
    }
}