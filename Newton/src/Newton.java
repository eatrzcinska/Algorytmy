public class Newton {

    static int[][] tablica = new int[100][100];

    public static int silnia(int liczba) {

        if (liczba > 1) {
            liczba = liczba * silnia(liczba - 1);
        } else if (liczba <= 1) {
            liczba = 1;
        }
        return liczba;
    }


    //z trojkata Pascala
    public static int obliczNewton(int w, int k) {

        if (k == 0 || k == w) return 1;

        else {
            int wynik = obliczNewton(w - 1, k) + obliczNewton(w - 1, k - 1);
            return wynik;
        }
    }

    //z definicji rekurencji
    public static int obliczNewtonSilnia(int n, int k) {
        int wynik = silnia(n) / ((silnia(k) * silnia(n - k)));
        return wynik;
    }

    //z trojkata Pascala - programowanie dynamiczne
    public static int obliczNewtonTablica(int w, int k) {
        if (tablica[w][k] != 0) {
            if (k == 0 || k == w) {
                return 1;
            } else {
                int wynik = obliczNewton(w - 1, k) + obliczNewton(w - 1, k - 1);
                tablica[w][k] = wynik;
                return wynik;
            }
        } else {
            return tablica[w][k];
        }
    }
}
