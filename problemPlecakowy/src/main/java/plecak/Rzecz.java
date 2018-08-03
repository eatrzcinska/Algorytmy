package plecak;

public class Rzecz {
    public int waga;            //0-100
    public int wartosc;         //0-100
    public double ratio;

    public Rzecz (int waga, int wartosc){
        this.waga = waga;
        this.wartosc = wartosc;
    }


    public double getRatio(){
        return (double) wartosc/(double)waga;
    }
}