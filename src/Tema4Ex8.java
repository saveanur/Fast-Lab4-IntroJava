/**
 * Created by user on 10/28/2016.
 */
public class Tema4Ex8 {
    public static void main(String[] args) {
        int a = 0;
        int n = 0;
        int sum = 0;
        a = SkeletonJava.readIntGUI("numarul a: ");
        n = SkeletonJava.readIntGUI("numarul n: ");
        int p = 1;
        for (int i = 1; i <= n; i++)
            p = 1 + (p*a) ;

        System.out.println(p);
    }
}
