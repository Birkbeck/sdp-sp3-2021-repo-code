package ch13.sec07;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println(Locale.getDefault(Locale.Category.FORMAT));
        
        
        Locale.setDefault(Locale.Category.DISPLAY, Locale.forLanguageTag("en"));
        Locale.setDefault(Locale.Category.FORMAT, Locale.forLanguageTag("fr-FR"));
        // Locale locale = Locale.forLanguageTag("fr-FR");
        ResourceBundle res = ResourceBundle.getBundle("ch11.sec07.messages");
        String priceTemplate = res.getString("price");
        System.out.println(MessageFormat.format(priceTemplate, 19.95));
        System.out.println(res.getString("greeting"));
        System.out.println(res.getString("farewell"));
    }
}
