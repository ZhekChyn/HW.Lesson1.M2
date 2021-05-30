package com.geektech;

public class Main {

    public static void main(String[] args) {

        Birthday fathersBirthday = new Birthday("March",1,1960);
        Birthday firstSonsBirthday = new Birthday("December", 30, 1987);
        Birthday secondSonsBirthday = new Birthday("April", 15, 1992);

        Father MK = new Father("MK", 60, fathersBirthday, FavoriteColor.BLACK, "LLC Temir");

        Son Zhyrgalbek = new Son("Zhyrgalbek", 34, firstSonsBirthday,
                FavoriteColor.WHITE, "Sublime Telecom Sdn Bhd");

        Son Nurik = new Son("Nurik", 29, secondSonsBirthday,
                FavoriteColor.SILVER, "Nurik Ltd", "nurik@gmail.com");

        System.out.println(MK.getInfo());
        MK.makeAdvice("Always be a good person", 3);
        System.out.println("===================================");

        System.out.println(Zhyrgalbek.getInfo());
        Zhyrgalbek.makeAdvice(3, "Be smart, otherwise you'll get a life ");
        System.out.println("===================================");

        System.out.println(Nurik.getInfo());
        Zhyrgalbek.makeAdvice(3, "Be obedient, otherwise you'll get a brothers ");
    }
}
