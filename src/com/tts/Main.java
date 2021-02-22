package com.tts;

public class Main {

    public static void main(String[] args) {
        talk();

        String string = new String("I'm a Lambda, not a LLama!");
        final Runnable runnable = () -> {
            System.out.println(string);
        };
        runnable.run();

    }


    public static void talk() {
        StringFunction exclaim = (s) -> {
            System.out.println(s + "!");
        };
        StringFunction ask = (s) -> {
            System.out.println(s + "?");
        };
        exclaim.printFormatted("Hello");
        ask.printFormatted("Hello");
    }

    public static String printFormatted(String str) {
//        String result = format.run(str);
        //System.out.println();
        return str;

    }


}
