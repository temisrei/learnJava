// package cc.openhome;

public class Range {
  public static void main(String[] args) {
    System.out.println("---- 基本型態 ----");
    System.out.println("-- 整數 --");
    System.out.printf("short 範圍：");
    System.out.printf("%d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
    System.out.printf("int 範圍：");
    System.out.printf("%d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
    System.out.printf("long 範圍：");
    System.out.printf("%d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
    System.out.println("");

    System.out.println("-- 位元組 --");
    System.out.printf("byte 範圍：");
    System.out.printf("%d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
    System.out.println("");

    System.out.println("-- 浮點數 --");
    System.out.printf("float 精度範圍：");
    System.out.printf("%d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
    System.out.printf("double 精度範圍：");
    System.out.printf("%d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
    System.out.println("");

    System.out.println("-- 字元 --");
    System.out.printf("char 範圍：");
    System.out.printf("%h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);
    System.out.println("");
 
    System.out.println("-- 布林 --");
    System.out.printf("boolean 值：");
    System.out.printf("%b ~ %b%n", Boolean.TRUE, Boolean.FALSE);
    System.out.println("");
  }
}