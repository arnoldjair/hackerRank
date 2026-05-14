import java.util.*;
import java.util.stream.*;

public class JavaLoopsII {

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int q = in.nextInt();
      List<int[]> arr = IntStream.range(0, q)
          .mapToObj(i -> new int[] { in.nextInt(), in.nextInt(), in.nextInt() })
          .collect(Collectors.toList());

      arr.stream().forEach(values -> {
        for (int i = 0; i < values[2]; i++) {
          System.out.print(result(values[0], values[1], i) + " ");
        }
        System.out.println();
      });
    }

  }

  public static int result(int a, int b, int n) {
    var sum = Math.pow(2, (n + 1)) - 1;
    return (int) (a + b * sum);
  }

}
