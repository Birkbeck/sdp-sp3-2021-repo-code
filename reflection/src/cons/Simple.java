package cons;

/*
 * Simple class is just take - a class with some fields and an appropriate constructor
 * with a toString to print out the variables
 */
class Simple {
    private String first;
    private String second;
    private int third;
    private String fourth;

    public Simple(String first, String second, Integer third, String fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First: ").append(first)
            .append(", Second: ").append(second)
            .append(", Third: ").append(third)
            .append(", Fourth: ").append(fourth);
        return sb.toString();
    }
}