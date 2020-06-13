package com.miniopdrachtenqien;

public class Fietser {
    Fiets fiets;
    String naam;
    double conditie = 100;
    double portemonnee;
    int aantalKilometers = 0;

    Fietser(String naam, double portemonnee){
        this.naam = naam;
        this.portemonnee = portemonnee;

    }
    Fietser(Fiets fiets){
        this.fiets = fiets;

    }

    void fietsen(){
        this.aantalKilometers+=7;
        this.conditie -=Math.round(0.10 * this.conditie);
        System.out.println("*****" + naam + " gaat fietsen*****");
        if(fiets.heeftPlatteBand){
            System.out.println("Je hebt een platte band gekregen.Type 'e' om de band zelf te maken. Type 'r' om naar de fietsenmaker te gaan.");
        }
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

    void conditieTeLaag() {
        if(this.conditie > 10 && this.conditie < 15){
            System.out.println("Je conditie is onder de 15%, eet een mars voordat je omvalt!");
        }else if (this.conditie < 10){
            System.out.println("Je conditie is lager dan 10% en je bent te moe om verder te fietsen!" +
                    "Tijd om naar huis te gaan.");
        }
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
