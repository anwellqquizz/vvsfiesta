import java.util.Random;
public class konfetki {
    public static void main(String[] args) {

        int[] konfetki = new int[20];
        Random generatorKonfetok = new Random();
        int deshmanKonfets = 0;
        for (int index = 0; index < konfetki.length; index++) {
            konfetki[index] = generatorKonfetok.nextInt(1, 20);

            deshmanKonfets = 21;

            if (deshmanKonfets > konfetki[index]) {
                deshmanKonfets = konfetki[index];
            }
        }
        System.out.println(deshmanKonfets);
    }
    }

