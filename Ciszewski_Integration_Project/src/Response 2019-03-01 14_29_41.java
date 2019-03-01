// Brian Ciszewski
// Part of Number Guessing Game Program, Ciszewski_Integration_Project package
public class Response {
  // the strings higher and lower are used to reduce repetitive typing of phrases.
  String higher = "Guess a higher number.";
  String lower = "Guess a lower number.";

  // Overloading is used depending on the game mode. Easy mode uses integers while hard mode uses
  // a double with 2 decimal places. If the arguments for the random number is an integer, the top
  // method will execute, if a double, the bottom method will.
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
}
