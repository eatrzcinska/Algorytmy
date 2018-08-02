import java.util.Random;

public class Main {

    public static void main(String[] args) {


        SuperTablica mojaTablica = new SuperTablica();
        Random losuj = new Random();
//

        mojaTablica.wstaw(99,0);

        mojaTablica.wstaw(98,0);

        mojaTablica.wstaw(97,0);

//      Tablica ma teraz postać: [97,98,99]

        mojaTablica.wstaw(10,2);

//       Tablica ma teraz postać: [97,98,10,99]


        for(int i=0; i<mojaTablica.getSize(); ++i) {
            System.out.println(""+i+" : "+mojaTablica.get(i));
        }

        System.out.println(mojaTablica.szukaj(97));


//        mojaTablica.wstawRosnaco(30);
//        mojaTablica.wstawRosnaco(10);
//        mojaTablica.wstawRosnaco(20);
//        mojaTablica.wstawRosnaco(25);
//        mojaTablica.wstawRosnaco(40);
//        mojaTablica.wstawRosnaco(32);
//        mojaTablica.wstawRosnaco(11);
//        mojaTablica.wstawRosnaco(21);
//        mojaTablica.wstawRosnaco(27);
//        mojaTablica.wstawRosnaco(43);


//        for (int i = 0; i < mojaTablica.getSize(); ++i)
//        {
//            System.out.println("" + i + " : " + mojaTablica.get(i));
//        }
//        mojaTablica.wstawRosnacoBinarnie(23);
////
//        for (int i = 0; i < mojaTablica.getSize(); ++i) {
//            System.out.println("" + i + " : " + mojaTablica.get(i));
//        }

        long startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            int wylosowanaLiczba = losuj.nextInt(100);
            mojaTablica.wstawRosnaco(wylosowanaLiczba);
        }
        long stopTime = System.nanoTime();

        double elapsedTime = (stopTime - startTime) / 1000000;
        System.out.println(elapsedTime);
    }
}