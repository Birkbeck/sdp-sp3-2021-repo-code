package ch09.sec01;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharsetDemo {
    public static void main(String[] args) {
        System.out.println("Default charset on this computer: " + Charset.defaultCharset());
        System.out.println("Available charsets on this JVM: " + Charset.availableCharsets().keySet());
        
        String str = "Java\u2122";
        System.out.println(str);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        showBytes(bytes);
            // Note that the trademark character takes three bytes
        showBytes(str.getBytes(StandardCharsets.UTF_16));
            // Note the byte order mark
        showBytes(str.getBytes(StandardCharsets.ISO_8859_1));
            // The trademark character can't be encoded and becomes a ?
        
        System.out.println(new String(bytes, Charset.forName("windows-1252")));
            // How can you tell this was the wrong encoding? How could a program tell?
    }
    
    public static void showBytes(byte[] bytes) {
        for (byte b : bytes) System.out.printf("%2X ", b);
        System.out.println();
    }
}
