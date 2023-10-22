public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1");
    for (int number = 1; number <= 10; number++) {
      System.out.println(number);
    }
    System.out.println();

    System.out.println("Задача №2");
    for (int numberMinus = 10; numberMinus >= 1; numberMinus--) {
      System.out.println(numberMinus);
    }
    System.out.println();

    System.out.println("Задача №3");
    for (int evenNumber = 0; evenNumber <= 17; evenNumber = evenNumber + 2) {
      System.out.println(evenNumber);
    }
    System.out.println();

    System.out.println("Задача №4");
    for (int i = 10; i >= -10; i--) {
      System.out.println(i);
    }
    System.out.println();

    System.out.println("Задача №5");
    for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear + 4) {
      System.out.println(leapYear + " год является високостным");
    }
    System.out.println();

    System.out.println("Задача №6");
    for (int x = 7; x <= 98; x = x + 7) {
      System.out.println(x);
    }
    System.out.println();

    System.out.println("Задача №7");
    for (int y = 1; y <= 512; y = y * 2) {
      System.out.println(y);
    }
    System.out.println();

    System.out.println("Задача №8");
    int savings = 29000;
    int totalSavings = 0;
    for (int s = 1; s <= 12; s++) {
      totalSavings = totalSavings + savings;
      System.out.println("В месяц " + s + ", сумма накоплений равна " + totalSavings);
    }
    System.out.println();

    System.out.println("Задача №9");
    int savings1 = 29000;
    int totalSavings1 = 0;
    for (int p = 1; p <= 12; p++) {
      totalSavings1 = totalSavings1 + totalSavings1 / 100;
      totalSavings1 = totalSavings1 + savings1;
      System.out.println("В месяц " + p + ", сумма накоплений равна " + totalSavings1);
    }
    System.out.println();

    System.out.println("Задача №10");
    for (int n = 1; n <= 10; n++) {
      System.out.println("2*" + n + "=" + 2 * n);
    }
  }
}