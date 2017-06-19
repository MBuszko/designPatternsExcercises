package com.sda.io;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws IOException {
        String url = "https://raw.githubusercontent.com/dwyl/english-words/master/words.txt";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        HttpResponse response = client.execute(request);

        String responseBody = IOUtils.toString(response.getEntity().getContent(), "UTF-8");

        Arrays.asList(responseBody.split(System.lineSeparator())).forEach(System.out::println);
        //System.out.println(responseBody);

    }
}
