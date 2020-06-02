package com.petehouston.java;

import com.petehouston.java.helper.Output;
import com.petehouston.java.operator.OperatorFactory;
import com.petehouston.java.operator.OperatorInterface;

import java.util.Scanner;

public class Game {

    private NumberGenerator numberGenerator;
    private OperatorFactory operatorFactory;
    private Output o;
    private Scanner scanner;

    public Game() {
        init();
    }

    private void init() {
        this.numberGenerator = new NumberGenerator(0, 9);
        this.operatorFactory = OperatorFactory.getInstance();
        this.o = new Output();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        o.wl("Welcome to Calculator Game");
        o.wl("--------------------------");

        do {
            int x = numberGenerator.yield();
            int y = numberGenerator.yield();
            OperatorInterface ops = operatorFactory.getOperator();
            int expected = ops.execute(x, y);

            // ask user
            o.f("%d %s %d = ", false, x, ops.getSign(), y);
            int userAnswer = scanner.nextInt();

            if (userAnswer == expected) {
                o.wl("Correct!");
            } else {
                o.wl("Incorrect! The correct answer should be: " + expected);
            }

            o.w("Do you want to continue? (y/n): ");
            String cont = scanner.next();
            if (!cont.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);

        scanner.close();

        o.wl("Bye bye!");
    }
}
