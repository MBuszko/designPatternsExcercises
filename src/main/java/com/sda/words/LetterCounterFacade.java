package com.sda.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCounterFacade {

    private  final String WEB_STRATEGY = "W";
    private  final String CONSOLE_STRATEGY = "C";
    private  final String FILE_STRATEGY = "F";
    private  final String EXIT = "E";
    private  Map<String, LetterCounter> strategyMap;

    public LetterCounterFacade() {
        strategyMap = new HashMap<>();
        strategyMap.put(WEB_STRATEGY,new WebLetterCounter());
        strategyMap.put(CONSOLE_STRATEGY,new ConsoleLetterCounter());
        strategyMap.put(FILE_STRATEGY,new FileLetterCounter());
    }

    public void countLetter(){
        LetterCounter letterCounter = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Skad chcesz wczytac dane W/C/F. Wyjsce E");
            String choice = scanner.nextLine();
            if (EXIT.equals(choice)) {
                break;
            }
            letterCounter = strategyMap.get(choice);
            System.out.println("Podaj jaka litere chesz szukac?");
            String searchedLetter = scanner.nextLine();
            System.out.println("Litera " + searchedLetter + " wystepuje " + letterCounter.countLetter(searchedLetter));
        }
    }

}
