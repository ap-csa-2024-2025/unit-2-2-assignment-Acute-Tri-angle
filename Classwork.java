import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    // write your code
    shopping();
    quote();
    rabbit();
  }
  public static void shopping(){
      Scanner sc = new Scanner(System.in);
      System.out.println("What type of item are you buying?");
      String item = sc.nextLine();
      System.out.println("How many are you buying?");
      int x = sc.nextInt();
      System.out.println("How much does each one weigh?");
      double y = sc.nextDouble();
      System.out.println(x + " " + item + " at " + y + " pounds each will weigh " + (x*y) + " pounds total");
      sc.close();
  }
  public static void quote(){
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
  }
  public static void rabbit(){
    System.out.println("(\\(\\\n( - -)\n((\') (\'))");
  }
}
