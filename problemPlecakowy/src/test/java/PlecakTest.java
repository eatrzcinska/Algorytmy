
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import plecak.Plecak;
import plecak.Rzecz;

import java.util.ArrayList;

public class PlecakTest {

 /*   @Before
    public ArrayList<Rzecz> tworzenieListyRzeczy() {
        ArrayList<Rzecz> listaRzeczy = new ArrayList<>();
        listaRzeczy.add(new Rzecz(4, 5));
        listaRzeczy.add(new Rzecz(5, 5));
        listaRzeczy.add(new Rzecz(10, 15));
        listaRzeczy.add(new Rzecz(2, 2));
        listaRzeczy.add(new Rzecz(3, 3));
        listaRzeczy.add(new Rzecz(11, 10));

        return listaRzeczy;
    }*/

    @Test
    public void testWybierzElementy() {
        ArrayList<Rzecz> listaRzeczy = new ArrayList<>();
        listaRzeczy.add(new Rzecz(4, 7));
        listaRzeczy.add(new Rzecz(5, 4));
        listaRzeczy.add(new Rzecz(10, 15));
        listaRzeczy.add(new Rzecz(2, 2));
        listaRzeczy.add(new Rzecz(3, 6));
        listaRzeczy.add(new Rzecz(11, 10));

        Plecak plecak = new Plecak(listaRzeczy);

        assertEquals(17,plecak.wybierzElementy(12));
    }

    @Test
    public void testWybierzElementyRatio() {
        ArrayList<Rzecz> listaRzeczy = new ArrayList<>();
        listaRzeczy.add(new Rzecz(4, 7));
        listaRzeczy.add(new Rzecz(5, 4));
        listaRzeczy.add(new Rzecz(10, 15));
        listaRzeczy.add(new Rzecz(2, 2));
        listaRzeczy.add(new Rzecz(3, 6));
        listaRzeczy.add(new Rzecz(11, 10));

        Plecak plecak = new Plecak(listaRzeczy);

        assertEquals(15,plecak.wybierzElementyRatio(12));
    }
}
