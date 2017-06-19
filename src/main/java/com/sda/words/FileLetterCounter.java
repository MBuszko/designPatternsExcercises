package com.sda.words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class FileLetterCounter implements LetterCounter {
    @Override
    public int countLetter(String letter) {
        try {
            List<String> words = Files.readAllLines(Paths.get("words.txt"));
            int totalCounter = 0;
            for (String word : words) {
                totalCounter += StringUtils.countMatches(word, letter);
            }
            // int sum = words.stream().mapToInt(word -> StringUtils.countMatches(word,
            // letter)).sum();
            return totalCounter;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
