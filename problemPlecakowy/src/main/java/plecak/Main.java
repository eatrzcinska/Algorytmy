package plecak;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList rzeczy = new ArrayList();
        rzeczy.add(new Rzecz(2,4));
        rzeczy.add(new Rzecz(3,6));
        rzeczy.add(new Rzecz(1,1));
        Plecak plecak = new Plecak(rzeczy);

        plecak.wypiszWybraneElementyRatio(3);
    }


}
