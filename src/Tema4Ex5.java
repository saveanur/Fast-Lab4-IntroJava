/**
 * Created by user on 10/26/2016.
 */
public class Tema4Ex5 {
    public static void main(String[] args) {
        int a = 0;
        int n = 0;

        a = SkeletonJava.readIntGUI("numarul a: ");
        n = SkeletonJava.readIntGUI("numarul n: ");
        int p = 1;
        for (int i = 1; i <= n; i++)
            p = p*a;
        System.out.println(p);


    }
}
