import java.util.Random;
public class suckmadick {
    public static void main(String[] args) {
        int[] carr = new int[50];
        int dorogayacar = 0;
        Random generatorCarr = new Random();
        for (int index = 0; index < carr.length; index++) {
            carr[index] = generatorCarr.nextInt(1, 50);
            if (dorogayacar < carr[index]) {
                dorogayacar = carr[index];
            }
        }
        System.out.println(dorogayacar);
    }
}
