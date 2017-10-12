public class CH03_1 {
  public static void main(String[] args) {
    int m = 1000;
    int n = 495;
    int minimum = Math.min(m, n);
    int gcd = 1;
    for(int i = 1; i <= minimum; i++) {
      if((m%i == 0) && (n%i == 0)) {
        gcd = i;
      }
    }
    System.out.printf("%d 和 %d 的最大公因數：%d%n", m, n, gcd);
  }
}