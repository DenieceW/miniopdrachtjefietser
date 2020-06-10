package com.miniopdrachtenqien;

import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);
    Fiets fiets = new Fiets("Gazelle", "zwart", "E5000", false);
    Fietser fietser = new Fietser("Deniece", 100,15,0,fiets);

    void start(){
        printIntro();
    label:
            while (true) {
                String input = scanner.nextLine();

                switch (input) {
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
                        fietser.geldOpnemen(12);
                        break;
                    case "stop":
                        System.out.println(fietser.naam + " is moe, en fiets terug naar huis.");
                        break label;
                    default:
                        fietser.fietsen();
                        break;
                }
            }
    }

    private void printIntro(){
        System.out.println("***************************************************");
        System.out.println("Het is een mooie dag! Tijd om eens te gaan fietsen ");
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
}
