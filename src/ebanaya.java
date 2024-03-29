public class ebanaya {
    public static void main(String[] args) {
        int[] books = new int [100];
        int strFatBooks = 0;
        Random randomChisla = new Random();
        for (int index = 0; index < books.length; index++) {
            books[index] = randomChisla.nextInt(1, 100);

                if (strFatBooks < books[index]) {
                    strFatBooks = books[index];
                }


            }System.out.println(strFatBooks);
        }
}