package com.example.designpattern.factory;

/**
 * 女娲
 */
public class NvWa {

    public static void main(String[] args) {

        final Human whiteHuman = HumanFactory.creatHuman(WhiteHuman.class);
//        whiteHuman.cry();
//        whiteHuman.laugh();
//        whiteHuman.talk();


        for (int i = 0; i < 10; i++) {
            final Human human = HumanFactory.creatHuman();
            human.talk();
        }
    }
}
