package com.currencyconverter.components;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter extends VBox {
    private ComboBox<Currency> fromCurrencyComboBox;
    private ComboBox<Currency> toCurrencyComboBox;
    private TextField amountField;
    private Text resultText;
    private ObservableList<Currency> currencies;

    public CurrencyConverter() {
        // Crear la lista de monedas
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("Afgani afgano", "AFN"));
        currencyList.add(new Currency("Lek", "ALL"));
        currencyList.add(new Currency("Euro", "EUR"));
        currencyList.add(new Currency("Dinar argelino", "DZD"));
        currencyList.add(new Currency("Dólar del Caribe Oriental", "XCD"));
        currencyList.add(new Currency("Dólar estadounidense", "USD"));
        currencyList.add(new Currency("Franco CFA de África Central", "XAF"));
        currencyList.add(new Currency("Franco CFA de África Occidental", "XOF"));
        currencyList.add(new Currency("Kwanza angoleño", "AOA"));
        currencyList.add(new Currency("Dólar australiano", "AUD"));
        currencyList.add(new Currency("Florín de Aruba", "AWG"));
        currencyList.add(new Currency("Manat azerbaiyano", "AZN"));
        currencyList.add(new Currency("Dinar bahreiní", "BHD"));
        currencyList.add(new Currency("Taka bangladesí", "BDT"));
        currencyList.add(new Currency("Dólar de Barbados", "BBD"));
        currencyList.add(new Currency("Rublo bielorruso", "BYN"));
        currencyList.add(new Currency("Dólar beliceño", "BZD"));
        currencyList.add(new Currency("Dólar canadiense", "CAD"));
        currencyList.add(new Currency("Peso chileno", "CLP"));
        currencyList.add(new Currency("Yuan chino", "CNY"));
        currencyList.add(new Currency("Peso colombiano", "COP"));
        currencyList.add(new Currency("Colón costarricense", "CRC"));
        currencyList.add(new Currency("Kuna croata", "HRK"));
        currencyList.add(new Currency("Peso cubano", "CUP"));
        currencyList.add(new Currency("Corona checa", "CZK"));
        currencyList.add(new Currency("Corona danesa", "DKK"));
        currencyList.add(new Currency("Libra egipcia", "EGP"));
        currencyList.add(new Currency("Corona de Eritrea", "ERN"));
        currencyList.add(new Currency("Birr etíope", "ETB"));
        currencyList.add(new Currency("Libra esterlina", "GBP"));
        currencyList.add(new Currency("Lari georgiano", "GEL"));
        currencyList.add(new Currency("Cedi ghanés", "GHS"));
        currencyList.add(new Currency("Quetzal guatemalteco", "GTQ"));
        currencyList.add(new Currency("Dólar guyanés", "GYD"));
        currencyList.add(new Currency("Lempira hondureño", "HNL"));
        currencyList.add(new Currency("Dólar hongkonés", "HKD"));
        currencyList.add(new Currency("Forinto húngaro", "HUF"));
        currencyList.add(new Currency("Rupia india", "INR"));
        currencyList.add(new Currency("Rupia indonesia", "IDR"));
        currencyList.add(new Currency("Rial iraní", "IRR"));
        currencyList.add(new Currency("Dinar iraquí", "IQD"));
        currencyList.add(new Currency("Nuevo shekel israelí", "ILS"));
        currencyList.add(new Currency("Yen japonés", "JPY"));
        currencyList.add(new Currency("Dinar jordano", "JOD"));
        currencyList.add(new Currency("Tenge kazajo", "KZT"));
        currencyList.add(new Currency("Chelín keniano", "KES"));
        currencyList.add(new Currency("Won surcoreano", "KRW"));
        currencyList.add(new Currency("Dinar kuwaití", "KWD"));
        currencyList.add(new Currency("Som kirguís", "KGS"));
        currencyList.add(new Currency("Kip laosiano", "LAK"));
        currencyList.add(new Currency("Libra libanesa", "LBP"));
        currencyList.add(new Currency("Dólar liberiano", "LRD"));
        currencyList.add(new Currency("Dinar libio", "LYD"));
        currencyList.add(new Currency("Franco suizo", "CHF"));
        currencyList.add(new Currency("Peso mexicano", "MXN"));
        currencyList.add(new Currency("Dirham marroquí", "MAD"));
        currencyList.add(new Currency("Rupia pakistaní", "PKR"));
        currencyList.add(new Currency("Balboa panameño", "PAB"));
        currencyList.add(new Currency("Guaraní paraguayo", "PYG"));
        currencyList.add(new Currency("Sol peruano", "PEN"));
        currencyList.add(new Currency("Peso filipino", "PHP"));
        currencyList.add(new Currency("Zloty polaco", "PLN"));
        currencyList.add(new Currency("Riyal catarí", "QAR"));
        currencyList.add(new Currency("Leu rumano", "RON"));
        currencyList.add(new Currency("Rublo ruso", "RUB"));
        currencyList.add(new Currency("Franco ruandés", "RWF"));
        currencyList.add(new Currency("Dólar de San Vicente y las Granadinas", "XCD"));
        currencyList.add(new Currency("Rial saudí", "SAR"));
        currencyList.add(new Currency("Chelín somalí", "SOS"));
        currencyList.add(new Currency("Rand sudafricano", "ZAR"));
        currencyList.add(new Currency("Libra sudanesa", "SDG"));
        currencyList.add(new Currency("Peso uruguayo", "UYU"));
        currencyList.add(new Currency("Bolívar venezolano", "VES"));
        currencyList.add(new Currency("Dong vietnamita", "VND"));
        currencyList.add(new Currency("Rial yemení", "YER"));
        currencyList.add(new Currency("Franco CFA de África Central", "XAF"));
        currencyList.add(new Currency("Franco CFP", "XPF"));
        currencyList.add(new Currency("Dólar de Trinidad y Tobago", "TTD"));
        currencyList.add(new Currency("Corona noruega", "NOK"));
        currencyList.add(new Currency("Corona sueca", "SEK"));
        currencyList.add(new Currency("Dalasi gambiano", "GMD"));
        currencyList.add(new Currency("Dinar serbio", "RSD"));
        currencyList.add(new Currency("Won norcoreano", "KPW"));
        currencyList.add(new Currency("Pataca macaense", "MOP"));
        currencyList.add(new Currency("Rupia de Mauricio", "MUR"));
        currencyList.add(new Currency("Rufiyaa maldiva", "MVR"));
        currencyList.add(new Currency("Kwacha malauí", "MWK"));
        currencyList.add(new Currency("Ringgit malayo", "MYR"));
        currencyList.add(new Currency("Ariary malgache", "MGA"));
        currencyList.add(new Currency("Dirham de los Emiratos Árabes Unidos", "AED"));
        currencyList.add(new Currency("Tolar esloveno", "SIT"));
        currencyList.add(new Currency("Denar macedonio", "MKD"));
        currencyList.add(new Currency("Kuna croata", "HRK"));
        // Añade el resto de las monedas aquí...

        currencies = FXCollections.observableArrayList(currencyList);

        fromCurrencyComboBox = new ComboBox<>(currencies);
        fromCurrencyComboBox.setPromptText("From Currency");

        toCurrencyComboBox = new ComboBox<>(currencies);
        toCurrencyComboBox.setPromptText("To Currency");

        amountField = new TextField();
        amountField.setPromptText("Amount");

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> convertCurrency());

        resultText = new Text();

        getChildren().addAll(fromCurrencyComboBox, toCurrencyComboBox, amountField, convertButton, resultText);
    }

    private void convertCurrency() {
        String fromCurrencyCode = fromCurrencyComboBox.getValue().getCode();
        String toCurrencyCode = toCurrencyComboBox.getValue().getCode();
        double amount = Double.parseDouble(amountField.getText());

        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://localhost:8080/api/currency/convert?fromCurrency=" + fromCurrencyCode + "&toCurrency=" + toCurrencyCode + "&amount=" + amount)
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
