package ch13.sec08;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Locale;

public class CharacterEncodings {
    public static void main(String[] args) {
        Charset platformEncoding = Charset.defaultCharset();
        System.out.println("Your platform encoding: " + platformEncoding);
        
        Collection<Charset> availableCharset = Charset.availableCharsets().values();
        Locale locale = Locale.getDefault();
        for (Charset charset: availableCharset) {        
            String displayName = charset.displayName(locale);
            System.out.println(displayName);
        }        
    }
}
