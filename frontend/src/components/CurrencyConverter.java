package com.currencyconverter.components;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class CurrencyConverter extends VBox {
    private TextField fromCurrencyField;
    private TextField toCurrencyField;
    private TextField amountField;
    private Text resultText;

    public CurrencyConverter() {
        fromCurrencyField = new TextField();
        fromCurrencyField.setPromptText("From Currency");

        toCurrencyField = new TextField();
        toCurrencyField.setPromptText("To Currency");

        amountField = new TextField();
        amountField.setPromptText("Amount");

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> convertCurrency());

        resultText = new Text();

        getChildren().addAll(fromCurrencyField, toCurrencyField, amountField, convertButton, resultText);
    }

    private void convertCurrency() {
        String fromCurrency = fromCurrencyField.getText();
        String toCurrency = toCurrencyField.getText();
        double amount = Double.parseDouble(amountField.getText());

        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://localhost:8080/api/currency/convert?fromCurrency=" + fromCurrency + "&toCurrency=" + toCurrency + "&amount=" + amount)
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                resultText.setText("Error converting currency");
                return;
            }

            String responseBody = response.body().string();
            double convertedAmount = Double.parseDouble(responseBody);
            resultText.setText("Converted Amount: " + convertedAmount);
        } catch (Exception e) {
            resultText.setText("Error converting currency");
        }
    }
}
