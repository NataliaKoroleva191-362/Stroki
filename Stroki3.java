import java.util.Scanner;
public class Stroki3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();
        int n = 0;
        String max = "";
        String[] b = k.split(" ");
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() >= n) {
                n = b[i].length();
                max = b[i];
            }
        }
                System.out.println(max);
            }
        }
