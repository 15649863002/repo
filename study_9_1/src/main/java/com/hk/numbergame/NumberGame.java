package com.hk.numbergame;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class NumberGame {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader gameFile = new FileReader("D:\\IdeaProjects\\study_9_1\\game.txt");
        properties.load(gameFile);
        gameFile.close();

        //获取游戏次数
        int count = Integer.parseInt(properties.getProperty("count"));
        if (count<3){
            GuessNumber guessNumber = new GuessNumber();
            guessNumber.setNumber();

            count++;
            FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\study_9_1\\game.txt");
            properties.setProperty("count",String.valueOf(count));
            properties.store(fileWriter,null);
            fileWriter.close();
        }else{
            System.out.println("三次免费体验已用完，请充值后再玩");
        }
    }
}
