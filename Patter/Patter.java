import java.util.*;
public class Patter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Input");
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == 5 || j == 1 || j == 5) || (i == 3 && j == 3)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


}

