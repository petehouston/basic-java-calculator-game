package com.petehouston.java.operator;

public class MultiplyOperator implements OperatorInterface {
    public static final String SIGN = "x";

    public String getSign() {
        return SIGN;
    }

    public int execute(int x, int y) {
        return x * y;
    }
}
