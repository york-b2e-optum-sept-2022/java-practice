package net.yorksolutions.demo;

public class HelloWorld {
    // TS VERSION
    // name: string;
    private String name;

    // TS VERSION
    // num1: number = 1;
    // num2: number = 1.15;
    private int num1 = 1;
    private double num2 = 1.15;


    // TS
    /*
        constructor() {
            // some code
        }
     */

    // THE NAME OF THE CONSTRUCTOR MUST MACH THE NAME OF THE CLASS!!!!
    public HelloWorld() {

    }


    // TS
    /*
        greet():string {
            return 'hello';
        }
     */
    String greet() {
        return "hello";
    }
}
