public class Tema4EX1 {
    public static void main(String[] args) {
        int[] sir = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int counter = 0;
        int nrCounter = SkeletonJava.readIntGUI("introduceti numarul " + counter + ": ");
        int nr = 0;
        for (int i = 0; i < sir.length; i++) {
            nr = sir[i];
            counter = i;
        }
        if (nrCounter == nr) {
            System.out.println("numarul introdus exista: " + nrCounter);
            System.out.println("pozitia este: " + counter);
        } else System.out.println("-1");
    }
}



