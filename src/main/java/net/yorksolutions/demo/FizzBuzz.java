package net.yorksolutions.demo;

/*
If a number is divisible by 3, the student says “fizz” rather than the number.
If a number is divisible by 5, they say “buzz” rather than the number.
If a number is divisible by both, they say “fizz buzz”
 */

public class FizzBuzz {
    int num;
    static int foo = 50;

    public FizzBuzz(int num) {
        this.num = num;
    }

    public String play() {
        boolean isD5 = this.num % 5 == 0;
        boolean isD3 = this.num % 3 == 0;

        if (isD5 && isD3) {
            return "fizz buzz";
        }
        if (isD5) {
            return "buzz";
        }
        if (isD3) {
            return "fizz";
        }

        return Integer.toString(this.num);
    }

    public static String staticPlay(int num) {
        boolean isD5 = num % 5 == 0;
        boolean isD3 = num % 3 == 0;

        if (isD5 && isD3) {
            return "fizz buzz";
        }
        if (isD5) {
            return "buzz";
        }
        if (isD3) {
            return "fizz";
        }

        return Integer.toString(num);
    }
}
