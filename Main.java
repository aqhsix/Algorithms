import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number:");

    int number = input.nextInt();
    int added = IntStream.range(1, number + 1).sum();
    System.out.println(added);
  }
}