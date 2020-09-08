package com.zuitt.app;

public class Pencil {
    int gradingScale;
    String brand;
    String color;

    int maxWritable = 100;
    int remainingWritable = 100;

    int maxErasable = 100;
    int remainingErasable = 100;

    public void erase(String text) {
        int charCount = text.length();
        int multiplier = 2;
        int newCharCount = charCount*multiplier;

        System.out.println("You erase ("+ text + ") with " + charCount + " characters.");
        remainingErasable -= newCharCount;
    }

    public void write(String text) {
        text = text.replace(" ","");
        int charCount = text.length();

        System.out.println("You write ("+ text + ") with " + charCount + " characters.");
        remainingWritable -= charCount;
    }

    public void getRemainingWritable() {
        System.out.println("Your remaining writes are " + remainingWritable + ".");
    }

    public void getRemainingErasable() {
        System.out.println("Your remaining erases are " + remainingErasable + ".");
    }
}
