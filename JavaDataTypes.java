import java.util.Scanner;

public class JavaDataTypes {

  static class NumberType {
    final String name;
    final int bits;

    NumberType(String name, int bits) {
      this.name = name;
      this.bits = bits;
    }
  }

  static void fittedTypes(long decimal) {
    System.out.println(decimal + " can be fitted in:");

    NumberType[] types = {
        new NumberType("byte", 7),
        new NumberType("short", 15),
        new NumberType("int", 31),
        new NumberType("long", 63)
    };

    for (int i = 0; i < types.length; i++) {
      long cap = (i == 3) ? Long.MAX_VALUE : (1L << types[i].bits) - 1;
      long min = -cap - 1;
      if (decimal >= min && decimal <= cap) {
        for (int j = i; j < types.length; j++) {
          System.out.println("* " + types[j].name);
        }
        break;
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int T = Integer.parseInt(sc.nextLine());
      while (T > 0) {
        String nextNumber = sc.nextLine();
        try {
          fittedTypes(Long.parseLong(nextNumber));
        } catch (NumberFormatException e) {
          System.out.println(nextNumber + " can't be fitted anywhere.");
        }
        T--;
      }
    }
  }
}