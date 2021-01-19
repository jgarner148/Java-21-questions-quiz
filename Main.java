import java.util.Scanner;
class Main {
  
  //Used to have the program wait for a certain number of seconds
  public static void sleeptime(int timeWaiting){
    try{ 
    Thread.sleep(timeWaiting);
    }
    catch(InterruptedException ex){
    Thread.currentThread().interrupt();
    }
  }

  //Used to clear the console
  public static void clearScreen(){
    System.out.print("\033[H\033[2J"); 
    System.out.flush();
  }

  //Main funcation
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    clearScreen();
    System.out.println("Welcome to the 21 questions quiz");
    System.out.print("Please enter your name: ");
    String userNameNoCap = input.nextLine();
    String userName = userNameNoCap.substring(0,1).toUpperCase() + userNameNoCap.substring(1);

    clearScreen();
    System.out.println("Welcome " + userName + " Lets start the quiz");
    sleeptime(1500);
    clearScreen();

    int totalCorrect = 0;
  

    //Question 1
    boolean looping = true;
    while (looping){
      System.out.println("Question 1");
      System.out.println("How many times has Andy Murray won Wimbledon singles");
      System.out.println("A) Once");
      System.out.println("B) Twice");
      System.out.println("C) Three times");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("B")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 2
    looping = true;
    while (looping){
      System.out.println("Question 2");
      System.out.println("What year was Heniz established");
      System.out.println("A) 1869");
      System.out.println("B) 1894");
      System.out.println("C) 1906");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }
    
    //Question 3
    looping = true;
    while (looping){
      System.out.println("Question 3");
      System.out.println("What is the capital of Iceland");
      System.out.println("A) Reykjavík");
      System.out.println("B) Kópavogur");
      System.out.println("C) Selfoss");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("b")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 4
    looping = true;
    while (looping){
      System.out.println("Question 4");
      System.out.println("Which planet is closest to the sun?");
      System.out.println("A) Mercury");
      System.out.println("B) Jupiter");
      System.out.println("C) Neptune");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 5
    looping = true;
    while (looping){
      System.out.println("Question 5");
      System.out.println("What is The Queen’s surname?");
      System.out.println("A) Kensington");
      System.out.println("B) Windsor");
      System.out.println("C) Buckingham");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("B")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 6
    looping = true;
    while (looping){
      System.out.println("Question 6");
      System.out.println("What is a group of crows known as?");
      System.out.println("A) A robbery");
      System.out.println("B) An Arson");
      System.out.println("C) A murder");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 7
    looping = true;
    while (looping){
      System.out.println("Question 7");
      System.out.println("How many minutes in a game of rugby league?");
      System.out.println("A) 80");
      System.out.println("B) 100");
      System.out.println("C) 120");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 8
    looping = true;
    while (looping){
      System.out.println("Question 8");
      System.out.println("What does Fe stand for on the periodic table?");
      System.out.println("A) Iodine");
      System.out.println("B) Indium");
      System.out.println("C) Iron");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 9
    looping = true;
    while (looping){
      System.out.println("Question 9");
      System.out.println("How many episodes of the TV show Friends were aired?");
      System.out.println("A) 192");
      System.out.println("B) 236");
      System.out.println("C) 275");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("B")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 10
    looping = true;
    while (looping){
      System.out.println("Question 10");
      System.out.println("What fruit has the scientific name Mangifera indica?");
      System.out.println("A) Mango");
      System.out.println("B) Pineapple");
      System.out.println("C) Grape");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 11
    looping = true;
    while (looping){
      System.out.println("Question 11");
      System.out.println("What did Jack Dorsey, Noah Glass, Biz Stone, and Evan Williams collectively create?");
      System.out.println("A) Twitter");
      System.out.println("B) Youtube");
      System.out.println("C) Whatsapp");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 12
    looping = true;
    while (looping){
      System.out.println("Question 12");
      System.out.println("Which Australian City does the Yarra River run through?");
      System.out.println("A) Brisbane");
      System.out.println("B) Adelaide");
      System.out.println("C) Melbourne");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 13
    looping = true;
    while (looping){
      System.out.println("Question 13");
      System.out.println("In Harry Potter, what is the name of The Weasley's house?");
      System.out.println("A) The Nest");
      System.out.println("B) The Burrow");
      System.out.println("C) The Cave");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("B")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 14
    looping = true;
    while (looping){
      System.out.println("Question 14");
      System.out.println("Which English city was once known as Duroliponte?");
      System.out.println("A) Chester");
      System.out.println("B) Newcastle");
      System.out.println("C) Cambridge");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 15
    looping = true;
    while (looping){
      System.out.println("Question 15");
      System.out.println("In bowling, what is the term given for three consecutive strikes?");
      System.out.println("A) A duck");
      System.out.println("B) A chicken");
      System.out.println("C) A turkey");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 16
    looping = true;
    while (looping){
      System.out.println("Question 16");
      System.out.println("Who was the only British Prime Minister to be assassinated?");
      System.out.println("A) Spencer Perceval");
      System.out.println("B) Robert Peel");
      System.out.println("C) Henry Addington");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 17
    looping = true;
    while (looping){
      System.out.println("Question 17");
      System.out.println("Which vitamin is the only one that you will not find in an egg?");
      System.out.println("A) Vitamin A");
      System.out.println("B) Vitamin B");
      System.out.println("C) Vitamin C");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 18
    looping = true;
    while (looping){
      System.out.println("Question 18");
      System.out.println("In what year was the first episode of Coronation Street broadcasted?");
      System.out.println("A) 1960");
      System.out.println("B) 1965");
      System.out.println("C) 1970");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("A")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 19
    looping = true;
    while (looping){
      System.out.println("Question 19");
      System.out.println("Who is the only musician ever to have been awarded the Nobel prize for literature?");
      System.out.println("A) Louis Armstrong");
      System.out.println("B) Elvis Presley");
      System.out.println("C) John Lennon");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("B")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 20
    looping = true;
    while (looping){
      System.out.println("Question 20");
      System.out.println("Which year was the Premier League founded?");
      System.out.println("A) 1988");
      System.out.println("B) 1992");
      System.out.println("C) 1995");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("B")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("C")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

    //Question 21
    looping = true;
    while (looping){
      System.out.println("Question 21");
      System.out.println("Singer Stefani Joanne Angelina Germanotta is best known by which stage name?");
      System.out.println("A) Sia");
      System.out.println("B) Katy Perry");
      System.out.println("C) Lady Gaga");
      System.out.print("Enter your answer here: ");
      String userAnswer = input.nextLine();
      clearScreen();

      if (userAnswer.equalsIgnoreCase("C")){ //This is the correct answer
        totalCorrect ++;
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("A")){
        looping = false;
      }
      else if (userAnswer.equalsIgnoreCase("B")){
        looping = false;
      }
      else{
        System.out.println("Invalid input please try again");
        sleeptime(1500);
        clearScreen();
      }
    }

  System.out.println("Thats all the questions answers and it's time to find out your score");
  sleeptime(1500);
  System.out.println("Out of a possible 21 you scored " + totalCorrect);
  sleeptime(1500);
  looping = true;
  while (looping){
    System.out.print("Type '1' to view the answers or '2' to exit the program ");
    String userAnswer = input.nextLine();
    if (userAnswer.equals("1")){
      clearScreen();
      String[] answers = {"Question 1: B) Twice", "Question 2: A) 1869", "Question 3: A) Reykjavík", "Question 4: A) Mercury", "Question 5: B) Windsor", "Question 6: c) A murder", "Question 7: A) 80", "Question 8: C) Iron", "Question 10: A) Mango", "Question 11: A) Twittter", "Question 12: C) Melbourne", "Question 13: B) The Burrow", "Question 14: C) Cambridge", "Question 15: C) Turkey",  "Question 16: A) Spencer Perceval", "Question 17: C) Vitamin C", "Question 18: A) 1960", "Question 19: B) Elvis Presley", "Question 20: B) 1982", "Question 21: C) Lady Gaga"};
      for (String answer : answers){
        System.out.println(answer);
      }
      System.out.print("Press Enter to exit");
      input.nextLine();
      looping = false;
      clearScreen();
    }
    else{
      clearScreen();
      looping = false;
    }
  }

  }
}
