import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int B;
    static int H;

    static {
        try (Scanner in = new Scanner(System.in)) {
            B = in.nextInt();
            H = in.nextInt();

            if (B <= 0 || H <= 0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                System.exit(0);
            } else {
                System.out.println(B * H);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
    }

}
