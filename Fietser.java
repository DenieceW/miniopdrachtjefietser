package com.miniopdrachtenqien;

public class Fietser {
    Fiets fiets;
    String naam;
    double conditie;
    double portemonnee;
    boolean fixBand;
    int aantalKilometers;

    Fietser(String naam, double conditie, double portemonnee,int kilometers, Fiets fiets){
        this.naam = naam;
        this.conditie = conditie;
        this.portemonnee = portemonnee;
        this.fiets = fiets;
        this.aantalKilometers = kilometers;

    }

    void fietsen(){
        this.aantalKilometers+=7;
        this.conditie -=Math.round(0.10 * this.conditie);
        System.out.println("*****" + naam + " gaat fietsen*****");
    }

    void eetMars(){
        if(this.conditie < 100) {
            this.conditie +=Math.round(0.20 * this.conditie);
        }
        this.portemonnee -= 2;
        System.out.println("*****" + naam + " koopt een mars voor extra conditie*****");
    }

    double geldOpnemen(double bedrag){
        geldOpnemenNotificatie(bedrag);
        return this.portemonnee+= bedrag;
    }

    private void geldOpnemenNotificatie(double bedrag){
        System.out.println("*****" + naam + " heeft " + bedrag + " euro gepind*****");
    }

    void platteBandFixenZelf(){
        this.conditie-=Math.round(0.20 * this.conditie);
        fiets.platteBandGefixed();
        System.out.println("*****" + naam + " fixt de band zelf, dit kost 20% van haar conditie*****");
    }

    void fietsenMaker(){
        this.portemonnee-=10;
        fiets.platteBandGefixed();
        System.out.println("*****" + naam + " gaat naar de fietsenmaker om de band te fixen, dit kost 10 eurootjes*****");
    }

    @Override
    public String toString() {
        if(fiets.heeftPlatteBand){
            return naam + " heeft een conditie van " + conditie + "% en heeft " + portemonnee + " euro op zak." + naam
                    + " heeft " + aantalKilometers + " kilometers gefietst." +
                    "Ze heeft een platte band.";
        }else
            return naam + " heeft een conditie van " + conditie + "% en heeft " + portemonnee + " euro op zak." + naam
                    + " heeft " + aantalKilometers + " kilometers gefietst." +
                    "Ze heeft geen platte band.";

    }
}
