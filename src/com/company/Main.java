package com.company;

public class Main {

    public static void main(String[] args) {

        int targetNum = 10;
        int sum = 0;

        for (int counter = 1; counter < targetNum; counter++) {
            if(counter % 3 == 0 || counter % 5 == 0) {
                sum+=counter;
                //System.out.println("The number " + counter + " is divisible by 3 or 5.");
            } else {
                //System.out.println("The number " + counter + " is not divisible.");
            }
        }
        System.out.println("The sum is " + sum + ".");
    }
}
