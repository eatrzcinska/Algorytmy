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
    public ArrayList<Rzecz> wybierzElementyRatio(int pojemnosc) {
        ArrayList<Rzecz> wybrane = new ArrayList<Rzecz>();
        rzeczy.sort((Rzecz a1, Rzecz a2) -> (int) (100 * (a2.getRatio() - a1.getRatio())));
        int rezultat = 0;
        for (Rzecz i : rzeczy) {
            if (i.waga <= pojemnosc) {
                wybrane.add(i);
                rezultat += i.wartosc;
                pojemnosc = pojemnosc - i.waga;
                System.out.println(i.waga);
            }
        }
        return wybrane;
    }



    private int BruteForce (int pojemnosc, ArrayList<Rzecz> pozostaleRzeczy) {
        int najlepszy = 0;
        while (pozostaleRzeczy.size() > 0) {
            Rzecz r = pozostaleRzeczy.get(0);
            pozostaleRzeczy.remove(r);
            if (r.waga <= pojemnosc) {
                ArrayList<Rzecz> listaBezWybranegoElementu = new ArrayList<>(pozostaleRzeczy);
                int wynik = r.wartosc + BruteForce(pojemnosc - r.waga, listaBezWybranegoElementu);
                if (wynik > najlepszy) najlepszy = wynik;
            }
        }
        return najlepszy;
    }

    public int wybierzElementyBruteForce(int pojemnosc) {
        return BruteForce(pojemnosc, rzeczy);
    }


    public void wypiszWybraneElementyRatio(int pojemnosc) {
        //ta metoda wypisuje rzeczy wybrane w metozie z Ratio
        for (Rzecz r : wybierzElementyRatio(pojemnosc))
            System.out.println("element warty " + r.wartosc + "$ wazy " + r.waga + "kg");

    }


    public int sumaWartosci(int pojemnosc) {
        //wywoluje metode wybierzElementy, sumuje wartosci i zwraca wynik
        int suma = 0;
        for (Rzecz r : wybierzElementyRatio(pojemnosc))
            suma += r.wartosc;
        return suma;
    }
}
