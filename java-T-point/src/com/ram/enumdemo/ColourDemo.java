package com.ram.enumdemo;

public class ColourDemo {
    public static void main(String args[]) {
        int code = getColourCode(Colour.Blue);
        System.out.println(code);
        Colour c = Colour.Red;
        Colour[] values = Colour.values();
        for(Colour value : values){
            System.out.println(value);
        }

    }

    private static int getColourCode(Colour colour) {
        if (colour == Colour.Red) return 1;
        else if (colour == Colour.Green) return 2;
        else return 3;
    }
}
