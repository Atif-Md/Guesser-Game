import java.util.Scanner;

class Player {

    int numGuess;
    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Player, guess the number");
        numGuess = sc.nextInt();

    }
}

class Guesser {

    int numGuess;
    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser, guess the number");
        numGuess = sc.nextInt();

    }
}

class Umpire {
    Guesser guesser;
    Player p1, p2, p3;
    public void getNumberFromGuesser() {
        guesser = new Guesser();
        guesser.guessNumber();

    }

    public void collectFromPlayer() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p1.guessNumber();
        p2.guessNumber();
        p3.guessNumber();
    }

    public void declareResult() {
        System.out.println(guesser.numGuess+" "+p1.numGuess+" "+ p2.numGuess+" "+ p3.numGuess);
        if (guesser.numGuess == p1.numGuess) {
            if(guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess)
                System.out.println("All are the winner");
            else if (guesser.numGuess == p2.numGuess )
                System.out.println("Player 1 and Player 2 are the winners");
            else if (guesser.numGuess == p3.numGuess)
                System.out.println("Player 1 and Player 3 are the winners");
            else
                System.out.println("Player 1 is the winners");
        }
        else if (guesser.numGuess == p2.numGuess) {
            if (guesser.numGuess == p3.numGuess)
                System.out.println("Player 2 and Player 3 are the winners");
            else
                System.out.println("Player 2 is the winner");
        }
        else if (guesser.numGuess == p3.numGuess) {
            System.out.println("Player 3 is the winner");
        }
        else {
            System.out.println("Loosers..");
        }
    }
}

public class Main {

    // 5 Objects - Umpire, Guesser, Player1, Player2, Player3
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayer();
        umpire.declareResult();
    }
}