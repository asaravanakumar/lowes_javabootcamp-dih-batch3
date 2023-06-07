package com.lowes.labs.java;

/**
     * Calculator Program Demo
 */
public class CalcDemo {

    // global variable
 /*   static int a = 20;
    static int b = 10;
    */


    // global constant
//    static final int a = 20;
//    static final int b = 10;

    public static void main(String[] args) {
        // local variable
//        int a = 20;
//        int b = 10;

        // local constant
//        final int a = 20;
//        final int b = 10;

        if(args.length != 3)
        {
            System.out.println("Invalid No of Arguments");
            return;
        }

        // command line args
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String op = args[2]; // op == "add"
        int out = 0;



        // Addition
        /*if(op.equals("add")) {
            out = a + b;
        }

        // Subtraction
        else if(op.equals("sub"))
            out = a - b;

        // Multiplication
        else if(op.equals("mul")) out = a * b;

        // Division
        else if(op.equals("div")) {
            out = a / b;
        }
        else {
            System.out.println("Invalid Option");
            return;
        }
*/
        switch (op) {
            case "add":
                out = a + b;
                break;
            case "sub":
                out = a - b;
                break;
            case "mul":
                out = a * b;
                break;
            case "div":
                out = a / b;
                break;
            default:
                System.out.println("Invalid Option");
                return;
//                System.exit(0);
        }

        System.out.println(out);

    }
}

// java CalcDemo 10 20 add
// java CalcDemo 10 20 sub
// java CalcDemo 10 20 mul
// java CalcDemo 10 20 div
// java CalcDemo 10 20 adding