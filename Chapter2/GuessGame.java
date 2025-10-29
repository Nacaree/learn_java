public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessP1;
        int guessP2;
        int guessP3;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessP1 = p1.number;
            System.out.println("Player one guessed " + guessP1);
            guessP2 = p2.number;
            System.out.println("Player two guessed " + guessP2);
            guessP3 = p3.number;
            System.out.println("Player three guessed " + guessP3);
            if (guessP1 == targetNumber) {
                p1isRight = true;
            }
            if (guessP2 == targetNumber) {
                p2isRight = true;
            }
            if (guessP3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // game over, so break out of the loop
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Players will have to try again.");
            } // end if/else
        } // end loop
    } // end method
} // end class

class Player {
    int number;
    void guess() {
        number = (int) (Math.random() * 10);
    }
}