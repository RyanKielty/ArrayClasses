package com.company;

public class Main {

    public static void main(String[] args) {
        House h = new House();
        h.streetnumber = 1840;
        h.streetaddress = "Taconite Trail";
        h.garageAttached = true;
        System.out.println(h.streetnumber);
        System.out.println(h.streetaddress);
        System.out.println(h.garageAttached);

        Car c = new Car();
        c.isNew = false;
        c.year = 2004;
        c.make = "Honda";
        System.out.println(c.isNew);
        System.out.println(c.year);
        System.out.println(c.make);

        Skydive s = new Skydive();
        s.height = 12000;
        s.parachute = 2;
        s.didSurvive = true;
        System.out.println(s.height);
        System.out.println(s.parachute);
        System.out.println(s.didSurvive);

        Pants p = new Pants();
        p.fitRegular = true;
        p.waist = 36;
        p.style = "Jeans";
        System.out.println(p.fitRegular);
        System.out.println(p.waist);
        System.out.println(p.style);

        Train t = new Train();
        t.cars = 20;
        t.isElectric = true;
        t.hasPassengers = true;
        System.out.println(t.cars);
        System.out.println(t.isElectric);
        System.out.println(t.hasPassengers);


    }
}
