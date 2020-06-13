package com.miniopdrachtenqien;

import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);
    Fiets fiets = new Fiets();
    Fietser fietser = new Fietser(fiets);

    void start(){
        printIntro();
        maakEenFiets(fiets);
        profielFietsers(fietser);
        System.out.println("Tijd om te gaan fietsen, druk enter om te starten");
    label:
            while (true) {
                String input = scanner.nextLine();
                switch (input) {
                    case "a":
                        System.out.println(fiets);
                        break;
                    case "q":
                        System.out.println(fietser);
                        break;
                    case "w":
                        fiets.krijgtPlatteBand();
                        break;
                    case "e":
                        fietser.platteBandFixenZelf();
                        break;
                    case "r":
                        fietser.fietsenMaker();
                        break;
                    case "t":
                        fietser.eetMars();
                        break;
                    case "y":
                        fietser.pinGeld();
                        break;
                    case "stop":
                        System.out.println(fietser.naam + " is moe, en fiets terug naar huis.");
                        break label;
                    default:
                        fietser.fietsen();
                        break;
                }

                if(fietser.conditie > 10 && fietser.conditie < 15){
                    System.out.println("Je conditie is onder de 15%, eet een mars (type 't') voordat je omvalt!");
                }else if (fietser.conditie <= 10){
                    System.out.println("Je conditie is lager dan 10% en je bent te moe om verder te fietsen!" +
                            "Tijd om naar huis te gaan.");
                    break;
                }
            }
    }

    private void printIntro(){
        System.out.println("***************************************************");
        System.out.println("Het is een mooie dag! Tijd om eens te gaan fietsen ");
        System.out.println("Commandos: 'a': laat fiets zien");
        System.out.println("Commandos: 'q': laat status fietser zien");
        System.out.println("Commandos: 'w': fiets krijgt een platte band");
        System.out.println("Commandos: 'e': repareer de fiets zelf");
        System.out.println("Commandos: 'r': ga naar de fietsenmaker");
        System.out.println("Commandos: 't': eet een mars voor extra conditie");
        System.out.println("Commandos: 'y': pin 12 euro");
        System.out.println("Commandos: 'enter': ga fietsen");
        System.out.println("Commandos: 'stop': terug naar huis");
        System.out.println("***************************************************");

    }

    private void profielFietsers(Fietser fietser){
        System.out.println("Voordat we gaan fietsen, wat is jouw naam en hoeveel geld heb je op zak?");
        System.out.print("Naam: ");
        String naam = scanner.nextLine();
        System.out.print("Bedrag: ");
        int geld = Integer.parseInt(scanner.nextLine());
        fietser.naam = naam;
        fietser.portemonnee = geld;
        fietser.fiets = fiets;
    }

    private void maakEenFiets(Fiets fiets){
        System.out.println("Eerst een mooie fiets uitkiezen!");
        System.out.print("Wat voor merk is jouw fiets? ");
        String naamFiets = scanner.nextLine();
        System.out.print("Welke kleur heeft jouw fiets? ");
        String kleurFiets = scanner.nextLine();
        System.out.print("Welk model? ");
        String fietsModel = scanner.nextLine();
        fiets.heeftPlatteBand = false;
        fiets.merknaam = naamFiets;
        fiets.model = fietsModel;
        fiets.kleur = kleurFiets;

    }

}
