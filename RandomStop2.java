public class RandomStop2 {
  public static void main(String[] args) {
    int number;
    do {
      number = (int) (Math.random() * 10);
      System.out.println(number);
    } while(number != 5);
    System.out.println("It hit 5");
  }
}