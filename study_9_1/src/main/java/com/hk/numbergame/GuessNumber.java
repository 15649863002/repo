package com.hk.numbergame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public GuessNumber() {
    }
    public void setNumber() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("请输入所猜数字：");
            int guessNumber = reader.nextInt();
            if (guessNumber == number) {
                System.out.println("答案正确！");
                break;
            } else {
                if (guessNumber < number) {
                    System.out.println("您所输入的数字小了！");
                } else {
                    System.out.println("您所输入的数字大了");
                }
            }
        }
    }
}
