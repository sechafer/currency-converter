package com.currencyconverter.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    private static final String API_KEY = "551bf8d6fed869ab5f2ee889";
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(API_URL + fromCurrency)
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new RuntimeException("Error fetching exchange rates");
            }

            String responseBody = response.body().string();
            JSONObject jsonResponse = new JSONObject(responseBody);
            JSONObject rates = jsonResponse.getJSONObject("rates");
            double exchangeRate = rates.getDouble(toCurrency);

            return amount * exchangeRate;
        } catch (Exception e) {
            throw new RuntimeException("Error converting currency", e);
        }
    }
}