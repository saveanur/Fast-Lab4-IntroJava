/**
 * Created by user on 10/26/2016.
 */
public class Tema4Ex4 {
    public static void main(String[] args) {
        int nrCounter = SkeletonJava.readIntGUI("introduceti numarul: " );

        if (nrCounter > 9 && nrCounter < 24) {
            System.out.println("true");
        }
        else System.out.println("false");
    }
}

