package ch03.sec07;

public class ScopeDemo {
    public static void main(String[] args) {
        repeatMessage("Hello", 10);
        
        
        for (String a : args) 
            new Thread(() -> System.out.println(a));
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
}
