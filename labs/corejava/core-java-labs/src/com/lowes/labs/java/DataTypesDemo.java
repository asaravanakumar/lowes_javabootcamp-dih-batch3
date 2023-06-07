package com.lowes.labs.java;

public class DataTypesDemo {
    static final byte id = 100; // 1 byte

    public static void main(String[] args) {
        // -128 to 127 = 256 = 2^8
        //id = 101;
        short id1 = 1000; // 2 bytes = 2^16
        int id2 = 65000; // 4 bytes = 2^32
        long id3 = 1000000000; // 8 bytes = 2^64

        float price = 30.5f;
        double salary = 50000.50;
        boolean isActive = true;
        char active = 'Y';

        String company = "Lowes";

        System.out.println(id);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);

        System.out.println(price);
        System.out.println(salary);
        System.out.println(isActive);
        System.out.println(active);

        System.out.println(company);


    }
}
