package com.petehouston.java.operator;

import com.petehouston.java.NumberGenerator;

public class OperatorFactory {

    private final OperatorInterface[] operators = new OperatorInterface[] {
        new AddOperator(),
        new SubstractOperator(),
        new MultiplyOperator(),
        new DivisionOperator()
    };

    private static final OperatorFactory INSTANCE = new OperatorFactory();

    public static OperatorFactory getInstance() {
        return INSTANCE;
    }

    private final NumberGenerator generator = new NumberGenerator(0, 3);

    private OperatorFactory() {}

    public OperatorInterface getOperator() {
        return operators[generator.yield()];
    }
}
