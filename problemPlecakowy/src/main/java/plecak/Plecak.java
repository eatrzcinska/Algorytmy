package plecak;

import java.util.ArrayList;

public class Plecak {

    ArrayList<Rzecz> rzeczy;

    public Plecak(ArrayList<Rzecz> rzeczy) {
        this.rzeczy = rzeczy;
    }

    // metoda segreguje od najdroższego do najtanszego
    public int wybierzElementy(int pojemnosc) {
        ArrayList<Rzecz> wybrane = new ArrayList<Rzecz>();
        rzeczy.sort((Rzecz a1, Rzecz a2) -> (a2.wartosc - a1.wartosc));
        int rezultat = 0;
        for (Rzecz i : rzeczy) {
            if (i.waga <= pojemnosc) {
                wybrane.add(i);
                rezultat += i.wartosc;
                pojemnosc = pojemnosc - i.waga;
                System.out.println(i.waga);
            }
        }
        return rezultat;
    }

    // metoda segreguje od największego ratio
    public int wybierzElementyRatio(int pojemnosc) {
        ArrayList<Rzecz> wybrane2 = new ArrayList<Rzecz>();
        rzeczy.sort((Rzecz a1, Rzecz a2) -> (int) (100 * (a2.getRatio() - a1.getRatio())));
        int rezultat = 0;
        for (Rzecz i : rzeczy) {
            if (i.waga <= pojemnosc) {
                wybrane2.add(i);
                rezultat += i.wartosc;
                pojemnosc = pojemnosc - i.waga;
                System.out.println(i.waga);
            }
        }
        return rezultat;
    }
}
