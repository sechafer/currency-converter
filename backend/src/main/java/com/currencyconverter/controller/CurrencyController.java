package com.currencyconverter.controller;

import com.currencyconverter.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/convert")
    public ResponseEntity<Double> convertCurrency(
        @RequestParam String fromCurrency,
        @RequestParam String toCurrency,
        @RequestParam double amount
    ) {
        try {
            double convertedAmount = currencyService.convertCurrency(fromCurrency, toCurrency, amount);
            return ResponseEntity.ok(convertedAmount);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
