package com.example.designpattern.factory;

import java.util.List;
import java.util.Random;

/**
 * 造人工厂
 */
public class HumanFactory {

    public static Human creatHuman(Class c){
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到！");
        }
        return human;
    }

    public static Human creatHuman(){
        final List<Class> allClassByInterface = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        final int i = random.nextInt(allClassByInterface.size());
        return creatHuman(allClassByInterface.get(i));
    }
}
