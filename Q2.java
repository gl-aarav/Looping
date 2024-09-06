import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number, reversedNumber, digit;
    System.out.print("Enter a number: ");
    number = in.nextInt();
    reversedNumber = 0;
    while (number != 0) {
      digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number /= 10;
    }
    System.out.println("Reversed number: " + reversedNumber);

  }
}