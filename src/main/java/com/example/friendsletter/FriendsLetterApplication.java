package com.example.friendsletter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FriendsLetterApplication {

    public static void main(String[] args) {
        //todo add local compressed message store
        //todo message stats
        //todo localization en/fr/ru
        //todo tests
        //todo message qr code
        //todo list public messages
        //copy letter button //ready
        //todo redirect after post

        SpringApplication.run(FriendsLetterApplication.class, args);
    }

}
