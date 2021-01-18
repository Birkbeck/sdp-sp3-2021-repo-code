package ch14.sec01;

import java.net.URI;

import javax.tools.SimpleJavaFileObject;

public class StringSource extends SimpleJavaFileObject {
    private String code;
 
    StringSource(String name, String code) {
        super(URI.create("string:///" + name.replace('.','/') + ".java"),
              Kind.SOURCE);
        this.code = code;
    }

    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return code;
    }
}