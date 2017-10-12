public class NineNineTable2 {
  public static void main(String[] args) {
      for(int i = 1, j = 1; j <= 9; i = (i==9) ? (++j/j) : (i+1)) {
        System.out.printf("%d*%d=%2d%c", i, j, i * j, (i==9 ? '\n' : ' '));
      }
  }
}