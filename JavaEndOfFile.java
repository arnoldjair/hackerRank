import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        String str = "";
        while (in.hasNext()) {
            str += "" + (i++) + " " + in.nextLine() + "\n";
        }
        System.out.println(str);

        in.close();
    }
}
