package com.miniopdrachtenqien;

public class Fiets {
    String merknaam;
    String kleur;
    String model;
    boolean heeftPlatteBand;

    Fiets(String merknaam, String kleur, String model, boolean heeftPlatteBand) {
        this.merknaam = merknaam;
        this.kleur = kleur;
        this.model = model;
        this.heeftPlatteBand = heeftPlatteBand;
    }

    Fiets() {

    }

    boolean krijgtPlatteBand() {
        waarschuwingPlatteBand();
        return this.heeftPlatteBand = true;
    }

    private void waarschuwingPlatteBand(){
        System.out.println("+++++Help! Een platte band!+++++");
    }

    boolean platteBandGefixed() {
        return this.heeftPlatteBand = false;
    }

    @Override
    public String toString() {
        return "Deze fiets is een " + merknaam + " met de kleur " + kleur +
                " van het model " + model + "." ;
    }
}
