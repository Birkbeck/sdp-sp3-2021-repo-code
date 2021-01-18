package ch11.sec01;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

@Target(ElementType.TYPE_USE) @interface NonNull {}
@Target(ElementType.TYPE_USE) @interface Localized {}

public abstract class TypeUseAnnotations {
    List<@NonNull String> entries;
    Comparator<?> comp = Comparator.<@NonNull String> reverseOrder();
    @NonNull String[][] words;
    String @NonNull [][] moreWords;
    String[] @NonNull [] evenMoreWords;
    class Warning extends @Localized Message {}
    
    public static String text = new @Localized String("");
    public static String moreText = (@Localized String) "";
    public static String evenMoreText = text instanceof @Localized String ? text : null;
    public String read() throws @Localized IOException { return null; }
    
    public class Message { public String getText() { return ""; } }
    List<@Localized ? extends Message> warnings;
    List<? extends @Localized Message> greetings;
    Function<Message, String> fun = @Localized Message::getText;
}