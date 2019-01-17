package com.company;

public class Main {

    public static void main(String[] args) {

        int targetNum = 1000;
        int sum = 0;

        for (int counter = 1; counter < targetNum; counter++) {
            if(counter % 3 == 0 || counter % 5 == 0) {
                sum+=counter;
            } else {
            }
        }
        System.out.println("The sum is " + sum + ".");
    }
}
