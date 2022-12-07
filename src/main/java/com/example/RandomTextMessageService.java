package com.example;

public class RandomTextMessageService implements MessageService{
    String[] messages = {"m0", "m1", "m2", "m3", "m4", "m5", "m6", "m7", "m8", "m9"};
    @Override
    public String getMessage(){
        return messages[(int) (Math.random() % 10)];
    }
}
