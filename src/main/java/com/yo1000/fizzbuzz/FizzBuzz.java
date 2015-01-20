package com.yo1000.fizzbuzz;

/**
 * Created by yoichi.kikuchi on 15/01/18.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().run();
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(this.getMessage(i));
        }
    }

    protected String getMessage(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "ＦｉｚｚＢｕｚｚ";
        }

        if (number % 3 == 0) {
            return "Ｆｉｚｚ";
        }

        if (number % 5 == 0) {
            return "Ｂｕｚｚ";
        }

        StringBuilder builder = new StringBuilder();
        for(char c : ((Integer) number).toString().toCharArray())
            builder.append((char) ('０' + c - '0'));
        return builder.toString();
    }
}
