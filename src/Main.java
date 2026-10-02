import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String choiceOne = "";
        String choiceTwo = "";

        boolean playAgain = false;
        while (!playAgain) {
            boolean choiceEntered1 = false;
            boolean choiceEntered2 = false;

            System.out.println("Player A, Rock, Paper or Scissors? (enter R, P, or S?)");

            while (!choiceEntered1) {
                choiceOne = in.next();
                choiceOne = choiceOne.toUpperCase();
                if (choiceOne.equals("R") || choiceOne.equals("P") || choiceOne.equals("S")) {
                    playerA = choiceOne;
                    choiceEntered1 = true;
                } else {
                    System.out.println("You may enter only R, P, or S. Please try again");

                }

            }
            System.out.println("Player B, Rock, Paper or Scissors? (enter R, P, or S?)");

            while (!choiceEntered2) {
                choiceTwo = in.next();
                choiceTwo = choiceTwo.toUpperCase();
                if (choiceTwo.equals("R") || choiceTwo.equals("P") || choiceTwo.equals("S")) {
                    playerA = choiceTwo;
                    choiceEntered2 = true;
                } else {
                    System.out.println("You may enter only R, P, or S. Please try again");

                }

            }
            if (choiceOne.equals("R") && choiceTwo.equals("S")) {
                System.out.println("Rock breaks Scissors Player A wins");
            } else if (choiceOne.equals("S") && choiceTwo.equals("R")) {
                System.out.println("Rock breaks Scissors Player B wins");
            }

            if (choiceOne.equals("P") && choiceTwo.equals("R")) {
                System.out.println("Paper covers Rock Player A wins");
            } else if (choiceOne.equals("R") && choiceTwo.equals("P")) {
                System.out.println("Paper covers Rock Player B wins");
            }

            if (choiceOne.equals("S") && choiceTwo.equals("P")) {
                System.out.println("Paper covers Rock Player A wins");
            } else if (choiceOne.equals("P") && choiceTwo.equals("S")) {
                System.out.println("Scissors cuts Paper Player B wins");
            }

            if (choiceOne.equals("R") && choiceTwo.equals("R")) {
                System.out.println("Rock vs Rock it’s a Tie!");
            } else if (choiceOne.equals("P") && choiceTwo.equals("P")) {
                System.out.println("Paper vs Paper it’s a Tie!");
            } else {
                System.out.println("Scissors vs Scissors It's a Tie!");
            }
            System.out.println("Play Again? [Y/N]");
            if (in.next().equals("N")){
                playAgain = true;

            }
        }
    }

}
