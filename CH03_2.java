public class CH03_2 {
  public static void main(String[] args) {
    for(int i = 1; i <= 9; i++) {
      for(int j = 0; j <= 9; j++) {
        for(int k = 0; k <= 9; k++) {
          int armstrong = (int)Math.pow(i,3) + (int)Math.pow(j,3) + (int)Math.pow(k,3);
          int sum = i*100 + j*10 + k;
          if(armstrong == sum) {
            System.out.printf("%d%d%d 是一個阿姆斯壯數%n", i, j, k);
          }
        }
      }
    }
  }
}