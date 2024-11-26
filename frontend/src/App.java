package com.currencyconverter;

import com.currencyconverter.components.CurrencyConverter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scene scene = new Scene(currencyConverter, 400, 300);

        primaryStage.setTitle("Currency Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
