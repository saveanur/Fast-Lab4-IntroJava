/**
 * Created by user on 10/26/2016.
 */
public class Tema4Ex3 {
    public static void main(String[] args) {
        int suma = 0;
        int counter = 0;
        while (true) {
            int nrCounter = SkeletonJava.readIntGUI("introduceti numarul " + counter + ": ");
            if (nrCounter > 4 && nrCounter < 11) {
                counter++;
                suma = suma + nrCounter;
            } else if (nrCounter == 0) {
                break;
            }

            System.out.println("suma este: " + suma);

//            if (nrCounter == 0);
//            break;

        }
    }
}