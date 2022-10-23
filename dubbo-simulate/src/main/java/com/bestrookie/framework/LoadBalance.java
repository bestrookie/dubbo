package com.bestrookie.framework;

import java.util.List;
import java.util.Random;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 21:04
 */
public class LoadBalance {

    public static URL random(List<URL> list){
        Random random = new Random();
        int n = random.nextInt(list.size());
        return list.get(n);
    }
}
