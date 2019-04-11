// Brian Ciszewski
// Part of Number Guessing Game Program, Ciszewski_Integration_Project package
// Multiple methods are made with similar names for each game mode. An introduction greeting
// method also calls to the input-Scanner class to get user input on first picking the game mode.
// prints the parameters of the guessing game. Asks the user to type an input for the random
// number. The escape sequences, \n or \t, are used to format the output with new, blank lines
// and tab-spacing to make the output messages easier to read.

public class Greeting {
  public static void greet() {
    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("What is my number?\n");
  }

  public static void greet2() {
    System.out.println("I'm thinking of a double-number between 1 and 10 with 2 decimal places.");
    System.out.println("What is my number?\n");
  }

  // Prompts the user to pick which game mode, calls input scanner class for input from user,
  // returns
  // user choice stored in game mode.
  int gameMode = 0;

  public int greetIntro() {
    try {
    System.out.println("Welcome to the Number Guessing Game!!");
    System.out.print("Created by: ");
    Polymorphism.sayName();
    System.out.println("\n");
    System.out.println("Select your Game Mode:\n1: Easy\n2: Hard\n ");
    
      GetInput userInput = new GetInput();
      String guess = userInput.input();
      gameMode = Integer.parseInt(guess);
      return gameMode;
    } catch (Exception e) {
    //catch (NumberFormatException ex) {
      System.out.println("Invalid Input. Please enter a number.");
    }
    return gameMode;
  }
}
