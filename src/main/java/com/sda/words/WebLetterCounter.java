package com.sda.words;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class WebLetterCounter implements LetterCounter {

    private HttpClient client;
    private HttpGet request;

    public WebLetterCounter() {
        client = HttpClientBuilder.create()
                .build();
        request = new HttpGet("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt");

    }

    @Override
    public int countLetter(String letter) {
        try {
            HttpResponse response = client.execute(request);

            String content = IOUtils.toString(response.getEntity()
                    .getContent(), "UTF-8");

            return StringUtils.countMatches(content, letter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
