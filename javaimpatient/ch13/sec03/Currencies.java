package ch13.sec03;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Set;

public class Currencies {
    public static void main(String[] args) {
        NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat euroFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        double exchangeRate = 0.8;
        double dollars = 10000;
        double euros = dollars * exchangeRate;
        System.out.println("You paid " + dollarFormatter.format(dollars));
        System.out.println("You received " + euroFormatter.format(euros));
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("You paid " + formatter.format(dollars));
        formatter.setCurrency(Currency.getInstance("EUR"));
        System.out.println("You received " + formatter.format(euros));
        
        Set<Currency> currencies = Currency.getAvailableCurrencies();
        Locale loc = Locale.GERMAN;
        for (Currency currency : currencies) {
            System.out.printf("%s = %s (%s)\n",
                    currency.getSymbol(),
                    currency.getDisplayName(), 
                    currency.getDisplayName(loc));
        }
    }
}
