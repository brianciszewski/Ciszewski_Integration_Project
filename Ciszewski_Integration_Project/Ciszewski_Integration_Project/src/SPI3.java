// Brian Ciszewski
// getters and setters are used for calculating the player's score based on their number of 
// attempts stored in the 'counter' variable. 
public class SPI3 {

  static int score;

  // Uses 'this' as the name of the class to identify which 'score' is which
  public static void setScore(int score) {
    score = SPI3.score;
  }

  public static void setScore(int x, int y) {
    score = x;
  }

  public static int getScore() {
    return (score * 6);
  }



  public static void information() {



  }
}


