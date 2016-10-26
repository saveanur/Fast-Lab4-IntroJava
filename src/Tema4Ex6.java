/**
 * Created by user on 10/27/2016.
 */
public class Tema4Ex6 {
    public static void main(String[] args) {
        int a = 0;
        a = SkeletonJava.readIntGUI("numarul a: ");
        int p = 1;
        for (int i = 1; i <= a; i++)
            p = p * i;
        System.out.println(p);


    }
}
