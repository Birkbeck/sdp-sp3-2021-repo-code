package ch09.sec03;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://codecheck.it/check");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("Accept-Charset", "UTF-8");
        connection.setDoOutput(true);
        try (Writer out = new OutputStreamWriter(
                connection.getOutputStream(), "UTF-8")) {
            Map<String, String> postData = new HashMap<>();
            
            postData.put("repo", "bj4cc");
            postData.put("problem", "ch06/c06_exp_6_105");
            postData.put("level", "1");
            postData.put("Numbers.java", solution);
            boolean first = true;
            for (Map.Entry<String, String> entry : postData.entrySet()) {
                if (first) first = false;
                else out.write("&");
                out.write(URLEncoder.encode(entry.getKey(), "UTF-8"));
                out.write("=");
                out.write(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        }
        
        Map<String, List<String>> headers = connection.getHeaderFields();
        System.out.println("Response headers: " + headers);
        try (InputStream in = connection.getInputStream()) {
            String contents = new String(readAllBytes(in));
            System.out.println(contents);
        }
    }
    
    public static byte[] readAllBytes(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        copy(in, out);
        return out.toByteArray();
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        final int BLOCKSIZE = 1024;
        byte[] bytes = new byte[BLOCKSIZE];
        int len;
        while ((len = in.read(bytes)) != -1) out.write(bytes, 0, len);
        in.close();
        out.close();
    }
    
    public static String solution = "public class Numbers {\n" + 
            "    public int countSevens(int n) {\n" + 
            "        int r = 0;\n" + 
            "        while (n > 0) {\n" + 
            "            if (n % 10 == 7) r++;\n" + 
            "            n /= 10;\n" + 
            "        }\n" + 
            "        return r;\n" +
            "    }" +
            "}";
}
