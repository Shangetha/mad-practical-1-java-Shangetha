import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("\nInput height in meters: ");
    double height = in.nextDouble();
    System.out.print("Input weight in kilogram: ");
    double weight = in.nextDouble();
    double BMI = weight / (height * height);
    System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
  }
}
