package ru.curs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ru.curs.lyra.controller", "ru.curs.lyra.service"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
