package com.kodilla.rentacamperfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentacamperfrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentacamperfrontendApplication.class, args);
        MainView mainView = new MainView();
        mainView.refresh();
    }
}
