public class huittta {
    public static void main(String[] args) {
        int[] newAnwell = {33, 49, 65, 2, 78, 14, 88};
        int maxEl = newAnwell[0];
        int minEl = newAnwell[0];
        for (int index = 0; index < newAnwell.length; index++) {
            if (maxEl < newAnwell[index]) {
                maxEl = newAnwell[index];
            }

            if (minEl > newAnwell[index]) {
                minEl = newAnwell[index];
            }

        } System.out.println(maxEl);
        System.out.println(minEl);
    }
}