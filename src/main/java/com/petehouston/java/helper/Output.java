package com.petehouston.java.helper;

public class Output {
    public Output() {}

    public void wl(String s) {
        System.out.println(s);
    }

    public void w(String s) {
        System.out.print(s);
    }

    public void f(String s, boolean newLine, Object... args) {
        System.out.format(s + (newLine ? "\n" : ""), args);
    }
}
