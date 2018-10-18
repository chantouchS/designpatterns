package lab9.tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleTour st1 = new SingleTour("Ayutthaya Tour",350,15,0);
        SingleTour st2 = new SingleTour("Fukuoka Tour",5000,20,0);
        SingleTour st3 = new SingleTour("Samed Tour",500,35,0);
        List<Tour> thaiTours = new ArrayList<Tour>();
        thaiTours.add(st1);
        thaiTours.add(st3);

        PackageTour packageTour = new PackageTour("Thailand Tour",thaiTours);


        st2.setReservedSeats(15);
        st2.setReservedSeats(50);
        System.out.println(st2.toString());

        System.out.println(packageTour.toString());


    }
}
