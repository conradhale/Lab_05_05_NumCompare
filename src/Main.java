public class Main {
  public static void main(String[] args) {
    System.out.println("Enter the first number: ");
    int firstNum = 3;
    System.out.println("Enter the second number: ");
    int secondNum = 3;
    if (firstNum == secondNum) {
      System.out.println(firstNum + " is equal to " + secondNum);
    } else if (firstNum < secondNum) {
      System.out.println(firstNum + " is less than " + secondNum);
    } else if (secondNum < firstNum) {
      System.out.println(secondNum + " is less than " + firstNum);
    } else {
      System.out.println("Invalid input, try again.");
    }
  }
}