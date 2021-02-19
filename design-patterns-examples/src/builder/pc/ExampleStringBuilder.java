package builder.pc;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        String s = new StringBuilder().append("The ")
            .append(" strange ")
            .append(" string")
            .toString();
        System.out.println(s);
    }
}
