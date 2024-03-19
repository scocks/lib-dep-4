package org.king.libdep4;
public class Library {
    public String[] count(Integer number) {
        String[] lines = new String[number];
        for (int i = 0; i < number; i++) {
            lines[i] = "i = " + i;
        }
        return lines;
    }
    public String greet(String name) {
        return "Hej, " + name + "!";
    }
}