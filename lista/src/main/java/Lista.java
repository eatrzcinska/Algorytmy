public class Lista {
    ElementListy start;

    ElementListy szukaj(int wartosc) {
        ElementListy aktualny = start;
        while (aktualny.nastepny != null && aktualny.nastepny.wartosc < wartosc) {
            aktualny = aktualny.nastepny;
        }
        return aktualny;
    }


    //metoda wstawia element o danej wartosci miedzy elementy mniejszy i wiekszy od niego
    void wstaw(int wartosc) {
        if (start == null) {
            start = new ElementListy(wartosc, null);

        } else if (start.wartosc > wartosc) {
            ElementListy nowy = new ElementListy(wartosc, start);
            start = nowy;
        } else {
            ElementListy poprzednik = szukaj(wartosc);
            ElementListy nowy = new ElementListy(wartosc, poprzednik.nastepny);
            poprzednik.nastepny = nowy;
        }
    }

    void wypiszListe() {

        ElementListy aktualny = start;

        do {
            System.out.println(aktualny.wartosc);
        }
        while ((aktualny=aktualny.nastepny) != null);
    }


}
