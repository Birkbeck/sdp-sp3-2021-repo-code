package ch09.sec01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("alice.txt");
        try (InputStream in = Files.newInputStream(path)) {
            int firstByte = in.read();
            System.out.println("First byte: " + firstByte);
            byte[] moreBytes = new byte[1_000_000];
            int bytesRead = in.read(moreBytes);
            System.out.println("Bytes read: " + bytesRead);            
        }
        
        byte[] allBytes = Files.readAllBytes(path);
        String contents = new String(allBytes, StandardCharsets.UTF_8);
        System.out.println(contents.substring(0, 50) + "...");

        byte[] helloBytes = { 72, 101, 108, 108, 111, 10 };
        path = Paths.get("test.txt");
        try (OutputStream out = Files.newOutputStream(path)) {
            out.write(helloBytes);
        }
        
        URL url = new URL("http://horstmann.com/index.html");
        try (InputStream in = url.openStream()) {
            Files.copy(in, Paths.get("index.html"), StandardCopyOption.REPLACE_EXISTING);
        }
        
        InputStream in = new ByteArrayInputStream(helloBytes);
        int n;
        do {
            n = in.read();
            System.out.println(n);
        } while (n != -1); 

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(helloBytes);    
        byte[] bytes = out.toByteArray();
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
    }
}
