package com.petehouston.java.operator;

public class AddOperator implements OperatorInterface {

    public static final String SIGN = "+";

    public String getSign() {
        return SIGN;
    }

    public int execute(int x, int y) {
        return x + y;
    }
}
