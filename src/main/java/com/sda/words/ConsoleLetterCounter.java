package com.sda.words;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class ConsoleLetterCounter implements LetterCounter {

    @Override
    public int countLetter(String letter) {
        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();
        return StringUtils.countMatches(content, letter);
    }
}
