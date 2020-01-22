import java.util.Scanner;
public class Stroki2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st, result = "";
        int sch = 0, Count = 0;
        st = sc.nextLine();
        sc.close();
        st = st.trim();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ')
                sch++;
            else
            {
                Count++;
                if (sch == 3)
                    result = result.concat(Count + " ");
                sch = 0;
            }
            if ( i+1 >= st.length() && sch == 3) {
                Count++;
                result = result.concat(Count + " ");
            }
        }
        System.out.println(result);
    }
}
