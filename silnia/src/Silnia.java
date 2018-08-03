public class Silnia {


    public static int silnia(int liczba) {

        if (liczba > 1) {
            liczba = liczba * silnia(liczba - 1);
        } else if (liczba == 0 || liczba == 1) {
            liczba = 1;
        }
        return liczba;
    }

}
