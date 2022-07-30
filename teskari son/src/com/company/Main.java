package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 12345; // berilgan son
        int temp;
        int reverseNum = 0;
        for (; n != 0; ) {
            temp = n % 10;
            reverseNum = reverseNum * 10 + temp;

            n = n / 10;
        }

        System.out.println(reverseNum);

    }
}
