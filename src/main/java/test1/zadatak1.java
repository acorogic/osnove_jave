package test1;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
//        Napišite program koji simulira softver za upoznavanje stvoren posebno za žene, pružajući im priliku da upoznaju muškarca svojih snova. U prvoj verziji programa, ženama je ponuđeno pet faktora prema kojima mogu odabrati svog idealnog muškarca. Ovi faktori uključuju:
//        Visina muškarca u određenom rasponu.
//                Grad iz kojeg bi trebao biti muškarac.
//        Starost muškarca u određenom rasponu.
//                Boja kose muškarca.
//        Prisustvo brade kod muškarca.
//
//        Program na početku traži od korisnica da unesu kriterijume koje žele kod svog idealnog partnera, a zatim i informacije o muškarcu kojeg žele upoznati. Na kraju, program će izbaciti rezultat da li su dvoje kompatibilni ili ne. Dvoje se smatraju kompatibilnima ako muškarac zadovoljava barem tri od pet faktora koje su žene definisale.
//
//        Evo primera izvršenja programa:
//
//**Primer izvršenja 1:**
//        Unesite kriterijume za traženje vašeg idealnog muškarca.
//                Min visina: 180
//        Max visina: 200
//        Mesto: Niš
//        Min starost: 30
//        Max starost: 35
//        Boja kose: Crna
//        Potrebno je da ima bradu: true
//
//        Unesite karakteristike muškarca:
//        Visina: 190
//        Mesto: Niš
//        Starost: 32
//        Boja kose: Plava
//        Nosi bradu: false
//        Pronašli ste svog idealnog muškarca!
//
//                **Primer izvršenja 2:**
//        Unesite kriterijume za traženje vašeg idealnog muškarca.
//                Min visina: 180
//        Max visina: 200
//        Mesto: Niš
//        Min starost: 30
//        Max starost: 35
//        Boja kose: Crna
//        Potrebno je da ima bradu: true
//
//        Unesite karakteristike muškarca:
//        Visina: 190
//        Mesto: Beograd
//        Starost: 32
//        Boja kose: Plava
//        Da li ima bradu: false
//        Muškarac ne ispunjava vaše zahteve.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca.");

        System.out.println("unesite min visinu");
        int visinaMin= s.nextInt();
        System.out.println("unesite max visinu");
        int visinaMax= s.nextInt();

        System.out.println("Mesto");
        String mesto= s.next();

        System.out.println("Min starost");
        int starostMin= s.nextInt();

        System.out.println("Max starost");
        int starostMax= s.nextInt();

        System.out.println("boja kose");
        String bojaKose= s.next();

        System.out.println("potrebno je da ima bradu");
        boolean brada= s.nextBoolean();



        System.out.println("unesite karakteristike muskarca");

        System.out.println("unesite  visinu");
        int visinaStvarna= s.nextInt();

        System.out.println("Mesto");
        String mestoStvarno= s.next();

        System.out.println(" starost");
        int starostStvarna= s.nextInt();



        System.out.println("boja kose");
        String bojaKoseStvarna= s.next();

        System.out.println("potrebno je da ima bradu");
        boolean bradaStvarna= s.nextBoolean();

        int brojacKriterijuma= 0;

if (visinaStvarna>= visinaMin && visinaStvarna<=visinaMax) { brojacKriterijuma= brojacKriterijuma+1;}

if (mesto.equals(mestoStvarno)) {brojacKriterijuma=brojacKriterijuma+1;}

if (starostStvarna>=starostMin && starostStvarna<=starostMax) {brojacKriterijuma= brojacKriterijuma+1;}

if (bojaKoseStvarna.equals(bojaKose)) {brojacKriterijuma= brojacKriterijuma+1;}
        if (bradaStvarna == brada) {brojacKriterijuma= brojacKriterijuma+1;}

        if (brojacKriterijuma>=3) {
            System.out.println("pronasli ste idealnog muskarca");}
        else {
            System.out.println("muskarac ne ispunjava kriterijume");






    }
}}

