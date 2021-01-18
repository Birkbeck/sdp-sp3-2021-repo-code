package ch13.sec06;

import java.text.MessageFormat;
import java.time.Instant;
import java.util.Date;

public class MessageFormatDemo {
    public static void main(String[] args) {
        String message = MessageFormat.format("Hello, it is now {0,time,short}.", Date.from(Instant.now()));
        System.out.println(message);
        
        String template = "{0,choice,0#No files|1#1 file|2#{0} files} copied";
        System.out.println(MessageFormat.format(template, 0));
        System.out.println(MessageFormat.format(template, 1));
        System.out.println(MessageFormat.format(template, 42));
        System.out.println(MessageFormat.format(template, -1)); // First limit is ignored!
    }

}
