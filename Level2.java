public class Level2 {
  public static void main(String[] args) {
    int score = 88;
    int quotient = score / 10;
    char level;
    switch(quotient) {
      case 10:
      case 9:
        level = 'A';
        break;
      case 8:
        level = 'B';
        break;
      case 7:
        level = 'C';
        break;
      case 6:
        level = 'D';
        break;
      default:
        level = 'E';
    }
    System.out.printf("得分 %d 等級判定為：%c%n", score, level);
  }
}