package com.company;

public class Main {

    public static void main(String[] args) {

        String pojam[] = {"Bicikl","Automobil","Telefon"};
        String naziva[] = {"BMX","Reno 4","I Phone"};
        double cene[] = {150.55,100.0,500.0};

        for (int i = 0; i < pojam.length;i++){
            System.out.println(naziva[i]+" is type: "+pojam[i]+" and it costs: "+cene[i]);
        }


    }
}
