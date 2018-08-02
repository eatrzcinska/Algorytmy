public class SuperTablica {

    int[] tablica = new int[1000000];

    // Aktualna wielkość tablicy
    int wielkosc = 0;


    public void wstaw(int element, int index) {

        //Wstawianie elementu do tablicy na podanym indexie przesuwając pozostałe wartości w prawo
        //Pętla w tył, przepisanie elementu z porzedniego (i-1) na obecny (i)

        for (int i = wielkosc + 1; i > index; --i) {
            tablica[i] = tablica[i - 1];
        }

        //Wstawieniw elementu w miejsce tablicy o podanym w parametrach indexie
        tablica[index] = element;

        //Powiekszenie licznika ilosci elementow w tablicy o 1
        wielkosc++;
    }


    public int get(int index) {
        //return elementu o podanym indexie
        if (index<0) return Integer.MIN_VALUE;
        else if(index>wielkosc-1) return Integer.MAX_VALUE;         //?
        return tablica[index];
    }

    public int getSize() {
        //zwraca ilość aktualnie wprowadzonych elementów
        return wielkosc;
    }

    public int szukaj(int wartosc) {

        for (int i = 0; i < wielkosc; i++)
            if (tablica[i] >= wartosc) return i;
        return -1;
    }

    public void wstawRosnaco(int wstawiana) {
        int zna = szukaj(wstawiana);
        if (zna == -1) {
            wstaw(wstawiana, wielkosc);
        } else {
            wstaw(wstawiana, zna);
        }
    }
    public void wstawRosnacoBinarnie(int wstawiana) {
        int zna = szukajBinarnie(wstawiana);
        if (zna == -1) {
            wstaw(wstawiana, wielkosc);
        } else {
            wstaw(wstawiana, zna);
        }
    }

    public int szukajBinarnie(int wartosc) {

        int indeks = (int)(wielkosc)/2;
        int skok = (int)(wielkosc)/4;

        while (!(wartosc <= get(indeks) && wartosc>get(indeks-1))) {
            if (wartosc <= get(indeks)) {
                indeks=indeks-skok;
            } else {
                indeks=(int)indeks+skok;
            }
            skok = skok/2;
            if(skok==0)
                skok=1;
        }
        return indeks;
    }
}