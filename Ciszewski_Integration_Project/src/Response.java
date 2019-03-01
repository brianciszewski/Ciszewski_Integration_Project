// Brian Ciszewski
// Part of Number Guessing Game Program, Ciszewski_Integration_Project package
public class Response {
  // the strings higher and lower are used to reduce repetitive typing of phrases.
  String higher = "Guess a higher number.";
  String lower = "Guess a lower number.";

  // CCFFE5
  public boolean respond(int randomNum, double guessNum) {
    // tests if the guessed number is the same as the randomly generated number.
    // If the guess is lower than the random number, the user will be prompted to enter a lower
    // value and vice versa.
    if (randomNum == guessNum) {
      return true;
    } else if (randomNum != guessNum) {
      if (guessNum < randomNum) {
        System.out.println("\t" + higher + "\n");
      } else if (guessNum > randomNum) {
        System.out.println("\t" + lower + "\n");
      }
    }
    return false;
  }

  // if the guessed number is lower than the randomly generated one, the program will prompt the 
  // user to enter a higher number and vice versa. The program continues to loop. 
  // 009999
  public boolean respond(double randomNum, double guessNum) {
    if (randomNum == guessNum) {
      return true;
    } else if (randomNum != guessNum) {
      if (guessNum < randomNum) {
        System.out.println("\t" + higher + "\n");
      } else if (guessNum > randomNum) {
        System.out.println("\t" + lower + "\n");
      }
      return false;
    }
    return false;
  }
// FFE5CC
  public static void displayWinnerMessage(int counter) {
    System.out.println("\n\nCongragulations!!");
    int i;
    for (i = 3; i > 0; i--) {
      System.out.println("\tWinner!");
    }
    System.out.println("Your score is " + (counter * 6));
  }
}
