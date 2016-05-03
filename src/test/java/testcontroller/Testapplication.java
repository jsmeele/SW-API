package testcontroller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import testcontroller.Testapplication;

@ComponentScan
@EnableAutoConfiguration
public class Testapplication {

    public static void main(String[] args) {
        SpringApplication.run(Testapplication.class, args);
    }
}
