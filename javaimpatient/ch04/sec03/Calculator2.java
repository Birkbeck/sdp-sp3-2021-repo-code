package ch04.sec03;

import java.util.Scanner;

public class Calculator2 {
    

    public static int eval(Operation op, int arg1, int arg2) {
        int result = 0;
        switch (op) {
            case ADD: result = arg1 + arg2; break;
            case SUBTRACT: result = arg1 - arg2; break;
            case MULTIPLY: result = arg1 * arg2; break;
            case DIVIDE: result = arg1 / arg2; break;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First operand: ");
        int a = in.nextInt();
        System.out.print("Operator: ");
        String opSymbol = in.next();
        System.out.print("Second operand: ");
        int b = in.nextInt();
        for (Operation op : Operation.values()) {
            if (op.getSymbol().equals(opSymbol)) {
                System.out.println(eval(op, a, b));
            } 
        }
    }
}
